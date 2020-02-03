package d_advanced_fileScannerReaderWriter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NewFile {

    public static void main(String[] args) throws IOException {

        String path1 = "D:\\OneDrive - AT\\_dev\\_java101\\b_cschool\\src\\a_obslugaPlikow\\empty.txt";
        String path2 = "D:\\OneDrive - AT\\_dev\\_java101\\b_cschool\\src\\a_obslugaPlikow\\empty2.txt";

        File file1 = new File(path1);
        Scanner scanner1 = new Scanner(file1);
        List<Integer> listInteger1 = new ArrayList<>();
        while (scanner1.hasNext()) {
            System.out.println("has next");
            if (scanner1.hasNext()) listInteger1.add(Integer.valueOf(scanner1.next()));
        }

        System.out.println("create file");
        File file2 = new File(path2);
        file2.createNewFile();
        PrintWriter printWriter1 = new PrintWriter(path2);
        printWriter1.print(Collections.max(listInteger1) - Collections.min(listInteger1));

        scanner1.close();
        printWriter1.close();

    }

}
