package ss16_io_text.bai_tap.ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountCharacter {
    public static int countCharacter(String namePath){
        File file=null;
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        int charCount=0;
        try {
            file = new File(namePath);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            int character;
            while((character=bufferedReader.read())!=-1){
                charCount++;
            }
            return charCount;
        } catch (IOException e) {
            e.printStackTrace();
            return charCount;
        }
    }
}
