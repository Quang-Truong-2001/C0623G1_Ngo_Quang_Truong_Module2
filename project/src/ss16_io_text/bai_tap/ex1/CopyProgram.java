package ss16_io_text.bai_tap.ex1;

import java.util.List;
import java.util.Scanner;

public class CopyProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ReadAndWrite readAndWrite=new ReadAndWrite();
        String sourceFile;
        String targetFile;
        boolean existFile;
        do {
            System.out.println("Nhập đường dẫn File nguồn: ");
            sourceFile=scanner.nextLine();
            existFile=ReadAndWrite.checkExistFile(sourceFile);
        }while(!existFile);
        List<String> result=readAndWrite.readFile(sourceFile);
        do {
            System.out.println("Nhập đường dẫn File sao chép: ");
            targetFile=scanner.nextLine();
            existFile=ReadAndWrite.checkExistFile(targetFile);
        }while(!existFile);
        readAndWrite.writeFile(targetFile,result);
        System.out.println("Số kí tự trong file: "+CountCharacter.countCharacter(sourceFile));
    }
}
