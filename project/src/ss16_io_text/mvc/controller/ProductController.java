package ss16_io_text.mvc.controller;

import ss16_io_text.demo.mvc.model.Product;
import ss16_io_text.demo.mvc.service.IProductService;
import ss16_io_text.demo.mvc.service.impl.ProductServiceImpl;

import java.io.IOException;
import java.util.List;

public class ProductController {
    private final IProductService productService=new ProductServiceImpl();
    public void createProduct(Product product) throws IOException {
        this.productService.createProduct(product);
    }
    public void updateProduct(Product product) throws IOException {
        this.productService.updateProduct(product);
    }
    public void deleteProduct(int id) throws IOException {
        this.productService.deleteProduct(id);
    }
    public List<Product> searchProductByName(String name){
        return this.productService.searchProductByName(name);
    }
    public List<Product> getProduct(){
        return this.productService.getProduct();
    }
    public List<Product> sortByPrice(String direction){
        return this.productService.sortByPrice(direction);
    }
}
