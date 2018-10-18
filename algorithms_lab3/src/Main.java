public class Main {
    public static void main(String[] args) {
        ChainHashMap<Integer,Integer> table=new ChainHashMap<>();
        for(int i=0;i<1000;i++){
            int a=(int)(Math.random()*1000);
            table.put(a,a);

        }
        System.out.println(table.toString());
//        table.put("one",1);
//        table.put("two",2);
//        table.put("one",1);

    }
}
