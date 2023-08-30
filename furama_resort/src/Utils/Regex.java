package Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static Pattern pattern;
    public static boolean checkIdEmployee(String regex){
        pattern=Pattern.compile("^NV-[0-9]{4}$");
        return pattern.matcher(regex).matches();
    }
    public static boolean checkPhoneNumber(String regex){
        pattern=Pattern.compile("^0[0-9]{9}$");
        return pattern.matcher(regex).matches();
    }
    public static boolean checkIdentityCardNumber(String regex){
        pattern=Pattern.compile("^[0-9]{9}$");
        Pattern pattern1=Pattern.compile("^[0-9]{12}$");
        if(pattern.matcher(regex).matches()==true||pattern1.matcher(regex).matches()==true){
            return true;
        }
        return false;
    }
    public static boolean checkBirthDay(String regex){
        pattern=Pattern.compile("\\d{1,2}/\\d{1,2}/\\d{4}");
        return pattern.matcher(regex).matches();
    }
    public static boolean checkEmail(String regex){
        pattern=Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        return pattern.matcher(regex).matches();
    }
    public static boolean checkIdCustomer(String regex){
        pattern=Pattern.compile("^KH-[0-9]{4}$");
        return pattern.matcher(regex).matches();
    }
    public static boolean checkIdServiceVilla(String regex){
        pattern=Pattern.compile("^SVVL-[0-9]{4}$");
        return pattern.matcher(regex).matches();
    }
    public static boolean checkIdServiceRoom(String regex){
        pattern=Pattern.compile("^SVRO-[0-9]{4}$");
        return pattern.matcher(regex).matches();
    }
    public static boolean checkIdServiceHouse(String regex){
        pattern=Pattern.compile("^SVHO-[0-9]{4}$");
        return pattern.matcher(regex).matches();
    }

}
