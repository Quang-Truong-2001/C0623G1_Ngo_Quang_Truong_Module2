package mvc;

import mvc.view.ProductView;

public class Main {
    public static void main(String[] args) {
        ProductView view=new ProductView();
        view.render();
    }
}
