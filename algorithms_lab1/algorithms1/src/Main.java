import java.util.List;

public class Main {
    public static void main(String[] args) {
        long timestart=System.currentTimeMillis() ;
        String fileName=new String("arrays/mas");
        int[] list;
        for(int k=0;k<50;k++) {
            fileName = fileName + k + ".txt";
            list=PreparingArrays.getInts(fileName);
            new QuickSort().sort(list,1,99999);
            fileName = "arrays/mas";
        }
        long timeend=System.currentTimeMillis() ;
        System.out.println(timeend-timestart);
    }
}
