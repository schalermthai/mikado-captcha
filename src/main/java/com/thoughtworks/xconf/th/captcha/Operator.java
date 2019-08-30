package com.thoughtworks.xconf.th.captcha;

public abstract class Operator {
    private final String symbol;

    public Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    abstract Integer compute(Node leftOperand, Node rightOperand);

    public String display(Node leftOperand, Node rightOperand) {
        return leftOperand.display() + " " + symbol + " " + rightOperand.display();
    }

}
