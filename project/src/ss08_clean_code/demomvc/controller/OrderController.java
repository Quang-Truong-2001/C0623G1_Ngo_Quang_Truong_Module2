package ss08_clean_code.demomvc.controller;

import ss08_clean_code.demomvc.service.IOrderService;
import ss08_clean_code.demomvc.service.impl.OrderServiceImpl;

public class OrderController {
    public void orderCoffee(int option) throws Exception{
        IOrderService orderService=new OrderServiceImpl();
        orderService.orderCoffee(option);
    }
}
