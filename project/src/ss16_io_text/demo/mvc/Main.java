package ss16_io_text.demo.mvc;

import ss16_io_text.demo.mvc.view.ProductView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ProductView view=new ProductView();
        view.render();
    }
}
