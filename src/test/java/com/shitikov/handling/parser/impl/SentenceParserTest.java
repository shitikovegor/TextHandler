package com.shitikov.handling.parser.impl;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.dataprovider.TextData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SentenceParserTest {
    SentenceParser sentenceParser;

    @BeforeMethod
    public void setUp() {
        sentenceParser = new SentenceParser();
    }

    @DataProvider(name = "sentenceProvider")
    public Object[][] createData() {
        return new Object[][] {{"It has survived 8.", TextData.SENTENCE_1}
                , {"It is reader, 9 be.", TextData.SENTENCE_2}
                , {"Bye!", TextData.SENTENCE_3}
                , {"Good luck…", TextData.SENTENCE_4}};
    }

    @Test(dataProvider = "sentenceProvider")
    public void testParse(String input, TextComponent expected) {
        TextComponent actual = sentenceParser.parse(input);
        assertEquals(actual, expected);
    }
}