package ss19_string_regex.thuc_hanh.th2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX="^[_a-z0-9]{6,}$";
    public AccountExample(){
    }
    public boolean validate(String regex){
        Pattern pattern=Pattern.compile(ACCOUNT_REGEX);
        return pattern.matcher(regex).matches();
    }
}
