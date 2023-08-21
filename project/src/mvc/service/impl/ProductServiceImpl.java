package mvc.service.impl;

import mvc.model.Product;
import mvc.repository.IProductRepository;
import mvc.repository.impl.ProductRepositoryImpl;
import mvc.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private final IProductRepository repository=new ProductRepositoryImpl();


    @Override
    public void createProduct(Product product) {
        this.repository.createProduct(product);
    }

    @Override
    public void updateProduct(Product product) {
        this.repository.updateProduct(product);
    }

    @Override
    public void deleteProduct(int id) {
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
