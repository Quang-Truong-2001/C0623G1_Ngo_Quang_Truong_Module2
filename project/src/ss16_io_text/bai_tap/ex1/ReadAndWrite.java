package ss16_io_text.bai_tap.ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<String> readFile(String namePathSourceFile) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> result = new ArrayList<>();
        try {
            file = new File(namePathSourceFile);
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
        } catch (Exception e){
            e.printStackTrace();
            return result;
        }
        finally {
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

    public void writeFile(String pathNameTargetFile, List<String> data) {
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(pathNameTargetFile);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String d : data) {
                bufferedWriter.write(d);
                bufferedWriter.newLine();
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static boolean checkExistFile(String pathName){
        File file=new File(pathName);
        if(!file.exists()){
            return false;
        }
        return true;
    }
}
