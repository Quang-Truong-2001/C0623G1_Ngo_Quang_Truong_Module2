package ss12_binarytree.productManager.service.impl;

import ss12_binarytree.productManager.model.Product;
import ss12_binarytree.productManager.repository.IProductRepository;
import ss12_binarytree.productManager.repository.impl.ProductRepositoryImpl;
import ss12_binarytree.productManager.service.IFunction;

import java.util.Scanner;

public class FunctionImpl implements IFunction {
    Scanner scanner=new Scanner(System.in);
    private final IProductRepository productRepository=new ProductRepositoryImpl();
    @Override
    public void addProduct() {
        System.out.println("Nhập id");
        String id=scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name=scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price=scanner.nextInt();
        Product product=new Product(id,name,price);
        productRepository.addProductRepo(product);
    }

    @Override
    public void editInfo() {
        String newName;
        int newPrice;
        System.out.println("Nhập id");
        String id=scanner.nextLine();
        System.out.println("Nhập tên cần thay");
        newName=scanner.nextLine();
        System.out.println("Nhập giá cần thay");
        newPrice=scanner.nextInt();
        productRepository.editInfoRepo(id, newName, newPrice);
    }

    @Override
    public void delete() {
        System.out.println("Nhập id");
        String id=scanner.nextLine();
        productRepository.deleteRepo(id);
    }


    @Override
    public void display() {
        System.out.println(productRepository.displayRepo());
    }
    @Override
    public void search() {
        System.out.println("Nhập id");
        String id=scanner.nextLine();
        productRepository.searchRepo(id);
    }

    @Override
    public void sortUpProduct() {
        System.out.println(productRepository.sortUpProductRepo());
    }

    @Override
    public void sortDownProduct() {
        System.out.println(productRepository.sortDownProductRepo());
    }
}
