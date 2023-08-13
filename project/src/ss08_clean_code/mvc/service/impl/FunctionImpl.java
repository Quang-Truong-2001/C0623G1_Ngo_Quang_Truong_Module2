package ss08_clean_code.mvc.service.impl;

import ss08_clean_code.mvc.service.IFunction;

import java.util.Scanner;

public class FunctionImpl implements IFunction {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add(int select) {
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String birthDay = scanner.nextLine();
        if (select == 1) {
            System.out.println("Nhập chuyên môn");
            String speciality = scanner.nextLine();
        } else if (select == 2) {
            System.out.println("Nhập lớp");
            String clazz = scanner.nextLine();
            System.out.println("Nhập điểm");
            int point = scanner.nextInt();
        }
    }

    @Override
    public void delete(int select) {
        if (select == 1) {
            System.out.println("Nhập mã giáo viên cần xóa:");
            String id = scanner.nextLine();
        } else if (select == 2) {
            System.out.println("Nhập mã học sinh cần xóa:");
            String idStudent = scanner.nextLine();
        }
    }
    @Override
    public void display(int select) {
        if (select == 1) {
            System.out.println("DANH SÁCH GIẢNG VIÊN");
        } else if (select == 2) {
            System.out.println("DANH SÁCH HỌC SINH");
        }
    }
}
