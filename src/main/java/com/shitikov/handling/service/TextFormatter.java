package com.shitikov.handling.service;

import com.shitikov.handling.exception.ProjectException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormatter {
    private static final String VARIABLE_PATTERN = "\\W(?<var>(--)?(\\+\\+)?[ij](--)?(\\+\\+)?)\\W";
    private static final int VARIABLE_LENGTH = 2;

    private static TextFormatter instance = new TextFormatter();

    private TextFormatter() {
    }

    public static TextFormatter getInstance() {
        return instance;
    }

    public String replaceVariable(String input, Map<Character, Integer> variables) throws ProjectException {
        Pattern pattern = Pattern.compile(VARIABLE_PATTERN);
        Matcher matcher = pattern.matcher(input);
        int i = variables.get('i');
        int j = variables.get('j');
        int replaceLength = 0;
        StringBuilder inputCalculatedVariables = new StringBuilder(input);
        int variable = 0;

        while (matcher.find()) {
            String foundVariable = matcher.group("var");
            variable = switch (foundVariable) {
                case "--i" -> --i;
                case "i--" -> i--;
                case "++i" -> ++i;
                case "i++" -> i++;
                case "--j" -> --j;
                case "j--" -> j--;
                case "++j" -> ++j;
                case "j++" -> j++;
                default -> throw new ProjectException("Unexpected value: " + foundVariable);
            };
            inputCalculatedVariables.replace(matcher.start("var") - replaceLength,
                    matcher.end("var") - replaceLength,
                    String.valueOf(variable));
            replaceLength = replaceLength + VARIABLE_LENGTH;
        }
        variables.replace('i', i);
        variables.replace('j', j);

        return inputCalculatedVariables.toString();
    }
}


