import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PreparingArrays.generate();
        long timestart=0;
        long timeend=0;
        int[] list;
        String fileName;
        timestart=System.currentTimeMillis() ;
        fileName=new String("arrays/mas");
        for(int k=0;k<20;k++) {
            fileName = fileName + k + ".txt";
            list=PreparingArrays.getInts(fileName);
             new InterpolSearch().InterpolSearch(list,20);
            fileName = "arrays/mas";
        }
        timeend=System.currentTimeMillis() ;
        System.out.println((double) timeend-timestart);
        timestart=System.currentTimeMillis() ;
        fileName=new String("arrays/mas");
        for(int k=0;k<20;k++) {
            fileName = fileName + k + ".txt";
            list=PreparingArrays.getInts(fileName);
            new BinarySearch().binarySearch (list,20);
            fileName = "arrays/mas";
        }
        timeend=System.currentTimeMillis() ;
        System.out.println((double) timeend-timestart);
    }
}
