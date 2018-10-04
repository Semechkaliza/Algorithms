public class Tree {
    Node root = new Node();

    void insert(int k) {
        Node v = new Node(k);
        if (root.key == null) {
            root = v;
        } else {
            Node n = findParent(v);
            if (n == null) {
                System.out.println("similar key");
            } else {
                v.parent = n;
                if (n.key < v.key) {
                    n.bChild = v;
                } else {
                    n.sChild = v;
                }
            }


        }

    }

    private Node findParent(Node o) {
        Node p = root;
        while (true) {
            if (p.key.equals(o.key)) {
                return null;
            } else {
                if (p.key > o.key) {
                    if (p.sChild != null) {
                        p = p.sChild;
                    } else {
                        return p;
                    }

                } else {
                    if (p.bChild != null) {
                        if (p.bChild.key < o.key) {
                            p = p.bChild;
                        } else {
                            if (p.sChild == null) {
                                return p;
                            } else {
                                p = p.sChild;
                            }
                        }
                    } else {
                        return p;
                    }
                }
            }
        }
    }

    public void printRight() {
        Node p = root;
        while (p != null) {
            System.out.println(p.key);
            p = p.bChild;
        }
    }

    public void printLeft() {
        Node p = root;
        while (p != null) {
            System.out.println(p.key);
            p = p.sChild;
        }
    }

    public Node search(int k){
        Node r=root;
        while (true){
            if(r.key==k){
                return r;
            }else{
                if(r.key>k){
                    if(r.sChild!=null){
                        r=r.sChild;
                    }else{
                        return null;
                    }
                }else{
                    if(r.bChild!=null){
                        r=r.bChild;
                    }else{
                        return null;
                    }
                }
            }
        }
    }
}
