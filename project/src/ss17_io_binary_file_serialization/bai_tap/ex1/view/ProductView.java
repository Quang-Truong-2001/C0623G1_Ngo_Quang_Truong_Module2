package ss17_io_binary_file_serialization.bai_tap.ex1.view;

import ss17_io_binary_file_serialization.bai_tap.ex1.controller.ProductController;
import ss17_io_binary_file_serialization.bai_tap.ex1.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private final ProductController productController=new ProductController();
    private final Scanner scanner=new Scanner(System.in);
    private void showMenu(){
        System.out.println("========MENU========");
        System.out.println("1.Thêm");
        System.out.println("2.Hiển thị");
        System.out.println("3.Tìm kiếm sản phẩm theo tên");
    }
    public void render(){
        int option=0;
        do{
            showMenu();
            System.out.println("Nhập chức năng: ");
            option=Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    Product product=newProduct();
                    this.productController.createProduct(product);
                    break;
                case 2:
                    List<Product> products=this.productController.getProduct();
                    for(Product p:products){
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Nhập tên sản phẩm cần tìm:");
                    String name=scanner.nextLine();
                    List<Product> productSearch= this.productController.searchProduct(name);
                    for(Product p:productSearch){
                        System.out.println(p);
                    }
                    break;
            }

        }while(option>0||option<4);
    }
    private Product newProduct(){
        Product product=new Product();
        System.out.println("Nhập tên sản phẩm");
        product.setNameProduct(scanner.nextLine());
        System.out.println("Nhập giá sản phẩm");
        product.setPrice(Float.parseFloat(scanner.nextLine()));
        System.out.println("Nhập hãng sản xuất");
        product.setBrand(scanner.nextLine());
        System.out.println("Nhập mô tả");
        product.setDescription(scanner.nextLine());
        return product;
    }
}
