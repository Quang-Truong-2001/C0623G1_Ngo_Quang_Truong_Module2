package ss17_io_binary_file_serialization.bai_tap.ex1.repository.impl;

import ss17_io_binary_file_serialization.bai_tap.ex1.utils.FileUtils;
import ss17_io_binary_file_serialization.bai_tap.ex1.model.Product;
import ss17_io_binary_file_serialization.bai_tap.ex1.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {
//    private final List<Product> products=new ArrayList<>();
    private final String NAME_PATH_EX1="E:\\C0623G1_Ngo_Quang_Truong_Module2\\project\\src\\ss17_io_binary_file_serialization\\bai_tap\\data\\dataex1.csv";
    @Override
    public void createProduct(Product product) {
        List<Product> products=this.getProduct();
        product.setId(products.size()+1);
        products.add(product);
        FileUtils.writeFileBinary(NAME_PATH_EX1,products);
    }

    @Override
    public List<Product> getProduct() {
        List<Product> products= FileUtils.readFileBinary(NAME_PATH_EX1);
        return products;
    }

    @Override
    public List<Product> searchProduct(String name) {
        List<Product> products=this.getProduct();
        List<Product> productSearch=new ArrayList<>();
        for(Product p:products){
            if(p.getNameProduct().startsWith(name)){
                productSearch.add(p);
            }
        }
        return productSearch;
    }
}
