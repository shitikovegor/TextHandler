package com.shitikov.handling.parser.impl;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.dataprovider.TextData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LexemeParserTest {
    LexemeParser lexemeParser;

    @BeforeMethod
    public void setUp() {
        lexemeParser = new LexemeParser();
    }

    @DataProvider(name = "lexemeProvider")
    public Object[][] createData() {
        return new Object[][] {{"It", TextData.LEXEME_1}
                            , {"has", TextData.LEXEME_2}
                            , {"survived", TextData.LEXEME_3}
                            , {"8.", TextData.LEXEME_4}};
    }

    @Test(dataProvider = "lexemeProvider")
    public void testParse(String input, TextComponent expected) {
        TextComponent actual = lexemeParser.parse(input);
        assertEquals(actual, expected);
    }
}