package mvc.repository.impl;

import mvc.model.Product;
import mvc.repository.IProductRepository;

import java.util.*;

public class ProductRepositoryImpl implements IProductRepository {
    private final List<Product> products=new ArrayList<>();
    @Override
    public void createProduct(Product product) {
        product.setId(this.products.size()+1);
        this.products.add(product);
    }

    @Override
    public void updateProduct(Product product) {
        for(Product p:products){
            if(p.getId()==product.getId()){
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                return;
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        for(Product p:products){
            if(p.getId()==id){
                products.remove(p);
                return;
            }
        }
    }

    @Override
    public List<Product> searchProductByName(String name) {
        List<Product> search=new LinkedList<>();
        for(Product p:products){
            if(p.getName()==name){
                search.add(p);
            }
        }
        return search;
    }

    @Override
    public List<Product> getProduct() {
        return products;
    }

    @Override
    public List<Product> sortByPrice(String direction) {
        switch (direction){
            case "ASC":
                List<Product> listASC=new ArrayList<>();
                listASC.addAll(products);
                Collections.sort(listASC, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return (int) (o1.getPrice()-o2.getPrice());
                    }
                });
                return listASC;
            case "DESC":
                List<Product> listDesc=new ArrayList<>();
                listDesc.addAll(products);
                Collections.sort(listDesc, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return (int) (o2.getPrice()-o1.getPrice());
                    }
                });
                return listDesc;
        }
        return products;
    }
}
