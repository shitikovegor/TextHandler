package com.shitikov.handling.interpreter.impl;

import bsh.EvalError;
import bsh.Interpreter;
import com.shitikov.handling.interpreter.ExpressionInterpreter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExpressionInterpreterImpl implements ExpressionInterpreter {
    private static Logger logger = LogManager.getLogger();

    @Override
    public String evaluateExpression(String input) {
        StringBuilder math = new StringBuilder("result = ");
        math.append(input);

        Interpreter interpreter = new Interpreter();
        try {
            interpreter.eval(math.toString());
            return interpreter.get("result").toString();
        } catch (EvalError e) {
            logger.log(Level.ERROR, "Error in time of evaluating. ", e);
            return input;
        }
    }
}
