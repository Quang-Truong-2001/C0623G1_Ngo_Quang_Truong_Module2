package ss12_binarytree.productManager.repository.impl;

import ss12_binarytree.productManager.model.Product;
import ss12_binarytree.productManager.repository.IProductRepository;

import java.util.*;

public class ProductRepositoryImpl implements IProductRepository<Product> {
    Scanner scanner=new Scanner(System.in);
    private static List<Product> products=new LinkedList<>();
    static {
        products.add(new Product("1","Hoa",10000));
        products.add(new Product("2","Quả", 50000));
        products.add(new Product("3","Pepsi", 779993));
    }
    @Override
    public void addProductRepo(Product product) {
        products.add(product);
    }

    @Override
    public void editInfoRepo(String id, String newName, int newPrice) {
        for(int i=0;i<products.size();i++){
            if(products.get(i).getId().equals(id)){
                products.get(i).setName(newName);
                products.get(i).setPrice(newPrice);
                break;
            }
        }
    }

    @Override
    public void deleteRepo(String id) {
        for(int i=0;i<products.size();i++){
            if(products.get(i).getId().equals(id)){
                products.remove(products.get(i));
                break;
            }
        }
    }

    @Override
    public List<Product> displayRepo() {
        return products;
    }


    @Override
    public void searchRepo(String id) {
        for(int i=0;i<products.size();i++){
            if(products.get(i).getId().equals(id)){
                System.out.println(products.get(i));
                break;
            }
        }
    }

    @Override
    public List<Product> sortUpProductRepo() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice()>o2.getPrice()?1:-1;
            }
        });
        return products;
    }

    @Override
    public List<Product> sortDownProductRepo() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice()<o2.getPrice()?1:-1;
            }
        });
        return products;
    }
}
