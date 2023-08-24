package ss19_string_regex.bai_tap.ex1;

import java.util.regex.Pattern;

public class Grade {
    public static void main(String[] args) {
        String[] grade = {"C0223G", "A0323K","M0318G", "P0323A"};
        Pattern pattern = Pattern.compile("^[CAP][0-9]{4}[GHIK]$");
        for (String g : grade) {
            System.out.println(g + " là tên lớp hợp lệ không? " + pattern.matcher(g).matches());
        }
    }
}
