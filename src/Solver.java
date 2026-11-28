import org.w3c.dom.Node;

public class Solver {

    public boolean escape(Nodes[] path){
        int lastIndex =0;

        for(int i = 0; i< path.length; i++){
            if (path[i] !=null){
                lastIndex = i;
            }
        }

        Nodes cur = path[lastIndex];

        cur.setVisited(true);

        if(cur.getState() == State.End){
            cur.setPartOfSolution(true);
            return true;
        }

        for(Nodes n: cur.getAdjacent()){
            if(n != null && !n.isVisited()){
                path[lastIndex + 1] = n;

                boolean solved = escape(path);

                if (solved) {
                    cur.setPartOfSolution(true);
                    return true;
                }
                path[lastIndex + 1] = null;
            }

        }
        return false;
    }
}
