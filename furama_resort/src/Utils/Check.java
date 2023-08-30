package Utils;

import model.Customer;
import model.Employee;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Check {

    public static boolean checkName(String name){
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
                return true;
            }
        }
        return false;
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
    public static boolean checkArea(Double area){
        if(area>30){
            return true;
        }
        return false;
    }
    public static boolean checkPriceService(Double price){
        if(price>0){
            return true;
        }
        return false;
    }
    public static boolean checkGender(String gender){
        if(gender.equals("Nam")||gender.equals("Nu")||gender.equals("Khac")){
            return true;
        }
        return false;
    }
    public static boolean checkNumbersOfPeople(int numberOfPeople){
        if(numberOfPeople>0){
            return true;
        }
        return false;
    }
    public static boolean checkTypeService(String typeService){
        if(typeService.equals("year")||typeService.equals("month")||typeService.equals("day")||typeService.equals("hour")){
            return true;
        }
        return false;
    }
    public static boolean checkNumbersOfFloor(int numberOfFloor){
        if(numberOfFloor>0){
            return true;
        }
        return false;
    }
    public static boolean checkPoolArea(int poolArea){
        if(poolArea>0){
            return true;
        }
        return false;
    }
}
