package controller.person;

import controller.IController;
import model.Customer;

import java.util.List;

public interface IControllerCustomer extends IController<Customer> {
    void updateCustomer(Customer customer);
    void deleteCustomer(String id);
    List<Customer> searchByNameCustomer(String nameCustomer);
}
