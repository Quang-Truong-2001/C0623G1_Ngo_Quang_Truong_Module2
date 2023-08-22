package ss16_io_text.demo.mvc.service;

import ss16_io_text.demo.mvc.model.Product;

import java.util.List;

public interface IProductService {
    void createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
    List<Product> searchProductByName(String name);
    List<Product> getProduct();
    List<Product> sortByPrice(String direction);
}
