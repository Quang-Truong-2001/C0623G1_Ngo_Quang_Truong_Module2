package ss16_io_text.bai_tap.ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<String> readFile(String pathName) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> result = new ArrayList<>();
        try {
            file = new File(pathName);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                result.add(str);
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            return result;
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void display(List<String> data){
        for(String d:data){
            String[] els=d.split(",");
            System.out.println(els[0] + "\t"+els[1]+"\t"+els[2]);
        }
    }
}
