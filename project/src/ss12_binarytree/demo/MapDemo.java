package ss12_binarytree.demo;

import ss08_clean_code.mvc.model.Student;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
//        Map<String, String> studentMap=new HashMap<>();
//        studentMap.put("C0623G1","Nguyễn Văn A");
//        studentMap.put("C0523G1","Nguyễn Văn B");
//        studentMap.put("C0423G1","Nguyễn Văn C");
//        studentMap.put("C0323G1","Nguyễn Văn D");
//        for (Map.Entry<String,String> entry:studentMap.entrySet()) {
//            System.out.println("Key="+entry.getKey()+"Value = "+entry.getValue());
//        }
        //LinkedHashMap
//        Map<String, String> studentMap=new LinkedHashMap<>();
//        studentMap.put("C0623G1","Nguyễn Văn A");
//        studentMap.put("C0523G1","Nguyễn Văn B");
//        studentMap.put("C0423G1","Nguyễn Văn C");
//        studentMap.put("C0323G1","Nguyễn Văn D");
//        for (Map.Entry<String,String> entry:studentMap.entrySet()) {
//            System.out.println("Key="+entry.getKey()+"Value = "+entry.getValue());
//        }
//        Map<StudentIdCard, Student> studentMap=new TreeMap<>(
//                new Comparator<StudentIdCard>() {
//                    @Override
//                    public int compare(StudentIdCard o1, StudentIdCard o2) {
//                        return o1.getId()-o2.getId();
//                    }
//                }
//        );
//        studentMap.put(new StudentIdCard(1),new Student("1","Nguyễn Văn A","2001","Nam","C0623G1",4.5f));
//        studentMap.put(new StudentIdCard(5),new Student("13","Nguyễn Văn B","2001","Nam","C0623G1",4.5f));
//        studentMap.put(new StudentIdCard(2),new Student("4","Nguyễn Văn C","2001","Nam","C0623G1",4.5f));
//        studentMap.put(new StudentIdCard(8),new Student("9","Nguyễn Văn D","2001","Nam","C0623G1",4.5f));
//
//        for (Map.Entry<StudentIdCard, Student> entry:studentMap.entrySet()) {
//            System.out.println("Key="+entry.getKey()+"Value = "+entry.getValue());
//        }
        Map<StudentIdCard, Student> studentMap=new TreeMap<>();
        studentMap.put(new StudentIdCard(1),new Student("1","Nguyễn Văn A","2001","Nam","C0623G1",4.5f));
        studentMap.put(new StudentIdCard(5),new Student("13","Nguyễn Văn B","2001","Nam","C0623G1",4.5f));
        studentMap.put(new StudentIdCard(2),new Student("4","Nguyễn Văn C","2001","Nam","C0623G1",4.5f));
        studentMap.put(new StudentIdCard(8),new Student("9","Nguyễn Văn D","2001","Nam","C0623G1",4.5f));

        for (Map.Entry<StudentIdCard, Student> entry:studentMap.entrySet()) {
            System.out.println("Key="+entry.getKey()+"Value = "+entry.getValue());
        }
    }
}
