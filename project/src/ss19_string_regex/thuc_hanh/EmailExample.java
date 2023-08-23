package ss19_string_regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern patter;
    private Matcher matcher;
    private static final String EMAIL_REGEX="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)$";
    public EmailExample(){
        patter = Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String regex){
        matcher = patter.matcher(regex);
        return matcher.matches();
    }

}
