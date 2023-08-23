package ss17_io_binary_file_serialization.bai_tap.ex1.controller;

import ss17_io_binary_file_serialization.bai_tap.ex1.model.Product;
import ss17_io_binary_file_serialization.bai_tap.ex1.service.IProductService;
import ss17_io_binary_file_serialization.bai_tap.ex1.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final IProductService productService=new ProductServiceImpl();
    public void createProduct(Product product){
        this.productService.createProduct(product);
    }
    public List<Product> getProduct(){
        return this.productService.getProduct();
    }
    public List<Product> searchProduct(String name){
        return this.productService.searchProduct(name);
    }
}
