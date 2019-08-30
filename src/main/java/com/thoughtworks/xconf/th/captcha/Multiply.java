package com.thoughtworks.xconf.th.captcha;

class Multiply extends Operator {
    public Multiply() {
        super("*");
    }

    @Override
    Integer compute(Node leftOperand, Node rightOperand) {
        return leftOperand.compute() * rightOperand.compute();
    }
}
