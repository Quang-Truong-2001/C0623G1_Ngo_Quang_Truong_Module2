package ss16_io_text.demo.mvc.service;

import ss16_io_text.demo.mvc.model.Product;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    void createProduct(Product product) throws IOException;
    void updateProduct(Product product) throws IOException;
    void deleteProduct(int id) throws IOException;
    List<Product> searchProductByName(String name);
    List<Product> getProduct();
    List<Product> sortByPrice(String direction);
}
