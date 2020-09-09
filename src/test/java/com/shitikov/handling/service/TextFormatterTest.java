package com.shitikov.handling.service;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

public class TextFormatterTest {

    @Test
    public void testReplaceVariable() {
        TextFormatter formatter = TextFormatter.getInstance();
        String input = "(8- --i+1+i-- +1+ ++i - j-- -3- j++ + i++ - --j)";
        Map<Character, Integer> variables = new HashMap<>();
        variables.put('i', 5);
        variables.put('j', 9);
        String actual = formatter.replaceVariable(input, variables);
        String expected = "(8- 4+1+4 +1+ 4 - 9 -3- 8 + 4 - 8)";
        assertEquals(actual, expected);
    }
}