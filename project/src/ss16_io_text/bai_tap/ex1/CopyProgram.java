package ss16_io_text.bai_tap.ex1;

import java.util.Scanner;

public class CopyProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ReadAndWrite readAndWrite=new ReadAndWrite();
        System.out.println("Nhập đường dẫn File nguồn: ");
        String sourceFile=scanner.nextLine();
        System.out.println("Nhập đường dẫn File sao chép: ");
        String targetFile=scanner.nextLine();
        readAndWrite.writeFile(targetFile,readAndWrite.readFile(sourceFile));
        System.out.println("Số kí tự trong file: "+CountCharacter.countCharacter(sourceFile));
    }
}
