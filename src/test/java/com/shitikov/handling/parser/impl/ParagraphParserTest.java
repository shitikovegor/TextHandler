package com.shitikov.handling.parser.impl;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.dataprovider.TextData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParagraphParserTest {
    ParagraphParser paragraphParser;

    @BeforeMethod
    public void setUp() {
        paragraphParser = new ParagraphParser();
    }

    @DataProvider(name = "paragraphProvider")
    public Object[][] createData() {
        return new Object[][] {{"It has survived 8.", TextData.PARAGRAPH_1}
                            , {"It is reader, 9 be.", TextData.PARAGRAPH_2}
                            , {"Bye! Good luck…", TextData.PARAGRAPH_3}};
    }

    @Test(dataProvider = "paragraphProvider")
    public void testParse(String input, TextComponent expected) {
        TextComponent actual = paragraphParser.parse(input);
        assertEquals(actual, expected);
    }
}