package ss16_io_text.bai_tap.ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadFile file=new ReadFile();
        List<String> result= file.readFile("E:\\C0623G1_Ngo_Quang_Truong_Module2\\project\\src\\ss16_io_text\\bai_tap\\ex2\\country.csv");
        file.display(result);
    }
}
