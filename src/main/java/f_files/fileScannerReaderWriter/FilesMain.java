package f_files.fileScannerReaderWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilesMain {
    public static void main(String[] args) throws FileNotFoundException {
        String path1 = "D:\\OneDrive - AT\\_dev\\_java101\\b_cschool\\src\\a_obslugaPlikow\\digits.txt";
        String path2 = "D:\\OneDrive - AT\\_dev\\_java101\\b_cschool\\src\\a_obslugaPlikow\\animals.txt";
        String path3 = "D:\\OneDrive - AT\\_dev\\_java101\\b_cschool\\src\\a_obslugaPlikow\\empty.txt";
/*      File file1 = new File(path1);
        File file2 = new File(path2);

        Scanner scanner1 = new Scanner(file1);
        Scanner scanner2 = new Scanner(file2);

        while (scanner1.hasNext()|scanner2.hasNext()) {
            System.out.println((scanner1.hasNext() ? scanner1.next() : " ") +
                    " " + (scanner2.hasNext() ? scanner2.next() : " "));
        }

        scanner1.close();
        scanner2.close();*/
        PrintWriter printWriter1 = new PrintWriter(path3);

        Scanner scanner3 = new Scanner(System.in);
        String input = "";
        String exit = "exit";

        do {
            System.out.println("type line");
            input = scanner3.nextLine();
            if (input.equals("exit")) break;
            else {
                printWriter1.print(input + "\n");
                printWriter1.flush();
            }

        }
        while (!(input.equals("exit")));

        printWriter1.close();
    }

}
