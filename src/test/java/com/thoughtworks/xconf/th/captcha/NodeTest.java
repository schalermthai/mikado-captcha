package com.thoughtworks.xconf.th.captcha;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NodeTest {

    @Test
    public void display_ValueNode_printsTheValue() {
        Node valueNode = Node.createValueNode(1);
        assertEquals("1", valueNode.display());
    }

    @Test
    public void display_OperatorNode_printsTheEquation() {
        Node operatorNode = Node.createOpNode("+", Node.createValueNode(1), Node.createValueNode(2));
        assertEquals("1 + 2", operatorNode.display());
    }

    @Test
    public void display_complexOperatorNodes() {
        Node f = Node.createOpNode("*", Node.createValueNode(2), Node.createValueNode(5));
        Node g = Node.createOpNode("+", f, Node.createValueNode(3));

        assertEquals("2 * 5 + 3", g.display());
    }

    @Test
    public void compute_ValueNode_givesTheValueBack() {
        Node valueNode = Node.createValueNode(2);
        assertEquals(2, valueNode.compute().intValue());
    }

    @Test
    public void compute_OperatorNode_givesTheComputedResult() {
        Node opsNode = Node.createOpNode("-", Node.createValueNode(5), Node.createValueNode(3));
        assertEquals(2, opsNode.compute().intValue());
    }

    @Test
    public void compute_complexOperatorNodes() {
        Node f = Node.createOpNode("*", Node.createValueNode(2), Node.createValueNode(5));
        Node g = Node.createOpNode("+", f, Node.createValueNode(3));

        assertEquals(13, g.compute().intValue());
    }
}
