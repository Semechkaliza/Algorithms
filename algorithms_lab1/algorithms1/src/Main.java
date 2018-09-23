import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName=new String("arrays/mas");
        List<Integer> list;
        for(int k=0;k<50;k++) {
            fileName = fileName + k + ".txt";
            list=PreparingArrays.getInts(fileName);
            //main part
            list.clear();
            fileName = "arrays/mas";
        }
    }
}
