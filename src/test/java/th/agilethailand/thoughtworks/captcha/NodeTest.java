package th.agilethailand.thoughtworks.captcha;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by schalermthai on 05/05/2015.
 */
public class NodeTest {

    @Test
    public void toString_ValueNode_printsTheValue() {
        Node valueNode = new Node(1);
        assertEquals("1", valueNode.toString());
    }

    @Test
    public void toString_OperatorNode_printsTheEquation() {
        Node operatorNode = new Node("+", new Node(1), new Node(2));
        assertEquals("1 + 2", operatorNode.toString());
    }

    @Test
    public void compute_ValueNode_givesTheValueBack() {
        Node valueNode = new Node(2);
        assertEquals(2, valueNode.compute().intValue());
    }

    @Test
    public void compute_OperatorNode_givesTheComputedResult() {
        Node valueNode = new Node("-", new Node(5), new Node(3));
        assertEquals(2, valueNode.compute().intValue());
    }
}
