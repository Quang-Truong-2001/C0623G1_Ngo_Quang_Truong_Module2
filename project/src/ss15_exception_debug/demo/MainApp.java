package ss15_exception_debug.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainApp {
    public static void main(String[] args) {
//        MainApp.readFile();
        try{
            String str=null;
            MainApp.logStr(str);
            int a=10/0;
            System.out.println(a);
        } catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        } catch (MyNullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("/spm");
        FileReader fr = new FileReader(file);
    }
    public static void logStr(String str){
        try{
            System.out.println(str.toString());
        }catch (NullPointerException ex){
            throw new MyNullPointerException("str đang bị null");
        }
    }
}
