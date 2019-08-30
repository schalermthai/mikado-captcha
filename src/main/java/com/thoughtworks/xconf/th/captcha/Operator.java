package com.thoughtworks.xconf.th.captcha;

public abstract class Operator {
    private final String symbol;

    public Operator(String symbol) {
        this.symbol = symbol;
    }

    public static Operator plus() {
        return new Plus();
    }

    public static Operator minus() {
        return new Minus();
    }

    public static Operator multiply() {
        return new Multiply();
    }

    public String getSymbol() {
        return symbol;
    }

    abstract Integer compute(Node leftOperand, Node rightOperand);

    public String display(Node leftOperand, Node rightOperand) {
        return leftOperand.display() + " " + symbol + " " + rightOperand.display();
    }

    private static class Plus extends Operator {
        public Plus() {
            super("+");
        }

        @Override
        Integer compute(Node leftOperand, Node rightOperand) {
            return leftOperand.compute() + rightOperand.compute();
        }
    }

    private static class Minus extends Operator {
        public Minus() {
            super("-");
        }

        @Override
        Integer compute(Node leftOperand, Node rightOperand) {
            return leftOperand.compute() - rightOperand.compute();
        }
    }

    private static class Multiply extends Operator {
        public Multiply() {
            super("*");
        }

        @Override
        Integer compute(Node leftOperand, Node rightOperand) {
            return leftOperand.compute() * rightOperand.compute();
        }
    }
}
