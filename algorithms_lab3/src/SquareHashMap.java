import java.util.ArrayList;
import java.util.Objects;

public class SquareHashMap<K,V> {
    static class Node<K,V>{
        int hash;
        K key;
        V value;

        Node(K key,V value)
        {
            this.key=key;
            this.hash= Objects.hashCode(key);
            this.value=value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    public SquareHashMap() {
        for(int i=1000;i<1024;i++){
            table[i]=new Node(0,0);
        }
    }

    @Override
    public String toString() {
        for(int i=0;i<1024;i++){
            System.out.println(table[i]);
        }
        return "all";
    }

    static Node[] table=new Node[1024];

    static int findIndex(Node node){
        int i=-1;
        for(int j=0;j<1000;j++){
            if(table[j]!=null){
                if(table[j].hash==node.hash){
                    i=j;
                    break;
                }
            }

        }
        return i;
    }

    Node<K,V> find(K key,V value){
        for(int i=0;i<1024;i++){
            if(table[i].hash==key.hashCode()){
                if(table[i].value==value){
                    return table[i];
                }
            }
        }
        return null;
    }

    void put(K key,V value){
        Node<K, V> node=new Node<>(key,value);
        int n=findIndex(node);
        int k=1;
        if(n==-1){
            for(int i=0;i<1024;i++){
                if(table[i]==null){
                    table[i]=node;
                    break;
                }
            }
        }else{
            boolean check=false;
            if(!table[n].equals(node)){
                for(int i=n;i<1024;i=k*k){
                    if(table[i]==null){
                        table[i]=node;
                        check=true;
                        break;
                    }
                    k++;
                }
                if(!check){
                    while (true){
                        for(int i=0;i<1024;i=k*k){
                            if(table[i]==null){
                                table[i]=node;
                                check=true;
                                break;
                            }
                            k++;
                            if(k>31){
                                k=1;
                            }
                        }
                        break;
                    }

                }
            }

        }
    }
}
