import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object1[] list1=new Object1[5];
        list1[0]=new Object1(1,"d");
        list1[1]=new Object1(4,"aaaa");
        list1[2]=new Object1(6,"kkkkkk");
        list1[3]=new Object1(3,"bbb");
        list1[4]=new Object1(2,"cc");


        Object2[] list0=new Object2[5];
        list0[0]=new Object2("d",5);
        list0[1]=new Object2("aaaa",2);
        list0[2]=new Object2("kkkkkk",1);
        list0[3]=new Object2("bbb",3);
        list0[4]=new Object2("cc",4);
        new MergeSort().sort(list1,0,4);
        for(int i=0;i<5;i++){
            System.out.println(list1[i].b);
        }
        new MergeSortToo().sort(list0,0,4,list1);
        for(int i=0;i<5;i++){
            System.out.println(list0[i].c);
        }
    }
}
