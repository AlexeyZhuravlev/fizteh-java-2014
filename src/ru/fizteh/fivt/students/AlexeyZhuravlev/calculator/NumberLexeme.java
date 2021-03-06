package ru.fizteh.fivt.students.AlexeyZhuravlev.calculator;

import java.util.Stack;

/**
 * @author AlexeyZhuravlev
 */

public final class NumberLexeme extends Lexeme {

    public NumberLexeme(double value) {
        this.value = value;
    }

    public NumberLexeme(String s) {
        this.value = Double.valueOf(s);
    }

    @Override
    protected int priority() throws Exception {
        throw new Exception("Logical error: NumberLexeme don't have any priority");
    }

    @Override
    protected void makeOperation(Stack<NumberLexeme> results) throws Exception {
        throw new Exception("Logical error: NumberLexeme can't make any operation");
    }

    @Override
    public void addLexeme(Stack<NumberLexeme> results, Stack<Lexeme> operations) throws Exception {
        results.push(this);
    }

    public double value;
}
