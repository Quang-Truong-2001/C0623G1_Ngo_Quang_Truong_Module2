package ss08_clean_code.demomvc.view;

import ss08_clean_code.demomvc.controller.OrderController;

import java.util.Scanner;

public class CoffeeAppView {
    public void showMenu(){
        System.out.println("1. Cafe sữa");
        System.out.println("2. Cafe đen");
        System.out.println("3. Cafe muối");
        System.out.println("4. Trà sữa");
    }
    public void orderCoffee() throws Exception {
        int option;
        Scanner scanner=new Scanner(System.in);
        do{
            showMenu();
            System.out.println("Mời bạn chọn món: ");
            option=scanner.nextInt();
        }while (option<=0||option>4);

        if(option==4){
            System.exit(1);
        }
        OrderController orderController=new OrderController();
        orderController.orderCoffee(option);
    }

}
