package ss08_clean_code.mvc.view;

import ss08_clean_code.mvc.controller.OptionController;
import ss08_clean_code.mvc.model.Person;
import ss08_clean_code.mvc.model.Student;
import ss08_clean_code.mvc.model.Teacher;

import java.util.Scanner;

public class ManagerProgramView {
    Scanner scanner = new Scanner(System.in);
    private int select;
    private int option;
    OptionController optionController = new OptionController();
    public void showMenu() {
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Thêm mới giảng viên hoặc học sinh");
        System.out.println("2. Xóa giảng viên hoặc học sinh");
        System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
        System.out.println("4. Thoát");
    }

    public void selectFunction() throws Exception {
        do{
            do {
                showMenu();
                System.out.println("Chọn chức năng: ");
                option = scanner.nextInt();
            } while (option <= 0 || option > 4);
            if (option == 4) {
                System.exit(7);
            }
            do {
                System.out.println("Chọn đối tượng");
                System.out.println("1. Giáo viên");
                System.out.println("2. Học sinh");
                select = scanner.nextInt();
            } while (select < 0 || select > 2);
            optionController.optionFunction(select, option);
        }while (option<0||option>3);
    }
}
