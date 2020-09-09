package com.shitikov.handling.dataprovider;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.component.impl.Symbol;
import com.shitikov.handling.component.impl.TextComposite;
import com.shitikov.handling.component.impl.type.ComponentType;
import com.shitikov.handling.component.impl.type.SymbolType;

import java.util.ArrayList;
import java.util.List;

public class TextData {
    public static final String INPUT_TEXT;
    public static final String INPUT_TEXT_VARIABLE;
    public static final int INDEX_I = 4;
    public static final int INDEX_J = 2;
    public static final TextComponent TEXT;
    public static final List<TextComponent> PARAGRAPHS;
    public static final TextComponent PARAGRAPH_1;
    public static final TextComponent PARAGRAPH_2;
    public static final TextComponent PARAGRAPH_3;
    public static final TextComponent SENTENCE_1;
    public static final TextComponent SENTENCE_2;
    public static final TextComponent SENTENCE_3;
    public static final TextComponent SENTENCE_4;
    public static final TextComponent LEXEME_1;
    public static final TextComponent LEXEME_2;
    public static final TextComponent LEXEME_3;
    public static final TextComponent LEXEME_4;
    public static final TextComponent LEXEME_5;
    public static final TextComponent LEXEME_6;
    public static final TextComponent LEXEME_7;
    public static final TextComponent LEXEME_8;
    public static final TextComponent LEXEME_9;
    public static final TextComponent LEXEME_10;
    public static final TextComponent LEXEME_11;
    public static final TextComponent LEXEME_12;
    public static final TextComponent SYMBOL_1;
    public static final TextComponent SYMBOL_2;
    public static final TextComponent SYMBOL_3;
    public static final TextComponent SYMBOL_4;
    public static final TextComponent SYMBOL_5;
    public static final TextComponent SYMBOL_6;
    public static final TextComponent SYMBOL_7;
    public static final TextComponent SYMBOL_8;
    public static final TextComponent SYMBOL_9;
    public static final TextComponent SYMBOL_10;
    public static final TextComponent SYMBOL_11;
    public static final TextComponent SYMBOL_12;
    public static final TextComponent SYMBOL_13;
    public static final TextComponent SYMBOL_14;
    public static final TextComponent SYMBOL_15;
    public static final TextComponent SYMBOL_16;
    public static final TextComponent SYMBOL_17;
    public static final TextComponent SYMBOL_18;
    public static final TextComponent SYMBOL_19;
    public static final TextComponent SYMBOL_20;
    public static final TextComponent SYMBOL_21;
    public static final TextComponent SYMBOL_22;
    public static final TextComponent SYMBOL_23;
    public static final TextComponent SYMBOL_24;
    public static final TextComponent SYMBOL_25;
    public static final TextComponent SYMBOL_26;
    public static final TextComponent SYMBOL_27;
    public static final TextComponent SYMBOL_28;
    public static final TextComponent SYMBOL_29;
    public static final TextComponent SYMBOL_30;
    public static final TextComponent SYMBOL_31;
    public static final TextComponent SYMBOL_32;
    public static final TextComponent SYMBOL_33;
    public static final TextComponent SYMBOL_34;
    public static final TextComponent SYMBOL_35;
    public static final TextComponent SYMBOL_36;
    public static final TextComponent SYMBOL_37;
    public static final TextComponent SYMBOL_38;
    public static final TextComponent SYMBOL_39;
    public static final TextComponent SYMBOL_40;
    public static final TextComponent SYMBOL_41;
    public static final TextComponent SYMBOL_42;
    public static final TextComponent SYMBOL_43;

    static {
        INPUT_TEXT = "\tIt has survived 3+5.\tIt is reader, (1+2) *3 be.\tBye! Good luck\u2026";
        INPUT_TEXT_VARIABLE = "\tIt has survived --i+5.\tIt is reader, (1+ j++)*3 be.\tBye! Good luck…";

        SYMBOL_1 = new Symbol('I', SymbolType.LETTER);
        SYMBOL_2 = new Symbol('t', SymbolType.LETTER);
        SYMBOL_3 = new Symbol('h', SymbolType.LETTER);
        SYMBOL_4 = new Symbol('a', SymbolType.LETTER);
        SYMBOL_5 = new Symbol('s', SymbolType.LETTER);
        SYMBOL_6 = new Symbol('s', SymbolType.LETTER);
        SYMBOL_7 = new Symbol('u', SymbolType.LETTER);
        SYMBOL_8 = new Symbol('r', SymbolType.LETTER);
        SYMBOL_9 = new Symbol('v', SymbolType.LETTER);
        SYMBOL_10 = new Symbol('i', SymbolType.LETTER);
        SYMBOL_11 = new Symbol('v', SymbolType.LETTER);
        SYMBOL_12 = new Symbol('e', SymbolType.LETTER);
        SYMBOL_13 = new Symbol('d', SymbolType.LETTER);
        SYMBOL_14 = new Symbol('8', SymbolType.DIGIT);
        SYMBOL_15 = new Symbol('.', SymbolType.PUNCTUATION);
        SYMBOL_16 = new Symbol('I', SymbolType.LETTER);
        SYMBOL_17 = new Symbol('t', SymbolType.LETTER);
        SYMBOL_18 = new Symbol('i', SymbolType.LETTER);
        SYMBOL_19 = new Symbol('s', SymbolType.LETTER);
        SYMBOL_20 = new Symbol('r', SymbolType.LETTER);
        SYMBOL_21 = new Symbol('e', SymbolType.LETTER);
        SYMBOL_22 = new Symbol('a', SymbolType.LETTER);
        SYMBOL_23 = new Symbol('d', SymbolType.LETTER);
        SYMBOL_24 = new Symbol('e', SymbolType.LETTER);
        SYMBOL_25 = new Symbol('r', SymbolType.LETTER);
        SYMBOL_26 = new Symbol(',', SymbolType.PUNCTUATION);
        SYMBOL_27 = new Symbol('9', SymbolType.DIGIT);
        SYMBOL_28 = new Symbol('b', SymbolType.LETTER);
        SYMBOL_29 = new Symbol('e', SymbolType.LETTER);
        SYMBOL_30 = new Symbol('.', SymbolType.PUNCTUATION);
        SYMBOL_31 = new Symbol('B', SymbolType.LETTER);
        SYMBOL_32 = new Symbol('y', SymbolType.LETTER);
        SYMBOL_33 = new Symbol('e', SymbolType.LETTER);
        SYMBOL_34 = new Symbol('!', SymbolType.PUNCTUATION);
        SYMBOL_35 = new Symbol('G', SymbolType.LETTER);
        SYMBOL_36 = new Symbol('o', SymbolType.LETTER);
        SYMBOL_37 = new Symbol('o', SymbolType.LETTER);
        SYMBOL_38 = new Symbol('d', SymbolType.LETTER);
        SYMBOL_39 = new Symbol('l', SymbolType.LETTER);
        SYMBOL_40 = new Symbol('u', SymbolType.LETTER);
        SYMBOL_41 = new Symbol('c', SymbolType.LETTER);
        SYMBOL_42 = new Symbol('k', SymbolType.LETTER);
        SYMBOL_43 = new Symbol('\u2026', SymbolType.PUNCTUATION);

        List<TextComponent> lexeme1 = new ArrayList<>();
        lexeme1.add(SYMBOL_1);
        lexeme1.add(SYMBOL_2);
        LEXEME_1 = new TextComposite(lexeme1, ComponentType.LEXEME);

        List<TextComponent> lexeme2 = new ArrayList<>();
        lexeme2.add(SYMBOL_3);
        lexeme2.add(SYMBOL_4);
        lexeme2.add(SYMBOL_5);
        LEXEME_2 = new TextComposite(lexeme2, ComponentType.LEXEME);

        List<TextComponent> lexeme3 = new ArrayList<>();
        lexeme3.add(SYMBOL_6);
        lexeme3.add(SYMBOL_7);
        lexeme3.add(SYMBOL_8);
        lexeme3.add(SYMBOL_9);
        lexeme3.add(SYMBOL_10);
        lexeme3.add(SYMBOL_11);
        lexeme3.add(SYMBOL_12);
        lexeme3.add(SYMBOL_13);
        LEXEME_3 = new TextComposite(lexeme3, ComponentType.LEXEME);

        List<TextComponent> lexeme4 = new ArrayList<>();
        lexeme4.add(SYMBOL_14);
        lexeme4.add(SYMBOL_15);
        LEXEME_4 = new TextComposite(lexeme4, ComponentType.LEXEME);

        List<TextComponent> lexeme5 = new ArrayList<>();
        lexeme5.add(SYMBOL_16);
        lexeme5.add(SYMBOL_17);
        LEXEME_5 = new TextComposite(lexeme5, ComponentType.LEXEME);

        List<TextComponent> lexeme6 = new ArrayList<>();
        lexeme6.add(SYMBOL_18);
        lexeme6.add(SYMBOL_19);
        LEXEME_6 = new TextComposite(lexeme6, ComponentType.LEXEME);

        List<TextComponent> lexeme7 = new ArrayList<>();
        lexeme7.add(SYMBOL_20);
        lexeme7.add(SYMBOL_21);
        lexeme7.add(SYMBOL_22);
        lexeme7.add(SYMBOL_23);
        lexeme7.add(SYMBOL_24);
        lexeme7.add(SYMBOL_25);
        lexeme7.add(SYMBOL_26);
        LEXEME_7 = new TextComposite(lexeme7, ComponentType.LEXEME);

        List<TextComponent> lexeme8 = new ArrayList<>();
        lexeme8.add(SYMBOL_27);
        LEXEME_8 = new TextComposite(lexeme8, ComponentType.LEXEME);

        List<TextComponent> lexeme9 = new ArrayList<>();
        lexeme9.add(SYMBOL_28);
        lexeme9.add(SYMBOL_29);
        lexeme9.add(SYMBOL_30);
        LEXEME_9 = new TextComposite(lexeme9, ComponentType.LEXEME);

        List<TextComponent> lexeme10 = new ArrayList<>();
        lexeme10.add(SYMBOL_31);
        lexeme10.add(SYMBOL_32);
        lexeme10.add(SYMBOL_33);
        lexeme10.add(SYMBOL_34);
        LEXEME_10 = new TextComposite(lexeme10, ComponentType.LEXEME);

        List<TextComponent> lexeme11 = new ArrayList<>();
        lexeme11.add(SYMBOL_35);
        lexeme11.add(SYMBOL_36);
        lexeme11.add(SYMBOL_37);
        lexeme11.add(SYMBOL_38);
        LEXEME_11 = new TextComposite(lexeme11, ComponentType.LEXEME);

        List<TextComponent> lexeme12 = new ArrayList<>();
        lexeme12.add(SYMBOL_39);
        lexeme12.add(SYMBOL_40);
        lexeme12.add(SYMBOL_41);
        lexeme12.add(SYMBOL_42);
        lexeme12.add(SYMBOL_43);
        LEXEME_12 = new TextComposite(lexeme12, ComponentType.LEXEME);

        List<TextComponent> sentence1 = new ArrayList<>();
        sentence1.add(LEXEME_1);
        sentence1.add(LEXEME_2);
        sentence1.add(LEXEME_3);
        sentence1.add(LEXEME_4);
        SENTENCE_1 = new TextComposite(sentence1, ComponentType.SENTENCE);

        List<TextComponent> sentence2 = new ArrayList<>();
        sentence2.add(LEXEME_5);
        sentence2.add(LEXEME_6);
        sentence2.add(LEXEME_7);
        sentence2.add(LEXEME_8);
        sentence2.add(LEXEME_9);
        SENTENCE_2 = new TextComposite(sentence2, ComponentType.SENTENCE);

        List<TextComponent> sentence3 = new ArrayList<>();
        sentence3.add(LEXEME_10);
        SENTENCE_3 = new TextComposite(sentence3, ComponentType.SENTENCE);

        List<TextComponent> sentence4 = new ArrayList<>();
        sentence4.add(LEXEME_11);
        sentence4.add(LEXEME_12);
        SENTENCE_4 = new TextComposite(sentence4, ComponentType.SENTENCE);

        List<TextComponent> paragraph1 = new ArrayList<>();
        paragraph1.add(SENTENCE_1);
        PARAGRAPH_1 = new TextComposite(paragraph1, ComponentType.PARAGRAPH);

        List<TextComponent> paragraph2 = new ArrayList<>();
        paragraph2.add(SENTENCE_2);
        PARAGRAPH_2 = new TextComposite(paragraph2, ComponentType.PARAGRAPH);

        List<TextComponent> paragraph3 = new ArrayList<>();
        paragraph3.add(SENTENCE_3);
        paragraph3.add(SENTENCE_4);
        PARAGRAPH_3 = new TextComposite(paragraph3, ComponentType.PARAGRAPH);

        PARAGRAPHS = new ArrayList<>();
        PARAGRAPHS.add(PARAGRAPH_1);
        PARAGRAPHS.add(PARAGRAPH_2);
        PARAGRAPHS.add(PARAGRAPH_3);
        TEXT = new TextComposite(PARAGRAPHS, ComponentType.TEXT);
    }

    public static TextComponent textForSort() {
        List<TextComponent> lexeme1 = new ArrayList<>();
        lexeme1.add(SYMBOL_1);
        lexeme1.add(SYMBOL_2);
        TextComponent lexemeForSort1 = new TextComposite(lexeme1, ComponentType.LEXEME);

        List<TextComponent> lexeme2 = new ArrayList<>();
        lexeme2.add(SYMBOL_3);
        lexeme2.add(SYMBOL_4);
        lexeme2.add(SYMBOL_5);
        TextComponent lexemeForSort2 = new TextComposite(lexeme2, ComponentType.LEXEME);

        List<TextComponent> lexeme3 = new ArrayList<>();
        lexeme3.add(SYMBOL_6);
        lexeme3.add(SYMBOL_7);
        lexeme3.add(SYMBOL_8);
        lexeme3.add(SYMBOL_9);
        lexeme3.add(SYMBOL_10);
        lexeme3.add(SYMBOL_11);
        lexeme3.add(SYMBOL_12);
        lexeme3.add(SYMBOL_13);
        TextComponent lexemeForSort3 = new TextComposite(lexeme3, ComponentType.LEXEME);

        List<TextComponent> lexeme4 = new ArrayList<>();
        lexeme4.add(SYMBOL_14);
        lexeme4.add(SYMBOL_15);
        TextComponent lexemeForSort4 = new TextComposite(lexeme4, ComponentType.LEXEME);

        List<TextComponent> lexeme5 = new ArrayList<>();
        lexeme5.add(SYMBOL_16);
        lexeme5.add(SYMBOL_17);
        TextComponent lexemeForSort5 = new TextComposite(lexeme5, ComponentType.LEXEME);

        List<TextComponent> lexeme6 = new ArrayList<>();
        lexeme6.add(SYMBOL_18);
        lexeme6.add(SYMBOL_19);
        TextComponent lexemeForSort6 = new TextComposite(lexeme6, ComponentType.LEXEME);

        List<TextComponent> lexeme7 = new ArrayList<>();
        lexeme7.add(SYMBOL_20);
        lexeme7.add(SYMBOL_21);
        lexeme7.add(SYMBOL_22);
        lexeme7.add(SYMBOL_23);
        lexeme7.add(SYMBOL_24);
        lexeme7.add(SYMBOL_25);
        lexeme7.add(SYMBOL_26);
        TextComponent lexemeForSort7 = new TextComposite(lexeme7, ComponentType.LEXEME);

        List<TextComponent> lexeme8 = new ArrayList<>();
        lexeme8.add(SYMBOL_27);
        TextComponent lexemeForSort8 = new TextComposite(lexeme8, ComponentType.LEXEME);

        List<TextComponent> lexeme9 = new ArrayList<>();
        lexeme9.add(SYMBOL_28);
        lexeme9.add(SYMBOL_29);
        lexeme9.add(SYMBOL_30);
        TextComponent lexemeForSort9 = new TextComposite(lexeme9, ComponentType.LEXEME);

        List<TextComponent> lexeme10 = new ArrayList<>();
        lexeme10.add(SYMBOL_31);
        lexeme10.add(SYMBOL_32);
        lexeme10.add(SYMBOL_33);
        lexeme10.add(SYMBOL_34);
        TextComponent lexemeForSort10 = new TextComposite(lexeme10, ComponentType.LEXEME);

        List<TextComponent> lexeme11 = new ArrayList<>();
        lexeme11.add(SYMBOL_35);
        lexeme11.add(SYMBOL_36);
        lexeme11.add(SYMBOL_37);
        lexeme11.add(SYMBOL_38);
        TextComponent lexemeForSort11 = new TextComposite(lexeme11, ComponentType.LEXEME);

        List<TextComponent> lexeme12 = new ArrayList<>();
        lexeme12.add(SYMBOL_39);
        lexeme12.add(SYMBOL_40);
        lexeme12.add(SYMBOL_41);
        lexeme12.add(SYMBOL_42);
        lexeme12.add(SYMBOL_43);
        TextComponent lexemeForSort12 = new TextComposite(lexeme12, ComponentType.LEXEME);

        List<TextComponent> sentence1 = new ArrayList<>();
        sentence1.add(lexemeForSort1);
        sentence1.add(lexemeForSort2);
        sentence1.add(lexemeForSort3);
        sentence1.add(lexemeForSort4);
        TextComponent sentenceForSort1 = new TextComposite(sentence1, ComponentType.SENTENCE);

        List<TextComponent> sentence2 = new ArrayList<>();
        sentence2.add(lexemeForSort5);
        sentence2.add(lexemeForSort6);
        sentence2.add(lexemeForSort7);
        sentence2.add(lexemeForSort8);
        sentence2.add(lexemeForSort9);
        TextComponent sentenceForSort2 = new TextComposite(sentence2, ComponentType.SENTENCE);

        List<TextComponent> sentence3 = new ArrayList<>();
        sentence3.add(lexemeForSort10);
        TextComponent sentenceForSort3 = new TextComposite(sentence3, ComponentType.SENTENCE);

        List<TextComponent> sentence4 = new ArrayList<>();
        sentence4.add(lexemeForSort11);
        sentence4.add(lexemeForSort12);
        TextComponent sentenceForSort4 = new TextComposite(sentence4, ComponentType.SENTENCE);

        List<TextComponent> paragraph1 = new ArrayList<>();
        paragraph1.add(sentenceForSort1);
        TextComponent paragraphForSort1 = new TextComposite(paragraph1, ComponentType.PARAGRAPH);

        List<TextComponent> paragraph2 = new ArrayList<>();
        paragraph2.add(sentenceForSort2);
        TextComponent paragraphForSort2 = new TextComposite(paragraph2, ComponentType.PARAGRAPH);

        List<TextComponent> paragraph3 = new ArrayList<>();
        paragraph3.add(sentenceForSort3);
        paragraph3.add(sentenceForSort4);
        TextComponent paragraphForSort3 = new TextComposite(paragraph3, ComponentType.PARAGRAPH);

        List<TextComponent> text = new ArrayList<>();
        text.add(paragraphForSort1);
        text.add(paragraphForSort2);
        text.add(paragraphForSort3);
        return new TextComposite(text, ComponentType.TEXT);
    }


}
