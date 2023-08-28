package repository.convert;

import model.Customer;
import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCovert {
    public static final String COMMA = ",";

    public static List<Employee> convertStringToEmployee(List<String> employeeData){
        List<Employee> employees=new ArrayList<>();
        String[] els;
        for(String c:employeeData){
            els=c.split(COMMA);
            employees.add(new Employee(els[0],els[1],els[2],els[3],els[4],els[5],els[6],els[7],els[8],els[9]));
        }
        return employees;
    }
    public static List<String> convertEmployeeToString(List<Employee> employees){
        List<String> data=new ArrayList<>();
        for(Employee d:employees){
            data.add(d.getId()+COMMA+d.getName()+COMMA+d.getBirthDay()+COMMA+d.getGender()+COMMA+d.getIdentityCardNumber()+COMMA+d.getPhoneNumber()+COMMA+d.getEmail()+COMMA+d.getQualifications()+COMMA+d.getPosition()+COMMA+d.getWage());
        }
        return data;
    }
}
