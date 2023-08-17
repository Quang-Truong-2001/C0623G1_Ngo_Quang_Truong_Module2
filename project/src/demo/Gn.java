package demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Gn {
    public static void main(String[] args) {
        String str="CodeGym";
        String sNormal=str.trim();
        String sUpperCase=sNormal.toUpperCase();
        String[] arrNormal=sNormal.split("");
        String[] arrUpper=sUpperCase.split("");
        String str2="";
        int count=0;
        for(int i=0;i<sNormal.length();i++){
            if(arrNormal[i].equals(arrUpper[i])){
                count++;
            }
        }
        List<String> arra=new ArrayList<>();
        arra.add(arrNormal[0].toLowerCase());
        for(int i=1;i<sNormal.length(); i++){
            if(arrNormal[i].equals(arrUpper[i])){
                arra.add(" ");
                arra.add(arrNormal[i].toLowerCase());
            } else {
                arra.add(arrNormal[i].toLowerCase());
            }
        }
        for(int i=0; i<arra.size();i++) {
            str2 += arra.get(i) + "";
        }
    }
}
