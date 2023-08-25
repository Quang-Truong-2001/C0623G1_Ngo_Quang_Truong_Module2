package ss19_string_regex.luyentapmvc.mvc.repository;

import ss19_string_regex.luyentapmvc.mvc.model.Product;

import java.util.List;

public interface IProductRepository {
    void createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
    List<Product> searchProductByName(String name);
    List<Product> getProduct();
    List<Product> sortByPrice(String direction);
}
