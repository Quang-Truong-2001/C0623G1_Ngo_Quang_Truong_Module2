package ss12_BinaryTree.productManager.view;

import ss08_clean_code.mvc.controller.OptionController;
import ss12_BinaryTree.productManager.controller.Controller;

import java.util.Scanner;

public class ProductManagerView {
    Scanner scanner=new Scanner(System.in);
    Controller controller=new Controller();
    public void showMenu(){
        int option=0;
        do{
            System.out.println("Chương trình quản lý sản phầm");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Xem danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo thứ tự tăng dần");
            System.out.println("7. Sắp xếp sản phẩm theo thứ tự giảm dần");
            System.out.println("Nhập chức năng: ");
            option=scanner.nextInt();
            controller.optionFunctionProductManager(option);
        }while(option>0||option<7);
    }
}
