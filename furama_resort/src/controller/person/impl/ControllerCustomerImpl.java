package controller.person.impl;

import controller.person.IControllerCustomer;
import model.Customer;
import service.person.IServiceCustomer;
import service.person.impl.ServiceCustomerImpl;

import java.util.List;

public class ControllerCustomerImpl implements IControllerCustomer {
    private final IServiceCustomer iServiceCustomer=new ServiceCustomerImpl();
    @Override
    public List<Customer> getList() {
        return this.iServiceCustomer.getList();
    }

    @Override
    public void addNew(Customer customer) {
        this.iServiceCustomer.addNew(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        this.iServiceCustomer.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        this.iServiceCustomer.deleteCustomer(id);
    }

    @Override
    public List<Customer> searchByNameCustomer(String nameCustomer) {
        return this.iServiceCustomer.searchByNameCustomer(nameCustomer);
    }
}
