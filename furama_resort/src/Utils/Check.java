package Utils;

import model.Customer;
import model.Employee;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Check {

    public static boolean checkName(String name){
        boolean valid=false;
        int count=0;
        String[] els=name.split("");
        String[] els2=name.split(" ");
        if(els[0].equals(els[0].toUpperCase())){
            for(int i=1;i< els.length-1;i++){
                if(els[i].equals(" ") && els[i+1].equals(els[i+1].toUpperCase())){
                    count++;
                }
            }
            if(count == els2.length-1){
                valid=true;
            }
        }
        return valid;
    }
    public static boolean validateAge(String birthDay){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dob= LocalDate.parse(birthDay,formatter);
        LocalDate today=LocalDate.now();
        Period period=Period.between(dob,today);
        return period.getYears()>=18;
    }
    public static boolean checkExistEmployee(String id, List<Employee> employees){
        for(Employee c:employees){
            if(c.getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    public static boolean checkExistCustomer(String id, List<Customer> customers){
        for(Customer c:customers){
            if(c.getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
