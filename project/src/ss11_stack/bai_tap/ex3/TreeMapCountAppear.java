package ss11_stack.bai_tap.ex3;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapCountAppear {
    public static void main(String[] args) {
        String str= "AbcjssssdsiHDKk575";
        String[] arr= str.split("");
        System.out.println("when not converted: "+ str);
        System.out.println("after converting to uppercase: "+str.toUpperCase());
        Map<String,Integer> map = new TreeMap<>();
        int value=0;
        for (String symbol:arr) {
            if(map.containsKey(symbol)){
                value = map.get(symbol);
                value++;
                map.replace(symbol,value);
            }else {
                map.put(symbol,1);
            }
        }
        System.out.println("Count the number of occurrences: "+map.toString().toUpperCase());
    }
}
