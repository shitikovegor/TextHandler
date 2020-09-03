package com.shitikov.handling.parser.impl;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.component.impl.Symbol;
import com.shitikov.handling.component.impl.TextComposite;
import com.shitikov.handling.component.impl.type.ComponentType;
import com.shitikov.handling.component.impl.type.SymbolType;
import com.shitikov.handling.parser.BaseParser;

import java.util.ArrayList;
import java.util.List;

public class LexemeParser implements BaseParser {

    @Override
    public TextComponent parse(String text) {
        List<TextComponent> symbols = new ArrayList<>();
        char[] chars = text.toCharArray();
        for (char element : chars) {
            SymbolType type = (Character.isLetterOrDigit(element))
                    ? SymbolType.LETTER : SymbolType.PUNCTUATION;
            Symbol symbol = new Symbol(element, type);
            symbols.add(symbol);
        }
        TextComponent lexeme = new TextComposite(symbols, ComponentType.LEXEME);
        return lexeme;
    }
}
