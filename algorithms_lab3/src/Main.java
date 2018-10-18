public class Main {
    public static void main(String[] args) {
        ChainHashMap<Integer,Integer> table=new ChainHashMap<>();
        for(int i=0;i<1000;i++){
            int a=(int)(Math.random()*1000);
            table.put(a,a);

        }
        System.out.println(table.toString());

        SquareHashMap<Integer,Integer> table1=new SquareHashMap<>();
        for(int i=0;i<1000;i++){
            int a=(int)(Math.random()*1000);
            table1.put(a,a);
        }
        System.out.println(table1.toString());
    }
}
