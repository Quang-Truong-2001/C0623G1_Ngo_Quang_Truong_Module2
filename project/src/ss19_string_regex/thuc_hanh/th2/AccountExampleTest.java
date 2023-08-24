package ss19_string_regex.thuc_hanh.th2;

public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] validAccount=new String[]{"123abc_","_abc123","________","123456","abcdefgh"};
    public static final String[] invalidAccount=new String[]{".@","12345","1234_","avcde"};

    public static void main(String[] args) {
        accountExample=new AccountExample();
        for(String account:validAccount){
            boolean isValid= accountExample.validate(account);
            System.out.println("Account is "+account+" is valid: "+isValid);
        }
        for(String account: invalidAccount){
            boolean isValid= accountExample.validate(account);
            System.out.println("Account is "+account+" is valid: "+isValid);
        }
    }
}
