package ss19_string_regex.luyentapmvc.mvc.service;

import ss19_string_regex.luyentapmvc.mvc.model.Product;

import java.util.List;

public interface IProductService {
    void createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
    List<Product> searchProductByName(String name);
    List<Product> getProduct();
    List<Product> sortByPrice(String direction);
}
