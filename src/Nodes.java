public class Nodes {

    private int nodeId;
    private Nodes[] adjacent;
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
    public Nodes[] getAdjacent() {
        return adjacent;
    }
    public void setAdjacent(Nodes[] adjacent) {
        this.adjacent = adjacent;
    }
    public State getState() {
        return state;
    }
    public boolean isVisited() {
        return visited;
    }
    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    public void setPartOfSolution(boolean partOfSolution) {
        this.partOfSolution = partOfSolution;
    }
}
