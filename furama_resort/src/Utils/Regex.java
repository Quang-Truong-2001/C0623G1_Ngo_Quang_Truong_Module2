package Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static Pattern pattern;
    public static boolean checkIdEmployee(String regex){
        pattern=Pattern.compile("^NV-[0-9]{4}$");
        return pattern.matcher(regex).matches();
    }
//    public boolean checkNameEmployee(String regex){
//        pattern=Pattern.compile("^[A-Z]{1}[a-z]+}")
//    }
}
