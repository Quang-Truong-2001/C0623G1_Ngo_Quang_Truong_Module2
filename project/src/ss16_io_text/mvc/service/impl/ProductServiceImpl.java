package ss16_io_text.mvc.service.impl;

import ss16_io_text.demo.mvc.model.Product;
import ss16_io_text.demo.mvc.repository.IProductRepository;
import ss16_io_text.demo.mvc.repository.impl.ProductRepositoryImpl;
import ss16_io_text.demo.mvc.service.IProductService;

import java.io.IOException;
import java.util.List;

public class ProductServiceImpl implements IProductService {
    private final IProductRepository repository= new ProductRepositoryImpl();


    @Override
    public void createProduct(Product product) throws IOException {
        this.repository.createProduct(product);
    }

    @Override
    public void updateProduct(Product product) throws IOException {
        this.repository.updateProduct(product);
    }

    @Override
    public void deleteProduct(int id) throws IOException {
        this.repository.deleteProduct(id);
    }

    @Override
    public List<Product> searchProductByName(String name) {
        return this.repository.searchProductByName(name);
    }

    @Override
    public List<Product> getProduct() {
        return this.repository.getProduct();
    }

    @Override
    public List<Product> sortByPrice(String direction) {
        return this.repository.sortByPrice(direction);
    }
}
