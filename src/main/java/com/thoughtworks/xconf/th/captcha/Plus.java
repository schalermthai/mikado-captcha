package com.thoughtworks.xconf.th.captcha;

class Plus extends Operator {
    public Plus() {
        super("+");
    }

    @Override
    Integer compute(Node leftOperand, Node rightOperand) {
        return leftOperand.compute() + rightOperand.compute();
    }
}
