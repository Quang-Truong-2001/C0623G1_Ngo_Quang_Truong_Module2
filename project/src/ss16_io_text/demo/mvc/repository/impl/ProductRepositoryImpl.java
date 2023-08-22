package ss16_io_text.demo.mvc.repository.impl;

import ss16_io_text.demo.mvc.model.Product;
import ss16_io_text.demo.mvc.repository.IProductRepository;
import ss16_io_text.demo.mvc.utils.FileUtils;

import java.util.*;

public class ProductRepositoryImpl implements IProductRepository {

    public static final String COMMAN = ",";
    private static final String FILE_PATH="E:\\C0623G1_Ngo_Quang_Truong_Module2\\project\\src\\ss16_io_text\\demo\\mvc\\data\\data.csv";

    //    private final List<Product> products=new ArrayList<>();
    @Override
    public void createProduct(Product product) {
        List<Product> products=this.getProduct();
        product.setId(products.size()+1);
        products.add(product);
        FileUtils.writerFile(FILE_PATH,this.convertToString(products));
    }

    @Override
    public void updateProduct(Product product) {
        List<Product> products=this.getProduct();
        for(Product p:products){
            if(p.getId()==product.getId()){
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                return;
            }
        }
        FileUtils.writerFile(FILE_PATH,this.convertToString(products));
    }

    @Override
    public void deleteProduct(int id) {
        List<Product> products=this.getProduct();
        for(Product p:products){
            if(p.getId()==id){
                products.remove(p);
                return;
            }
        }
        FileUtils.writerFile(FILE_PATH,this.convertToString(products));
    }

    @Override
    public List<Product> searchProductByName(String name) {
        List<Product> products=this.getProduct();
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
        List<String> products= FileUtils.readFile(FILE_PATH);
        return this.convertToProduct(products);
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
    private List<String> convertToString(List<Product> products){
        List<String> productString=new ArrayList<>();
        for(Product p:products){
            productString.add(p.getId()+ COMMAN+p.getName()+COMMAN+p.getPrice());
        }
        return productString;
    }
    private List<Product> convertToProduct(List<String> data) {
        List<Product> products=new ArrayList<>();
        for(String p:data){
            String[] els=p.split(COMMAN);
            products.add(new Product(Integer.parseInt(els[0]),els[1],Float.parseFloat(els[2])));
        }
        return products;
    }

}
