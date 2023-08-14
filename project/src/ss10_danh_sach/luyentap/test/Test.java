package ss10_danh_sach.luyentap.test;

import ss10_danh_sach.luyentap.main.Student;
import ss10_danh_sach.luyentap.main.StudentList;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();
        int select;
        do{
            System.out.println("MENU");
            System.out.println("Vui lòng chọn chức năng");
            System.out.println(
                            "1. Thêm sinh viên\n" +
                            "2. In danh sách\n" +
                            "3. Kiểm tra\n" +
                            "4. Số lượng sinh viên\n" +
                            "5. Làm rỗng danh sách sinh viên\n" +
                            "6. Kiểm tra sinh viên có tồn tại\n" +
                            "7. Xóa sinh viên\n" +
                            "8. Tìm kiếm tất cả sinh viên\n" +
                            "9. Xuất ra màn hình sinh viên có điểm từ cao đến thấp\n" +
                            "0. Thoát khỏi chương trình"
            );
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Nhập mã sinh viên: ");
                    String idStudent = scanner.nextLine();
                    System.out.println("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập năm sinh: ");
                    int dateBirth = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập điểm trung bình");
                    float averagePoint = Float.parseFloat(scanner.nextLine());
                    Student student = new Student(idStudent, name, dateBirth, averagePoint);
                    studentList.addStudent(student);
                    break;
                case 2:
                    studentList.displayStudentList();
                    break;
                case 3:
                    System.out.println("Danh sách có rỗng hay không"+studentList.checkEmptyList());
                    studentList.checkEmptyList();
                    break;
                case 4:
                    studentList.listEmpty();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }

        } while (select!=0);
    }

}
