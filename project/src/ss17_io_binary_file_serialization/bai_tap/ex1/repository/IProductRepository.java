package ss17_io_binary_file_serialization.bai_tap.ex1.repository;

import ss17_io_binary_file_serialization.bai_tap.ex1.model.Product;

import java.util.List;

public interface IProductRepository {
    void createProduct(Product product);
    List<Product> getProduct();
    List<Product> searchProduct(String name);
}
