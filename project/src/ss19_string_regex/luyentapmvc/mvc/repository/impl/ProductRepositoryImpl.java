package ss19_string_regex.luyentapmvc.mvc.repository.impl;

import ss19_string_regex.luyentapmvc.mvc.model.Product;
import ss19_string_regex.luyentapmvc.mvc.repository.IProductRepository;
import ss19_string_regex.luyentapmvc.mvc.utils.FileUtils;

import java.util.*;

public class ProductRepositoryImpl implements IProductRepository {

    public static final String COMMA = ",";
    private final String FILE_PATH_PRODUCT="E:\\C0623G1_Ngo_Quang_Truong_Module2\\project\\src\\ss19_string_regex\\luyentapmvc\\mvc\\data\\dataluyentap.csv";

    //    private final List<Product> products=new ArrayList<>();
    @Override
    public void createProduct(Product product) {
        List<Product> products=this.getProduct();
        product.setId(products.size()+1);
        products.add(product);
        FileUtils.writeFile(FILE_PATH_PRODUCT,convertProductToString(products));
    }

    @Override
    public void updateProduct(Product product) {
        List<Product> products=this.getProduct();
        for(Product p:products){
            if(p.getId()==product.getId()){
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                break;
            }
        }
        FileUtils.writeFile(FILE_PATH_PRODUCT,convertProductToString(products));
    }

    @Override
    public void deleteProduct(int id) {
        List<Product> products=this.getProduct();
        for(Product p:products){
            if(p.getId()==id){
                products.remove(p);
                break;
            }
        }
        FileUtils.writeFile(FILE_PATH_PRODUCT,convertProductToString(products));
    }

    @Override
    public List<Product> searchProductByName(String name) {
        List<Product> products=this.getProduct();
        List<Product> search=new ArrayList<>();
        for(Product p:products){
            if(p.getName()==name){
                search.add(p);
            }
        }
        return search;
    }

    @Override
    public List<Product> getProduct() {
        List<String> productString= FileUtils.readFile(FILE_PATH_PRODUCT);
        return convertStringToProduct(productString);
    }

    @Override
    public List<Product> sortByPrice(String direction) {
        List<Product> products=this.getProduct();
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
    public static List<Product> convertStringToProduct(List<String> productString){
        List<Product> products=new ArrayList<>();
        for(String p:productString){
            String[] els=p.split(COMMA);
            products.add(new Product(Integer.parseInt(els[0]),els[1],Float.parseFloat(els[2])));
        }
        return products;
    }
    public static List<String> convertProductToString(List<Product> products){
        List<String> productString=new ArrayList<>();
        for(Product p:products){
            productString.add(p.getId()+COMMA+p.getName()+COMMA+p.getPrice());
        }
        return productString;
    }
}
