package ss16_io_text.mvc.repository;

import ss16_io_text.demo.mvc.model.Product;

import java.io.IOException;
import java.util.List;

public interface IProductRepository {
    void createProduct(Product product) throws IOException;
    void updateProduct(Product product) throws IOException;
    void deleteProduct(int id) throws IOException;
    List<Product> searchProductByName(String name);
    List<Product> getProduct();
    List<Product> sortByPrice(String direction);
}
