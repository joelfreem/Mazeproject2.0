import org.w3c.dom.Node;

public class Nodes {

    private int nodeId;
    private Node[] adjacent;
    private int x;
    private int y;
    private boolean visited;
    private boolean partOfSolution;
    private State state;

    public Nodes(int nodeId, int x, int y, State state) {
        this.nodeId = nodeId;
        this.x = x;
        this.y = y;
        this.state = state;

        visited = false;
        partOfSolution = false;
    }
}
