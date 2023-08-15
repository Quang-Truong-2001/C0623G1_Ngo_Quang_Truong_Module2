package ss08_clean_code.mvc.repository.impl;

import ss08_clean_code.mvc.model.Student;
import ss08_clean_code.mvc.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentReponsitoryImpl implements IStudentRepository<Student> {
    private static List<Student> students=new ArrayList<>();
    static {
        students.add(new Student("1","Nguyễn Văn A","2001","Nam","C0623G1",5));
        students.add(new Student("2","Nguyễn Văn B","2001","Nam","C0623G1",5));
        students.add(new Student("3","Nguyễn Văn C","2001","Nam","C0623G1",5));
        students.add(new Student("4","Nguyễn Văn D","2001","Nam","C0623G1",5));
    }

    @Override
    public void addInfoStudent(Student student) {
        students.add(student);
    }

    @Override
    public void deleteStudent(String id) {
        for (int i=0;i<students.size();i++){
            if(students.get(i).getId()==id){
                students.remove(students.get(i));
            }
        }
    }
    @Override
    public List<Student> displayAllStudent() {
        return students;
    }
}
