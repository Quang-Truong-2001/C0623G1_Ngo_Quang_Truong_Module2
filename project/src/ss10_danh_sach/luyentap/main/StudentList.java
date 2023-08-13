package ss10_danh_sach.luyentap.main;

import ss10_danh_sach.luyentap.main.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
    private ArrayList<Student> list;

    public StudentList() {
        this.list=new ArrayList<Student>();
    }

    public StudentList(ArrayList<Student> list) {
        this.list = list;
    }
    public void addStudent(Student student){
        this.list.add(student);
    }
    public void displayStudentList(){
        for (Student student : list){
            System.out.println(student);
        }
    }
    public boolean checkEmptyList(){
        return this.list.isEmpty();
    }
    public int amountStudents(){
        return this.list.size();
    }
    public void listEmpty(){
        this.list.removeAll(list);
    }
    public boolean checkExistence(Student student){
        return this.list.contains(student);
    }
    public boolean deleteStudent(Student student){
        return this.list.remove(student);
    }
    public void findStudent(String name){
        for (Student student : list){
            if(student.getName().indexOf(name)>=0){
                System.out.println(student);
            }
        }
    }
    public void arrangeStudentReducePoint(){
        Collections.sort(this.list, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.getAveragePoint() < student2.getAveragePoint()) {
                    return -1;
                } else if (student1.getAveragePoint() > student2.getAveragePoint()){
                    return 1;
                } else {
                    return  0;
                }
            }
        });
    }
}

