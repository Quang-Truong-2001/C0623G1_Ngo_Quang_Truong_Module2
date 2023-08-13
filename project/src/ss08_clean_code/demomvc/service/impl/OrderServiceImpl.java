package ss08_clean_code.demomvc.service.impl;

import ss08_clean_code.demomvc.service.IOrderService;

public class OrderServiceImpl implements IOrderService {

    @Override
    public void orderCoffee(int option) throws Exception {
        switch (option){
            case 1:
                System.out.println("Đã đặt càfe sữa - của bạn hết 15k");
                break;
            case 2:
                System.out.println("Đã đặt càfe đen - của bạn hết 12k");
                break;
            case 3:
                System.out.println("Đã đặt càfe muối - của bạn hết 25k");
                break;
            default:
                throw new Exception("Chưa có món phù hợp");
        }
    }
}
