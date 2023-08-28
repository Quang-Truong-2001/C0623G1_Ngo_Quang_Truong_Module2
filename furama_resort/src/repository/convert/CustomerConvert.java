package repository.convert;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerConvert {

    public static final String COMMA = ",";

    public static List<Customer> convertStringToCustomer(List<String> dataCustomer){
        List<Customer> customers=new ArrayList<>();
        String[] els;
        for(String e:dataCustomer){
            els=e.split(COMMA);
            customers.add(new Customer(els[0],els[1],els[2],els[3],els[4],els[5],els[6],els[7],els[8]));
        }
        return customers;
    }
    public static List<String> convertCustomerToString(List<Customer> customers){
        List<String> listCustomersData=new ArrayList<>();
        for(Customer c:customers){
            listCustomersData.add(c.getId()+COMMA+c.getName()+COMMA+c.getBirthDay()+COMMA+c.getGender()+COMMA+c.getIdentityCardNumber()+COMMA+c.getPhoneNumber()+COMMA+c.getEmail()+COMMA+c.getTypeCustomer()+COMMA+c.getAddress());
        }
        return listCustomersData;
    }
}
