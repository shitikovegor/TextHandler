package com.shitikov.handling.parser.impl;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.component.impl.TextComposite;
import com.shitikov.handling.component.impl.type.ComponentType;
import com.shitikov.handling.exception.ProjectException;
import com.shitikov.handling.parser.BaseParser;
import com.shitikov.handling.service.TextFormatter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser implements BaseParser {
    private static final String PARAGRAPH_PATTERN = "\\t[^\\t]+";
    private static Logger logger = LogManager.getLogger();
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
        logger.log(Level.INFO, "TextComponent TEXT created: {}", textComponent);

        return textComponent;
    }

    public TextComponent parseWithVariables(String text, int i, int j) {
        TextFormatter formatter = TextFormatter.getInstance();
        Map<Character, Integer> variables = new HashMap<>();
        variables.put('i', i);
        variables.put('j', j);
        String formattedVariables;
        try {
            formattedVariables = formatter.replaceVariable(text, variables);
        } catch (ProjectException e) {
            logger.log(Level.ERROR, "Error in time of formatting. ", e);
            formattedVariables = text;
        }

        TextComponent textComponent = parse(formattedVariables);
        logger.log(Level.INFO, "TextComponent TEXT created: {}", textComponent);

        return textComponent;
    }
}
