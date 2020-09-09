package com.shitikov.handling.parser.impl;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.component.impl.TextComposite;
import com.shitikov.handling.component.impl.type.ComponentType;
import com.shitikov.handling.parser.BaseParser;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser implements BaseParser {
    private static final String SENTENCE_PATTERN = "(\\p{Alpha}*[',\\-\\(\\)\\*\\/\\+]*\\p{Digit}*\\s*)+[.\\u2026?!]";
    private static Logger logger = LogManager.getLogger();
    SentenceParser sentenceParser = new SentenceParser();

    @Override
    public TextComponent parse(String text) {
        List<TextComponent> sentences = new ArrayList<>();
        Pattern pattern = Pattern.compile(SENTENCE_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String sentenceStr = matcher.group();
            TextComponent sentence = sentenceParser.parse(sentenceStr.strip());
            sentences.add(sentence);
        }
        TextComponent paragraph = new TextComposite(sentences, ComponentType.PARAGRAPH);
        logger.log(Level.INFO, "TextComponent PARAGRAPH created: {}", paragraph);

        return paragraph;
    }
}
