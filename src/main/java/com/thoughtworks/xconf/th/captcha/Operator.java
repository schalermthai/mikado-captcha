package com.thoughtworks.xconf.th.captcha;

public abstract class Operator {
    private final String symbol;

    protected Operator(String symbol) {
        this.symbol = symbol;
    }

    protected String getSymbol() {
        return symbol;
    }

    abstract Integer compute(Node leftOperand, Node rightOperand);

    public String display(Node leftOperand, Node rightOperand) {
        return leftOperand.display() + " " + symbol + " " + rightOperand.display();
    }

}
