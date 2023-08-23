package ss16_io_text.demo.mvc.view;

import ss16_io_text.demo.mvc.controller.ProductController;
import ss16_io_text.demo.mvc.model.Product;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    Scanner scanner=new Scanner(System.in);
    private final ProductController controller=new ProductController();


    public void render() throws IOException {
        int option=0;
        do{
            showMenu();
            System.out.println("Nhập chức năng: ");
            option=Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    Product product=create();
                    this.controller.createProduct(product);
                    break;
                case 2:
                    Product update=update();
                    this.controller.updateProduct(update);
                    break;
                case 3:
                    System.out.println("Nhập id sản phẩm cần xóa:");
                    int id=Integer.parseInt(scanner.nextLine());
                    this.controller.deleteProduct(id);
                    break;
                case 4:
                    List<Product> products=this.controller.getProduct();
                    for(Product p:products){
                        System.out.println(p.toString());
                    }
                    break;
                case 5:
                    System.out.println("Nhập hướng sắp xếp: ASC or DESC");
                    String direction=scanner.nextLine();
                    List<Product> list=this.controller.sortByPrice(direction);
                    for(Product p:list){
                        System.out.println(p.toString());
                    }
                    break;
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
    private Product create(){
        Product product=new Product();
        System.out.println("Nhập tên");
        String name=scanner.nextLine();
        product.setName(name);
        System.out.println("Nhập giá");
        Float price=Float.parseFloat(scanner.nextLine());
        product.setPrice(price);
        return product;
    }

    private Product update(){
        Product product=new Product();
        System.out.println("Nhập id cần cập nhật: ");
        int id=Integer.parseInt(scanner.nextLine());
        product.setId(id);
        System.out.println("Nhập tên");
        String name=scanner.nextLine();
        product.setName(name);
        System.out.println("Nhập giá");
        Float price=Float.parseFloat(scanner.nextLine());
        product.setPrice(price);
        return product;
    }
}
