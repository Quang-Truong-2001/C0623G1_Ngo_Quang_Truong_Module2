package ss19_string_regex.demo;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String str1="Hello";
//        String str2="Hello";
//        System.out.println("str1: "+str1);
//        str1=str1.concat(str2);
//        System.out.println("str1: "+str1);

//        String str3=new String("Hello");
//        String str4=new String("Hello");
//        System.out.println(str3);
//        str3=str3.concat(str4);
//        System.out.println(str3);

//        StringBuilder str= new StringBuilder("Hello");
//        for(int i=0;i<100;i++){
//            str.append(i);
//        }
//        System.out.println(str);

        String text2="2/12/2018";
        String text3="12/12/aaa";
        Pattern pattern=Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        System.out.println("\nChuỗi "+text2+" có định dạng ngày tháng: "+pattern.matcher(text2).matches());
    }
}
