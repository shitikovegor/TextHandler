package com.shitikov.handling.parser.impl;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.component.impl.TextComposite;
import com.shitikov.handling.component.impl.type.ComponentType;
import com.shitikov.handling.parser.BaseParser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser implements BaseParser {
    private static final String LEXEME_PATTERN = "\\s*\\S+\\s*";
    LexemeParser lexemeParser = new LexemeParser();

    @Override
    public TextComponent parse(String text) {
        List<TextComponent> lexemes = new ArrayList<>();
        Pattern pattern = Pattern.compile(LEXEME_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String lexemeStr = matcher.group();
            TextComponent lexeme = lexemeParser.parse(lexemeStr.strip());
            lexemes.add(lexeme);
        }
        TextComponent sentence = new TextComposite(lexemes, ComponentType.SENTENCE);

        return sentence;
    }
}
