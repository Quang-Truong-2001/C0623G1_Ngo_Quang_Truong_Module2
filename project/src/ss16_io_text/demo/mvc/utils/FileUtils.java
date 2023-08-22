package ss16_io_text.demo.mvc.utils;

import ss13_search_algorithm.demo.BinarySearchDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List<String> readFile(String namePath){
        File file=null;
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        List<String> result=new ArrayList<>();
        try {
            file=new File(namePath);
            fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);

            String str;
            while((str=bufferedReader.readLine())!=null){
                result.add(str);
            }
            return result;
        }  catch (IOException e) {
            e.printStackTrace();
            return result;
        } finally {
            try {
                if(bufferedReader!=null){
                    bufferedReader.close();
                }
                if(fileReader!=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void writerFile(String namePath, List<String> data){
        File file=null;
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            file=new File(namePath);
            fileWriter=new FileWriter(file);
            bufferedWriter=new BufferedWriter(fileWriter);
            for(String d:data){
                bufferedWriter.write(d);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufferedWriter!=null){
                    bufferedWriter.close();
                }
                if(fileWriter!=null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
