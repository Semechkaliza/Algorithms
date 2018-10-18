import java.util.List;

public class Node {
    Integer key;
    Node parent;
    Node sChild;
    Node bChild;

    public Node(int v, Node parent) {
        this.key=v;
        this.parent=parent;
    }
    public Node(){

    }
    public Node(int v) {
        this.key=v;
    }
}
