package ss11_stack.bai_tap.ex3;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapCountAppear {
    public static void main(String[] args) {
        String st1= "AbcjsdsiHDKk";
        String[] arrST= st1.split(" ");
        System.out.println("when not converted: "+ st1);
        System.out.println("after converting to uppercase: "+st1.toUpperCase());

        Map<String,Integer> map = new TreeMap<>();

        for (String s:arrST) {
            if(map.containsKey(s)){
                Integer value = map.get(s);
                value++;
                map.replace(s,value);
            }else {
                map.put(s,1);
            }
        }
        System.out.println("Count the number of occurrences: "+map.toString().toUpperCase());
    }
}
