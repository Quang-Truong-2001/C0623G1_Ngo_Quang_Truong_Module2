package repository.person;

import model.Customer;
import repository.IRepository;

import java.util.List;

public interface ICustomerRepository extends IRepository<Customer> {
    void updateCustomer(Customer customer);
    void deleteCustomer(String id);
    List<Customer> searchByNameCustomer(String nameCustomer);
}
