package controller.person;

import model.Employee;
import service.person.IServiceEmployee;
import service.person.impl.ServiceEmployeeImpl;

import java.util.List;

public class ControllerEmployee {
    private final IServiceEmployee iServiceEmployee=new ServiceEmployeeImpl();


    public List<Employee> getList() {
        return this.iServiceEmployee.getList();
    }


    public void addNew(Employee employee) {
        this.iServiceEmployee.addNew(employee);
    }


    public void updateEmployee(Employee employee) {
        this.iServiceEmployee.updateEmployee(employee);
    }


    public void deleteEmployee(String id) {
        this.iServiceEmployee.deleteEmployee(id);
    }

    public List<Employee> searchByNameEmployee(String nameEmployee) {
        return this.iServiceEmployee.searchByNameEmployee(nameEmployee);
    }
}
