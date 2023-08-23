package ss17_io_binary_file_serialization.thuc_hanh.th2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String PATH_NAME = "E:\\C0623G1_Ngo_Quang_Truong_Module2\\project\\src\\ss17_io_binary_file_serialization\\thuc_hanh\\th2\\student.csv";

    public static void writeDataToFile(String path, List<Student> students){
        File file=new File(path);
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try{
            fileOutputStream=new FileOutputStream(file);
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeDataToFile(PATH_NAME,students);
        List<Student> studentDataFromFile=readDataFromFile(PATH_NAME);
        for(Student student:students){
            System.out.println(student);
        }
    }
    public static List<Student> readDataFromFile(String path){
        File file=new File(path);
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;
        List<Student> students=new ArrayList<>();
        try{
            fileInputStream=new FileInputStream(file);
            objectInputStream=new ObjectInputStream(fileInputStream);
            students=(List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
            return students;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
