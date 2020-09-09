package com.shitikov.handling.parser.impl;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.component.impl.Symbol;
import com.shitikov.handling.component.impl.TextComposite;
import com.shitikov.handling.component.impl.type.ComponentType;
import com.shitikov.handling.component.impl.type.SymbolType;
import com.shitikov.handling.parser.BaseParser;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class LexemeParser implements BaseParser {
    private static Logger logger = LogManager.getLogger();

    @Override
    public TextComponent parse(String text) {
        List<TextComponent> symbols = new ArrayList<>();
        char[] chars = text.toCharArray();
        SymbolType type;
        for (char element : chars) {
            if (Character.isLetter(element)) {
                type = SymbolType.LETTER;
            } else if (Character.isDigit(element)) {
                type = SymbolType.DIGIT;
            } else {
                type = SymbolType.PUNCTUATION;
            }
            Symbol symbol = new Symbol(element, type);
            symbols.add(symbol);
        }
        TextComponent lexeme = new TextComposite(symbols, ComponentType.LEXEME);
        logger.log(Level.INFO, "TextComponent LEXEME created: {}", lexeme);
        return lexeme;
    }
}
