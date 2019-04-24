package com.thoughtworks.xconf.th.captcha;

public enum Operator {

    PLUS("+") {
        @Override
        Integer compute(Node left, Node right) {
            return left.compute() + right.compute();
        }
    }, MINUS("-") {
        @Override
        Integer compute(Node left, Node right) {
            return left.compute() - right.compute();
        }
    }, MULTIPLY("*") {
        @Override
        Integer compute(Node left, Node right) {
            return left.compute() * right.compute();
        }
    }, POWER("^") {
        @Override
        Integer compute(Node left, Node right) {
            return (int) Math.pow(left.compute(), right.compute());
        }
    };

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public String display(Node left, Node right) {
        return left.display() + " " + this.symbol + " " + right.display();
    }

    abstract Integer compute(Node left, Node right);
}
