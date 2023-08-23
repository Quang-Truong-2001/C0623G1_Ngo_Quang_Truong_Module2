package ss17_io_binary_file_serialization.bai_tap.ex1.service.impl;

import ss17_io_binary_file_serialization.bai_tap.ex1.model.Product;
import ss17_io_binary_file_serialization.bai_tap.ex1.repository.IProductRepository;
import ss17_io_binary_file_serialization.bai_tap.ex1.repository.impl.ProductRepositoryImpl;
import ss17_io_binary_file_serialization.bai_tap.ex1.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private final IProductRepository repository=new ProductRepositoryImpl();
    @Override
    public void createProduct(Product product) {
        this.repository.createProduct(product);
    }

    @Override
    public List<Product> getProduct() {
        return this.repository.getProduct();
    }

    @Override
    public List<Product> searchProduct(String name) {
        return this.repository.searchProduct(name);
    }
}
