package controller.person;

import model.Customer;
import service.person.IServiceCustomer;
import service.person.impl.ServiceCustomerImpl;

import java.util.List;

public class ControllerCustomer  {
    private final IServiceCustomer iServiceCustomer=new ServiceCustomerImpl();
    public List<Customer> getList() {
        return this.iServiceCustomer.getList();
    }

    public void addNew(Customer customer) {
        this.iServiceCustomer.addNew(customer);
    }

    public void updateCustomer(Customer customer) {
        this.iServiceCustomer.updateCustomer(customer);
    }

    public void deleteCustomer(String id) {
        this.iServiceCustomer.deleteCustomer(id);
    }

    public List<Customer> searchByNameCustomer(String nameCustomer) {
        return this.iServiceCustomer.searchByNameCustomer(nameCustomer);
    }
}
