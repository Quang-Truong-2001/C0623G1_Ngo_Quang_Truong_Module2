package ss08_clean_code.mvc.service.impl;

import ss08_clean_code.mvc.model.Teacher;
import ss08_clean_code.mvc.service.IFunction;

import java.util.Scanner;

public class FunctionImpl implements IFunction {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add(int select) {

    }

    @Override
    public void delete(int select) {
        if (select == 1) {
            System.out.println("Nhập mã giáo viên cần xóa:");
            String idTeacher = scanner.nextLine();
        } else if (select == 2) {
            System.out.println("Nhập mã học sinh cần xóa:");
            String idStudent = scanner.nextLine();
        }
    }
    @Override
    public void displayList(int select) {
        if (select == 1) {
            System.out.println("DANH SÁCH GIẢNG VIÊN");
        } else if (select == 2) {
            System.out.println("DANH SÁCH HỌC SINH");
        }
    }
}
