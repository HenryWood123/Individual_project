public class Node {

    private Node state;
    private Node Parent;
    private String actions;
    private String solution_path;

    public String toString(){
        return this.state.toString();
    }


    public Node getState() {
//        ArrayList<Airports> Airport_name = new ArrayList<Airports>();
//        this.state = new State(Airport_name, Airports.getAirport_name()) {
//            @Override
//            protected boolean isInState(JComponent c) {
//                return false;
//            }
//        };
        return state;
    }

    public String setState() {

        this.state = state;
        return null;
    }

    public Node getParent() {
        return Parent;
    }

    public void setParent(Node parent) {
        this.Parent = parent;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public String getSolution_path() {
        return solution_path;
    }

    public void setSolution_path(String solution_path) {
        this.solution_path = solution_path;
    }




}

