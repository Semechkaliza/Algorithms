import java.util.ArrayList;
import java.util.Objects;

public class ChainHashMap<K,V> {
    static class Node<K,V>{
        int hash;
        K key;
        V value;
        Node next;

        Node(K key,V value,Node next)
        {
            this.key=key;
            this.hash= Objects.hashCode(key);
            this.value=value;
            this.next=next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    public ChainHashMap() {
        for (int i=0;i<16;i++){
            table.add(i,new ArrayList<>());
        }
    }

    @Override
    public String toString() {
        for(int i=0;i<16;i++){
            for(int j=0;j<table.get(i).size()-1;j++){
                Node c=table.get(i).get(j);

                while (c.next!=null){
                    System.out.println(c);
                    c=c.next;
                }
                System.out.println(c);
            }
        }
        return "all";
    }

    static ArrayList<ArrayList<Node>> table=new ArrayList<>();

    static int findIndex(Node node,ArrayList<Node> list){
        int i=-1;
        for(int j=0;j<list.size()-1;j++){
            if(list.get(j).hash==node.hash){
                i=j;
                break;
            }
        }
        return i;
    }

    Node<K,V> find(K key,V value){
        for(int i=0;i<16;i++){
            for(int j=0;j<table.size()-1;j++) {
                if (table.get(j).get(i).hash == key.hashCode()) {
                    Node c=table.get(j).get(i);
                        while(c.next!=null){
                            if(c.value.equals(value)){
                                return c;
                            }else{
                                c=c.next;
                            }
                    }

                }
            }
        }
        return null;
    }

    void put(K key,V value){
        Node<K, V> node=new Node<>(key,value,null);
        int i=node.hash%16;
        int n=findIndex(node,table.get(i));
        if(n==-1){
            table.get(i).add(node);
        }else{
            table.get(i).get(n).next=node;
        }
    }
}
