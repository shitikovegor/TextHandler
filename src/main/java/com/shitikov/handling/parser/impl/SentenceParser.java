package com.shitikov.handling.parser.impl;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.component.impl.TextComposite;
import com.shitikov.handling.component.impl.type.ComponentType;
import com.shitikov.handling.interpreter.ExpressionInterpreter;
import com.shitikov.handling.interpreter.impl.ExpressionInterpreterImpl;
import com.shitikov.handling.parser.BaseParser;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser implements BaseParser {
    private static final String LEXEME_PATTERN = "\\s*\\S+\\s*";
    private static final String EXPRESSION_PATTERN = "\\(*\\-*\\d+[\\d+ij\\-\\+\\*\\/\\s\\(\\)\\.]+\\d+\\)*";
    private static Logger logger = LogManager.getLogger();
    LexemeParser lexemeParser = new LexemeParser();

    @Override
    public TextComponent parse(String text) {
        List<TextComponent> lexemes = new ArrayList<>();

        ExpressionInterpreter interpreter = new ExpressionInterpreterImpl();
        Pattern expressionPattern = Pattern.compile(EXPRESSION_PATTERN);
        Matcher expressionMatcher = expressionPattern.matcher(text);

        StringBuilder calculatedSentence = new StringBuilder(text);

        int length = 0;
        while (expressionMatcher.find()) {
            String calculatedExpression = interpreter.evaluateExpression(expressionMatcher.group());
            calculatedSentence.replace(expressionMatcher.start() - length,
                    expressionMatcher.end() - length, calculatedExpression);
            length = length + calculatedExpression.length() + 1;
        }
        Pattern pattern = Pattern.compile(LEXEME_PATTERN);
        Matcher matcher = pattern.matcher(calculatedSentence);

        while (matcher.find()) {
            String lexemeStr = matcher.group();
            TextComponent lexeme = lexemeParser.parse(lexemeStr.strip());
            lexemes.add(lexeme);
        }
        TextComponent sentence = new TextComposite(lexemes, ComponentType.SENTENCE);
        logger.log(Level.INFO, "TextComponent SENTENCE created: {}", sentence);

        return sentence;
    }
}
