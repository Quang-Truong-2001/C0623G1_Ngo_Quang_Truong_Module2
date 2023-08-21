package ss16_io_text.thuc_hanh.th2;

import ss16_io_text.thuc_hanh.th1.ReadFileExample;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers=new ArrayList<>();
        try{
            File file=new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line="";
            while((line=br.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi");
        }
        return numbers;
    }
    public void writerFile(String filePath, int max){
        try{
            FileWriter writer=new FileWriter(filePath,true);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: "+max);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers){
        int max=numbers.get(0);
        for(int i=0;i<numbers.get(i);i++){
            if(max<numbers.get(i)){
                max=numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile=new ReadAndWriteFile();
        List<Integer> numbers=readAndWriteFile.readFile("E:\\C0623G1_Ngo_Quang_Truong_Module2\\project\\src\\ss16_io_text\\thuc_hanh\\th1\\numbers.csv");
        int maxValue=findMax(numbers);
        readAndWriteFile.writerFile("E:\\C0623G1_Ngo_Quang_Truong_Module2\\project\\src\\ss16_io_text\\thuc_hanh\\th1\\result.csv",maxValue);
    }
}
