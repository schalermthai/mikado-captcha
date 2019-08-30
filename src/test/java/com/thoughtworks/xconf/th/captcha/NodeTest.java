package com.thoughtworks.xconf.th.captcha;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NodeTest {

    @Test
    public void display_ValueNode_printsTheValue() {
        Node valueNode = OpNode.createValueNode(1);
        assertEquals("1", valueNode.display());
    }

    @Test
    public void display_OperatorNode_printsTheEquation() {
        Node operatorNode = OpNode.createOpNode("+", OpNode.createValueNode(1), OpNode.createValueNode(2));
        assertEquals("1 + 2", operatorNode.display());
    }

    @Test
    public void display_complexOperatorNodes() {
        Node f = OpNode.createOpNode("*", OpNode.createValueNode(2), OpNode.createValueNode(5));
        Node g = OpNode.createOpNode("+", f, OpNode.createValueNode(3));

        assertEquals("2 * 5 + 3", g.display());
    }

    @Test
    public void compute_ValueNode_givesTheValueBack() {
        Node valueNode = OpNode.createValueNode(2);
        assertEquals(2, valueNode.compute().intValue());
    }

    @Test
    public void compute_OperatorNode_givesTheComputedResult() {
        Node opsNode = OpNode.createOpNode("-", OpNode.createValueNode(5), OpNode.createValueNode(3));
        assertEquals(2, opsNode.compute().intValue());
    }

    @Test
    public void compute_complexOperatorNodes() {
        Node f = OpNode.createOpNode("*", OpNode.createValueNode(2), OpNode.createValueNode(5));
        Node g = OpNode.createOpNode("+", f, OpNode.createValueNode(3));

        assertEquals(13, g.compute().intValue());
    }
}
