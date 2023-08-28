package Utils;

import model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List<String> readFile(String pathName){
        File file=null;
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        List<String> result=new ArrayList<>();
        try {
            file=new File(pathName);
            fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String str;
            while((str=bufferedReader.readLine())!=null){
                result.add(str);
            }
            return result;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(bufferedReader!=null){
                    bufferedReader.close();
                }
                if(fileReader!=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
        return result;
    }
    public static void writeFile(String pathName, List<String> data){
        File file=null;
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            file=new File(pathName);
            fileWriter=new FileWriter(file);
            bufferedWriter=new BufferedWriter(fileWriter);
            for(String d:data){
                bufferedWriter.write(d);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(bufferedWriter!=null){
                    bufferedWriter.close();
                }
                if(fileWriter!=null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
