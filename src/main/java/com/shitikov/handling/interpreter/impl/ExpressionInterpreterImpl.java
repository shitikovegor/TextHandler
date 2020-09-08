package com.shitikov.handling.interpreter.impl;

import bsh.EvalError;
import bsh.Interpreter;
import com.shitikov.handling.interpreter.ExpressionInterpreter;

public class ExpressionInterpreterImpl implements ExpressionInterpreter {

    @Override
    public String evaluateExpression(String input) {
        StringBuilder math = new StringBuilder("result = ");
        math.append(input);

        Interpreter interpreter = new Interpreter();
        try {
            interpreter.eval(math.toString());
            return interpreter.get("result").toString();
        } catch (EvalError evalError) {
            // TODO: 08.09.2020 log
            return input;
        }
    }
}
