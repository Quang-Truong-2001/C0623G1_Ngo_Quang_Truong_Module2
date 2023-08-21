package mvc.view;

import mvc.controller.ProductController;
import mvc.model.Product;

import java.util.Scanner;

public class ProductView {
    Scanner scanner=new Scanner(System.in);
    private final ProductController controller=new ProductController();


    public void render(){
        int option=0;
        do{
            showMenu();
            System.out.println("Nhập chức năng: ");
            option=scanner.nextInt();
            switch (option){
                case 1:
                    Product product=new Product();
                    System.out.println("Nhập tên");
                    String name=scanner.nextLine();
                    product.setName(name);
                    System.out.println("Nhập giá");
                    Float price=Float.parseFloat(scanner.nextLine());
                    product.setPrice(price);
                    this.controller.createProduct(product);
                    break;
                case 4:
                    this.controller.getProduct();
            }
        }while(option>0&&option<6);
    }
    private void showMenu(){
        System.out.println("Menu");
        System.out.println("1. Thêm ");
        System.out.println("2. Sửa ");
        System.out.println("3. Xóa");
        System.out.println("4. Hiển thị");
        System.out.println("5. Sắp xếp");
    }
}
