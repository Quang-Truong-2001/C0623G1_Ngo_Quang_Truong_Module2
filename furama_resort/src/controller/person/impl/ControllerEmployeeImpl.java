package controller.person.impl;

import controller.person.IControllerEmployee;
import model.Employee;
import service.person.IServiceEmployee;
import service.person.impl.ServiceEmployeeImpl;

import java.util.List;

public class ControllerEmployeeImpl implements IControllerEmployee {
    private final IServiceEmployee iServiceEmployee=new ServiceEmployeeImpl();

    @Override
    public List<Employee> getList() {
        return this.iServiceEmployee.getList();
    }

    @Override
    public void addNew(Employee employee) {
        this.iServiceEmployee.addNew(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        this.iServiceEmployee.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(String id) {
        this.iServiceEmployee.deleteEmployee(id);
    }

    @Override
    public List<Employee> searchByNameEmployee(String nameEmployee) {
        return this.iServiceEmployee.searchByNameEmployee(nameEmployee);
    }
}
