package ss08_clean_code.demomvc;

import ss08_clean_code.demomvc.view.CoffeeAppView;

public class Main {
    public static void main(String[] args) throws Exception {
        CoffeeAppView coffeeAppView=new CoffeeAppView();
        coffeeAppView.orderCoffee();
    }
}
