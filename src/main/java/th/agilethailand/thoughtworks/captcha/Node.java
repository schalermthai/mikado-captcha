package th.agilethailand.thoughtworks.captcha;

/**
 * Created by schalermthai on 05/05/2015.
 */
public class Node {

    private String operator;
    private Integer value;

    private Node leftOperand;
    private Node rightOperand;

    public Node(String operator, Node leftOperand, Node rightOperand) {
        this.operator = operator;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.value = 0;
    }

    public Node(Integer value) {
        this.operator = "#";
        this.leftOperand = null;
        this.rightOperand = null;
        this.value = value;
    }

    public Integer compute() {
        switch (this.operator) {
            case "+" : return leftOperand.compute() + rightOperand.compute();
            case "-" : return leftOperand.compute() - rightOperand.compute();
            case "*" : return leftOperand.compute() * rightOperand.compute();
            default  : return this.value;
        }
    }

    public String toString() {
        switch (this.operator) {
            case "+" : return leftOperand.toString() + " + " + rightOperand.toString();
            case "-" : return leftOperand.toString() + " - " + rightOperand.toString();
            case "*" : return leftOperand.toString() + " * " + rightOperand.toString();
            default  : return this.value + "";
        }
    }

}
