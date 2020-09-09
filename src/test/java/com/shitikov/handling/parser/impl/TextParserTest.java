package com.shitikov.handling.parser.impl;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.dataprovider.TextData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TextParserTest {
    TextParser parser;

    @BeforeMethod
    public void setUp() {
        parser = new TextParser();
    }

    @Test
    public void testParse() {
        TextComponent actual = parser.parse(TextData.INPUT_TEXT);
        assertEquals(actual, TextData.TEXT);
    }

    @Test
    public void testParseWithVariables() {
        TextComponent actual = parser.parseWithVariables(TextData.INPUT_TEXT_VARIABLE
                , TextData.INDEX_I, TextData.INDEX_J);
        assertEquals(actual, TextData.TEXT);
    }
}