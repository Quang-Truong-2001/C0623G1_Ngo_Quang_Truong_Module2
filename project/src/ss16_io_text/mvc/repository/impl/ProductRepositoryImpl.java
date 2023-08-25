package ss16_io_text.mvc.repository.impl;

import ss16_io_text.demo.mvc.model.Product;
import ss16_io_text.demo.mvc.repository.IProductRepository;

import java.io.*;
import java.util.*;

public class ProductRepositoryImpl implements IProductRepository {

    public static final String COMMAN = ",";
    private static final String FILE_PATH_BINARY="E:\\C0623G1_Ngo_Quang_Truong_Module2\\project\\src\\ss17_io_binary_file_serialization\\demo\\mvc\\data\\dataBinary.csv";
    //    private final List<Product> products=new ArrayList<>();
    @Override
    public void createProduct(Product product) {
        List<Product> products=this.getProduct();
        product.setId(products.size()+1);
        products.add(product);
        this.writeFileWithByteStream(FILE_PATH_BINARY,products);
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
        this.writeFileWithByteStream(FILE_PATH_BINARY,products);
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
        this.writeFileWithByteStream(FILE_PATH_BINARY,products);
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
        List<Product> products= this.readFileWithByteStream(FILE_PATH_BINARY);
        return products;
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
    private List<Product> readFileWithByteStream(String pathName){
        File file;
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;
        try {
            file=new File(pathName);
            if(!file.exists()){
                file.createNewFile();
            }
            fileInputStream=new FileInputStream(file);
            objectInputStream=new ObjectInputStream(fileInputStream);
            return (List<Product>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(objectInputStream!=null){
                    objectInputStream.close();
                }
                if(fileInputStream!=null){
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return new ArrayList<>();
    }
    private void writeFileWithByteStream(String pathName, List<Product> products){
        File file;
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try{
            file=new File(pathName);
            if(!file.exists()){
                file.createNewFile();
            }
            fileOutputStream=new FileOutputStream(file);
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(objectOutputStream!=null){
                    objectOutputStream.close();
                }
                if(fileOutputStream!=null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
