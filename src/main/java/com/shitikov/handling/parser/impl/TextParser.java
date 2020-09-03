package com.shitikov.handling.parser.impl;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.component.impl.TextComposite;
import com.shitikov.handling.component.impl.type.ComponentType;
import com.shitikov.handling.parser.BaseParser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser implements BaseParser {
    private static final String PARAGRAPH_PATTERN = "\\t[^\\t]+";
    ParagraphParser paragraphParser = new ParagraphParser();

    @Override
    public TextComponent parse(String text) {
        List<TextComponent> paragraphs = new ArrayList<>();
        Pattern pattern = Pattern.compile(PARAGRAPH_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String paragraphStr = matcher.group();
            TextComponent paragraph = paragraphParser.parse(paragraphStr.strip());
            paragraphs.add(paragraph);
        }
        TextComponent textComponent = new TextComposite(paragraphs, ComponentType.TEXT);

        return textComponent;
    }
}
