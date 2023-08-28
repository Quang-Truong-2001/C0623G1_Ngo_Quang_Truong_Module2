package repository.person.impl;

import Utils.FileUtils;
import model.Customer;
import repository.convert.CustomerConvert;
import repository.person.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private final String CUSTOMER_PATH_NAME="E:\\C0623G1_Ngo_Quang_Truong_Module2\\furama_resort\\src\\data\\customer.csv";
//    private final List<Customer> customers=new ArrayList<>();

    @Override
    public List<Customer> getList() {
        List<Customer> customers= CustomerConvert.convertStringToCustomer(FileUtils.readFile(CUSTOMER_PATH_NAME));
        return customers;
    }

    @Override
    public void addNew(Customer customer) {
        List<Customer> customers=this.getList();
        customer.setId(String.valueOf(customers.size()+1));
        customers.add(customer);
        FileUtils.writeFile(CUSTOMER_PATH_NAME,CustomerConvert.convertCustomerToString(customers));
    }

    @Override
    public void updateCustomer(Customer customer) {
        List<Customer> customers=this.getList();
        for(Customer c: customers){
            if(customer.getId().equals(c.getId())){
                c.setId(customer.getId());
                c.setName(customer.getName());
                c.setBirthDay(customer.getBirthDay());
                c.setGender(customer.getGender());
                c.setIdentityCardNumber(customer.getIdentityCardNumber());
                c.setPhoneNumber(customer.getPhoneNumber());
                c.setEmail(customer.getEmail());
                c.setTypeCustomer(customer.getTypeCustomer());
                c.setAddress(customer.getAddress());
                break;
            }
        }
        FileUtils.writeFile(CUSTOMER_PATH_NAME,CustomerConvert.convertCustomerToString(customers));
    }

    @Override
    public void deleteCustomer(String id) {
        List<Customer> customers=this.getList();
        for(Customer c:customers){
            if(id.equals(c.getId())){
                customers.remove(id);
                break;
            }
        }
        FileUtils.writeFile(CUSTOMER_PATH_NAME,CustomerConvert.convertCustomerToString(customers));
    }

    @Override
    public List<Customer> searchByNameCustomer(String nameCustomer) {
        List<Customer> customers=this.getList();
        List<Customer> result=new ArrayList<>();
        for(Customer c:customers){
            if(c.getName().contains(nameCustomer)){
                result.remove(c);
            }
        }
        return result;
    }
}
