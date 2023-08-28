package service.person;

import model.Customer;
import model.Employee;
import service.IService;

import java.util.List;

public interface IServiceCustomer extends IService<Customer> {
    void updateCustomer(Customer customer);
    void deleteCustomer(String id);
    List<Customer> searchByNameCustomer(String nameCustomer);
}
