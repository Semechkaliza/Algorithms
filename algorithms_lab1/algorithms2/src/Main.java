import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object1[] list1=new Object1[5];
        list1[0]=new Object1(1,"d");
        list1[1]=new Object1(4,"a");
        list1[2]=new Object1(6,"k");
        list1[3]=new Object1(3,"b");
        list1[4]=new Object1(2,"c");
        int arr[]=new int[5];
        new MergeSort().sort(list1,0,5);
        for(int i=0;i<6;i++){
            System.out.println(list1[i].a);
        }
    }
}
