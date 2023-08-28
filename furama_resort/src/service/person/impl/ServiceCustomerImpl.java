package service.person.impl;

import model.Customer;
import repository.person.ICustomerRepository;
import repository.person.impl.CustomerRepositoryImpl;
import service.person.IServiceCustomer;

import java.util.List;

public class ServiceCustomerImpl implements IServiceCustomer {
    private final ICustomerRepository iCustomerRepository=new CustomerRepositoryImpl();

    @Override
    public List<Customer> getList() {
        return this.iCustomerRepository.getList();
    }

    @Override
    public void addNew(Customer customer) {
        this.iCustomerRepository.addNew(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        this.iCustomerRepository.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        this.iCustomerRepository.deleteCustomer(id);
    }

    @Override
    public List<Customer> searchByNameCustomer(String nameCustomer) {
        return this.iCustomerRepository.searchByNameCustomer(nameCustomer);
    }
}
