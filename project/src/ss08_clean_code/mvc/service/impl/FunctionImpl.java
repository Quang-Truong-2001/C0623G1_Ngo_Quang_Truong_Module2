package ss08_clean_code.mvc.service.impl;

import ss08_clean_code.mvc.model.Student;
import ss08_clean_code.mvc.model.Teacher;
import ss08_clean_code.mvc.repository.IStudentRepository;
import ss08_clean_code.mvc.repository.ITeacherRepository;
import ss08_clean_code.mvc.repository.impl.StudentReponsitoryImpl;
import ss08_clean_code.mvc.repository.impl.TeacherRepositoryImpl;
import ss08_clean_code.mvc.service.IFunction;

import java.util.Scanner;

public class FunctionImpl implements IFunction {
    Scanner scanner = new Scanner(System.in);
    IStudentRepository repositoryStudent=new StudentReponsitoryImpl();
    ITeacherRepository repositoryTeacher=new TeacherRepositoryImpl();


    @Override
    public void addInfo(int select) {
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String birthDay = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        String speciality=null;
        String clazz=null;
        float point=0;
        if (select == 1) {
            System.out.println("Nhập chuyên môn");
            speciality = scanner.nextLine();
            Teacher teacher=new Teacher(id,name, birthDay,gender,speciality);
            repositoryTeacher.addInfoTeacher(teacher);
        } else if (select == 2) {
            System.out.println("Nhập lớp");
            clazz = scanner.nextLine();
            System.out.println("Nhập điểm");
            point = Integer.parseInt(scanner.nextLine());
            Student student=new Student(id,name,birthDay,gender,clazz,point);
            repositoryStudent.addInfoStudent(student);
        }
    }

    @Override
    public void delete(int select) {
        if (select == 1) {
            System.out.println("Nhập mã giáo viên cần xóa:");
            String idTeacher = scanner.nextLine();
            repositoryTeacher.deleteTeacher(idTeacher);
        } else if (select == 2) {
            System.out.println("Nhập mã học sinh cần xóa:");
            String idStudent = scanner.nextLine();
            repositoryStudent.deleteStudent(idStudent);
        }
    }
    @Override
    public void displayList(int select) {
        if (select == 1) {
            System.out.println("DANH SÁCH GIẢNG VIÊN");
            System.out.println(repositoryTeacher.displayAllTeacher());
        } else if (select == 2) {
            System.out.println("DANH SÁCH HỌC SINH");
            System.out.println(repositoryStudent.displayAllStudent());
        }
    }
}
