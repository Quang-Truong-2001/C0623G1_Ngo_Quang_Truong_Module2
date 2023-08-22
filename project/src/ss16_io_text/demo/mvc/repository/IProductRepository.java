package ss16_io_text.demo.mvc.repository;

import ss16_io_text.demo.mvc.model.Product;

import java.util.List;

public interface IProductRepository {
    void createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
    List<Product> searchProductByName(String name);
    List<Product> getProduct();
    List<Product> sortByPrice(String direction);
}
