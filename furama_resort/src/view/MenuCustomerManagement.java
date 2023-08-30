package view;

import Utils.Check;
import Utils.Regex;
import controller.person.ControllerCustomer;
import model.Customer;

import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class MenuCustomerManagement {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ControllerCustomer iControlCustomer = new ControllerCustomer();
    private static final MenuCustomerManagement menuCustomerManagement = new MenuCustomerManagement();
    private static boolean valid = false;









    private static void displayMenuCustomerManagement() {
        System.out.println("===Menu Customer Management======");
        System.out.println("1. Display list Customer");
        System.out.println("2. Add new Customer");
        System.out.println("3. Edit Customer");
        System.out.println("4. Delete Customer");
        System.out.println("5. Search by name Customer");
        System.out.println("6. Return main menu");
    }

    public static void renderMenuCustomerManagement() {
        int option = 0;
        do {
            displayMenuCustomerManagement();
            option = FunctionCheckOption.checkOption();
            switch (option) {
                case 1:
                    List<Customer> list = iControlCustomer.getList();
                    for (Customer l : list) {
                        System.out.println(l);
                    }
                    break;
                case 2:
                    iControlCustomer.addNew(menuCustomerManagement.creatAndUpdateCustomer());
                    System.out.println("Thêm khách hàng thành công");
                    break;
                case 3:
                    System.out.println("Nhập id khách hàng cần sửa: ");
                    String idCustomer = scanner.nextLine();
                    Customer customer = menuCustomerManagement.creatAndUpdateCustomer();
                    customer.setId(idCustomer);
                    iControlCustomer.updateCustomer(customer);
                    break;
                case 4:
                    System.out.println("Nhập id khách hàng cần xóa");
                    String id = scanner.nextLine();
                    iControlCustomer.deleteCustomer(id);
                    break;
                case 5:
                    System.out.println("Nhập tên khách hàng cần tìm: ");
                    String name = scanner.nextLine();
                    iControlCustomer.searchByNameCustomer(name);
                    break;
                case 6:
                    FuramaView.render();
                    break;
            }
        } while (option > 0 || option < 7);
    }

    private Customer creatAndUpdateCustomer() {
        Customer customer = new Customer();
        customer.setId(enterId());
        customer.setName(enterName());
        customer.setBirthDay(enterBirthDay());
        customer.setGender(enterGender());
        customer.setIdentityCardNumber(enterIdentityCardNumber());
        customer.setPhoneNumber(enterPhoneNumber());
        customer.setEmail(enterEmail());
        customer.setTypeCustomer(enterType());
        customer.setAddress(enterAddress());
        return customer;
    }

    private static String enterId() {
        String idCustomer = null;
        do {
            try {
                System.out.println("Nhập mã khách hàng");
                idCustomer = scanner.nextLine();
                valid = Regex.checkIdCustomer(idCustomer);
                valid = !(Check.checkExistCustomer(idCustomer, iControlCustomer.getList()));
                if (!valid) {
                    System.out.println("Mã khách hàng đã tồn tại, vui lòng nhập lại");
                }
            } catch (Exception e){
                System.out.println("Thông tin sai. Vui lòng nhập lại: ");
                valid=false;
            }
        } while (!valid);
        return idCustomer;
    }
    private static String enterName(){
        String nameCustomer = null;
        do {
            try {
                System.out.println("Nhập tên khách hàng: ");
                nameCustomer = scanner.nextLine();
                valid = Check.checkName(nameCustomer);
            } catch (Exception e){
                System.out.println("Thông tin sai. Vui lòng nhập lại: ");
                valid=false;
            }
        } while (!valid);
        return nameCustomer;
    }
    private static String enterBirthDay(){
        String birthDay;
        do {
            System.out.println("Nhập ngày sinh: ");
            birthDay = scanner.nextLine();
            try {
                if (Check.validateAge(birthDay)) {
                    valid = true;
                }
            } catch (DateTimeParseException e) {
                valid = false;
                System.out.println("Sai thông tin. Vui lòng nhập lại");
            }
        } while (!valid);
        if (!Check.validateAge(birthDay)){
            System.out.println("Khách hàng không đủ tuổi");
            renderMenuCustomerManagement();
        }
        return birthDay;
    }
    private static String enterGender(){
        String gender;
        do{
            System.out.println("Nhập giới tính: ");
            gender=scanner.nextLine();
            valid=Check.checkGender(gender);
        } while(!valid);
        return gender;
    }
    private static String enterIdentityCardNumber(){
        String identityCardNumber;
        do {
            System.out.println("Nhập số căn cước công dân: ");
            identityCardNumber = scanner.nextLine();
            try {
                if (Regex.checkIdentityCardNumber(identityCardNumber)) {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai thông tin. Vui lòng nhập lại");
            }
        } while (!valid);
        return identityCardNumber;
    }
    private static String enterPhoneNumber(){
        String phoneNumber = null;
        do {
            try {
                System.out.println("Nhập số điện thoại: ");
                phoneNumber = scanner.nextLine();
                valid = Regex.checkPhoneNumber(phoneNumber);
            } catch (Exception e){
                System.out.println("Thông tin sai. Vui lòng nhập lại: ");
                valid=false;
            }
        } while (!valid);
        return phoneNumber;
    }
    private static String enterEmail(){
        String email;
        do{
            System.out.println("Nhập email: ");
            email=scanner.nextLine();
            valid=Regex.checkEmail(email);
        }while(!valid);
        return email;
    }
    private static String enterType(){
        String type;
        System.out.println("Nhập loại khách hàng: ");
        type=scanner.nextLine();
        return type;
    }
    private static String enterAddress(){
        String address;
        System.out.println("Nhập địa chỉ: ");
        address=scanner.nextLine();
        return address;
    }
}
