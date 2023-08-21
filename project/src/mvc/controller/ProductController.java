package mvc.controller;

import mvc.model.Product;
import mvc.service.IProductService;
import mvc.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final IProductService productService=new ProductServiceImpl();
    public void createProduct(Product product){
        this.productService.createProduct(product);
    }
    public void updateProduct(Product product){
        this.productService.updateProduct(product);
    }
    public void deleteProduct(int id){
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
