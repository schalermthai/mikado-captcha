package com.thoughtworks.xconf.th.captcha;

public class OpNode implements Node {

    private Operator operator;

    private Node leftOperand;
    private Node rightOperand;

    public OpNode(Operator operator, Node leftOperand, Node rightOperand) {
        this.operator = operator;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public Integer compute() {
        return this.operator.compute(leftOperand, rightOperand);
    }

    @Override
    public String display() {
        return this.operator.display(leftOperand, rightOperand);
    }

}
