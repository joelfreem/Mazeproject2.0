public class Maze {
    private Nodes[] nodes;
    private Archs[] archs;
    private Nodes startNode;
    private Nodes endNode;

    public Maze(Nodes[] nodes, Archs[] archs, Nodes startNode, Nodes endNode) {
        this.nodes = nodes;
        this.archs = archs;
        this.startNode = startNode;
        this.endNode = endNode;
    }
}
