package com.shitikov.handling.sorter;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.component.impl.TextComposite;
import com.shitikov.handling.component.impl.type.ComponentType;
import com.shitikov.handling.dataprovider.TextData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class TextSorterTest {
    TextSorter textSorter;
    TextComponent actual;

    @BeforeMethod
    public void setUp() {
        textSorter = TextSorter.getInstance();
        actual = TextData.textForSort();
    }

    @Test
    public void testSortParagraphsBySentenceNumber() {
        textSorter.sortParagraphsBySentenceNumber(actual);
        String expected = "It has survived 8.\tIt is reader, 9 be.\tBye! Good luck…";
        assertEquals(actual.toString(), expected);
    }

    @Test
    public void testSortSentencesByWordLength() {
        textSorter.sortSentencesByWordLength(actual);
        String expected = "8. It has survived\t9 It is be. reader,\tBye! Good luck…";
        assertEquals(actual.toString(), expected);
    }

    @Test
    public void testSortSentencesByLexemeLength() {
        textSorter.sortSentencesByLexemeLength(actual);
        String expected = "It 8. has survived\t9 It is be. reader,\tBye! Good luck…";
        assertEquals(actual.toString(), expected);
    }

    @Test
    public void testSortLexemesBySymbol() {
        textSorter.sortLexemesBySymbol(actual, 'e');
        String expected = "survived 8. It has\treader, be. 9 It is\tBye! Good luck…";
        assertEquals(actual.toString(), expected);
    }
}