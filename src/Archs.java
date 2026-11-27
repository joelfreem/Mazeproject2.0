import org.w3c.dom.Node;

public class Archs {

    private Node node1;
    private Node node2;
    private double length;

    public Archs(Node node1, Node node2, double length){
        this.node1 = node1;
        this.node2 = node2;
        this.length = length;

    }

    public Node getNode1(){
        return node1;
    }
    public Node getNode2(){
        return node2;
    }

    public double getLength(){
        return length;
    }

}

