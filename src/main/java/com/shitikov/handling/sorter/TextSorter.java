package com.shitikov.handling.sorter;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.component.impl.Symbol;
import com.shitikov.handling.component.impl.TextComposite;

import java.util.List;

public class TextSorter {
    private static TextSorter instance = new TextSorter();

    private TextSorter() {
    }

    public static TextSorter getInstance() {
        return instance;
    }

    public void sortParagraphsBySentenceNumber(TextComponent component) {
        component.getComponents().sort(new TextComposite.ComponentNumberComparator());
    }

    public void sortSentencesByWordLength(TextComponent component) {
        List<TextComponent> paragraphs = component.getComponents();
        for (int i = 0; i < paragraphs.size(); i++) {
            List<TextComponent> sentences = paragraphs.get(i).getComponents();
            for (int j = 0; j < sentences.size(); j++) {
                sentences.get(j).getComponents().sort(new TextComposite.WordLengthComparator());
            }
        }
    }

    public void sortSentencesByLexemeLength(TextComponent component) {
        List<TextComponent> paragraphs = component.getComponents();
        for (int i = 0; i < paragraphs.size(); i++) {
            List<TextComponent> sentences = paragraphs.get(i).getComponents();
            for (int j = 0; j < sentences.size(); j++) {
                sentences.get(j).getComponents().sort(new TextComposite.ComponentNumberComparator());
            }
        }
    }

    public void sortLexemesBySymbol(TextComponent component, char symbol) {
        List<TextComponent> paragraphs = component.getComponents();
        for (int i = 0; i < paragraphs.size(); i++) {
            List<TextComponent> sentences = paragraphs.get(i).getComponents();
            for (int j = 0; j < sentences.size(); j++) {
                List<TextComponent> lexemes = sentences.get(j).getComponents();
                lexemes.sort(new TextComposite.LexemeComparator());
                for (int k = 1; k < lexemes.size(); k++) {
                    TextComponent lexemeK = lexemes.get(k);
                    int value = charNumber(lexemeK, symbol);
                    int l = k - 1;

                    while (l >= 0 && charNumber(lexemes.get(l), symbol) < value) {
                        lexemes.set(l + 1, lexemes.get(l));
                        l--;
                    }
                    lexemes.set(l + 1, lexemeK);
                }
            }
        }

    }

    private int charNumber(TextComponent lexeme, char symbol) {
        int charNumber = 0;
        List<TextComponent> symbols = lexeme.getComponents();
        for (int i = 0; i < symbols.size(); i++) {
            Symbol element = (Symbol) symbols.get(i);
            charNumber += (element.getSymbol() == symbol)
                    ? 1 : 0;
        }
        return charNumber;
    }
}
