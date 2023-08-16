package demo;

import java.util.*;

public class Tre {
    public static void main(String[] args) {
        String s="CodeGym";
        String str2="";
        String[] arr=s.split("");
        String str=s.toUpperCase();
        String[] arr2=str.split("");
        Queue<String> arr3=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(arr[i].equals(arr2[i])){
                arr3.add(" ");
                arr3.add(arr[i].toLowerCase());
            } else{
                arr3.add(arr[i]);
            }
        }
        int length=arr3.size();
        String[] arr4=new String[length];
        for (int i = 0; i < length; i++) {
            arr4[i]=arr3.poll();
        }
        for (int i = 0; i < length; i++) {
//            System.out.println(arr4[i]);
        }
        System.out.println(str);

    }
}
