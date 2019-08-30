package com.thoughtworks.xconf.th.captcha;

class Minus extends Operator {
    public Minus() {
        super("-");
    }

    @Override
    Integer compute(Node leftOperand, Node rightOperand) {
        return leftOperand.compute() - rightOperand.compute();
    }
}
