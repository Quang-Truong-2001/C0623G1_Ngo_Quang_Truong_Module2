package ss19_string_regex.bai_tap.ex2;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class PhoneNumbers {
    public static void main(String[] args) {
        String[] phoneNumbers={"(84)-(0978489648)","(a8)-(22222222)","(84)-(22b22222)","(84)-(9978489648)"};
        Pattern pattern=Pattern.compile("^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$");
        for(String phone:phoneNumbers){
            System.out.println(phone+ " có phải là số điện thoại hợp lệ không "+pattern.matcher(phone).matches());
        }
    }
}
