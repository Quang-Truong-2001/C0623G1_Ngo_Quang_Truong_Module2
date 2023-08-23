package ss17_io_binary_file_serialization.bai_tap.ex2.Utils;

import ss17_io_binary_file_serialization.bai_tap.ex1.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List<Product> readFileBinary(String pathName){
        File file;
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;
        try{
            file=new File(pathName);
            if(!file.exists()){
                file.createNewFile();
            }
            fileInputStream=new FileInputStream(file);
            objectInputStream=new ObjectInputStream(fileInputStream);
            return (List<Product>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(objectInputStream!=null){
                    objectInputStream.close();
                }
                if(fileInputStream!=null){
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return new ArrayList<>();
    }
    public static void writeFileBinary(String namePath, List<Product> products){
        File file;
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try {
            file=new File(namePath);
            if(!file.exists()){
                file.createNewFile();
            }
            fileOutputStream=new FileOutputStream(file);
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(objectOutputStream!=null){
                    objectOutputStream.close();
                }
                if(fileOutputStream!=null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static boolean checkFileExist(String pathName){
        File file=new File(pathName);
        if(file.exists()){
            return true;
        }
        return false;
    }
}
