package com.shitikov.handling.interpreter.impl;

import com.shitikov.handling.interpreter.ExpressionInterpreter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExpressionInterpreterImplTest {
    ExpressionInterpreter interpreter;

    @BeforeMethod
    public void setUp() {
        interpreter = new ExpressionInterpreterImpl();
    }

    @DataProvider(name = "expression")
    public Object[][] createData() {
        return new Object[][] {{"3+5", "8"}, {"(2+2)*5", "20"}, {"-2*3 + 10", "4"}};
    }

    @Test(dataProvider = "expression")
    public void testEvaluateExpression(String expression, String expected) {
        String actual = interpreter.evaluateExpression(expression);
        assertEquals(actual, expected);
    }
}