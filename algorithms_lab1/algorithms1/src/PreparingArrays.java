import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PreparingArrays {
    public static void generate(){
        String fileName= new String("arrays/mas");
        for(int k=0;k<50;k++) {
            fileName = fileName + k + ".txt";
            try (FileWriter writer = new FileWriter(String.valueOf(fileName), false)) {
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < 100000; i++) {
                    list.add((int) (Math.random() * 1000000000));
                }
                writer.write(String.valueOf(list));
                list.clear();
                writer.flush();
                fileName = "arrays/mas";
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static String read(String name) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader (name));
        String         line = null;
        StringBuilder  stringBuilder = new StringBuilder();
        String         ls = System.getProperty("line.separator");

        try {
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public static List<Integer> getInts(String name){
        List<Integer> ints=new ArrayList<>();
        try {
            String a=read(name);
            a=a.substring(1,a.length()-3)+",";
            String[] aa=a.split(" ");
            for(int i=0;i<aa.length;i++){
                ints.add(Integer.parseInt(aa[i].substring(0,aa[i].length()-1)));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return ints;
    }
}

