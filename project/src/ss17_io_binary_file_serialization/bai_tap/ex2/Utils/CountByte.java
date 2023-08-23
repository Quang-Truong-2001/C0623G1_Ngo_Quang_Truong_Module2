package ss17_io_binary_file_serialization.bai_tap.ex2.Utils;

import java.io.*;

public class CountByte {
    public static int countByte(String namePath){
        File file;
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;
        BufferedInputStream bufferedInputStream=null;
        int count=0;
        try{
            file = new File(namePath);
            fileInputStream=new FileInputStream(file);
            objectInputStream=new ObjectInputStream(fileInputStream);
            bufferedInputStream=new BufferedInputStream(objectInputStream);
            int character;
            while((character=bufferedInputStream.read())!=-1){
                count++;
            }
            return count;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return count;
        }
    }
}
