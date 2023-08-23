package ss17_io_binary_file_serialization.bai_tap.ex2.Utils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean checkFileExist = false;
        String sourceFile;
        do {
            System.out.println("Nhập file nguồn");
            sourceFile = scanner.nextLine();
            checkFileExist = FileUtils.checkFileExist(sourceFile);
            if(!checkFileExist){
                System.out.println("File không tồn tại. Vui lòng nhập lại");
            }
        } while (!checkFileExist);
        String targetFile;
        do {
            System.out.println("Nhập file cần sao chép");
            targetFile = scanner.nextLine();
            checkFileExist = FileUtils.checkFileExist(targetFile);
            if(!checkFileExist){
                System.out.println("File không tồn tại. Vui lòng nhập lại");
            }
        } while (!checkFileExist);
        FileUtils.writeFileBinary(targetFile,FileUtils.readFileBinary(sourceFile));
        int count=CountByte.countByte(targetFile);
        System.out.println("Số byte trong tệp là "+ count );
    }
}
