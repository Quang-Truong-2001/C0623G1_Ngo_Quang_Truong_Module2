package ss08_clean_code.mvc.view;

import java.util.Scanner;

public class StudentManagerProgramView {
    public void showMenu(){
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Thêm mới giảng viên hoặc học sinh");
        System.out.println("2. Xóa giảng viên hoặc học sinh");
        System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
        System.out.println("4. Thoát");
    }
    public void selectFunction(){
        int option;
        Scanner scanner=new Scanner(System.in);
        do{
            showMenu();
            System.out.println("Chọn chức năng: ");
            option=scanner.nextInt();
        }while (option<=0||option>4);
    }
}
