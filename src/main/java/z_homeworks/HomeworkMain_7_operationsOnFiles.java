package z_homeworks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class HomeworkMain_7_operationsOnFiles {
    //todo: Napisz program w którym użytkownik wybiera czy chce stworzyć plik czy katalog, po czym wprowadza nazwę. Instrukcja jest wykonywana.
    //todo: metody do scanera , printwritera, file
    // pomoc: https://stackabuse.com/java-list-files-in-a-directory/

    public static void main(String[] args) throws IOException {

        //file options
        String dirStart = "D:\\OneDrive - AT\\_dev\\_java101\\b_cschool\\src\\t_temp";
        String dirForFileCreate = "D:\\OneDrive - AT\\_dev\\_java101\\b_cschool\\src\\t_temp\\";
        String dirForFileEmpty = "D:\\OneDrive - AT\\_dev\\_java101\\b_cschool\\src\\t_temp\\empty.txt";

        // try catch (IOException e) { e.printStackTrace(); }
        // PrintWriter printWriter1 = new PrintWriter(path2);   printWriter1.close();

        File file1;
        File file2;
        File file3;


        //scaner and while
        printMenu();
        Scanner scanner1 = new Scanner(System.in);
        String input;
        String input1;
        String input2;


        do {
            input = scanner1.nextLine();
            switch (input) {
                case "1":
                    //creating file
                    System.out.println("type name of the file");
                    input1 = scanner1.nextLine();

                    file1 = new File(dirForFileCreate + input1);
                    file1.createNewFile();
                    System.out.println("file created" + file1.getAbsolutePath());
                    break;
                case "2":
                    //creating folder
                    System.out.println("type name of directory");
                    input2 = scanner1.nextLine();
                    file2 = new File(dirForFileCreate + input2);
                    file2.mkdirs();
                    System.out.println("file created" + file2.getAbsolutePath());

                    break;
                case "5":
                    listFiles(dirStart);

                    break;
                case "6":
                    // walkTest(dirStart);

                    break;
                case "0":
                    printMenu();

                    break;
                default:
                    System.out.println("you choose wrong option, type 0 to print menu or type \"exit\" to exit");

                    //creating file

                    break;
            }
        }
        while (!input.equals("exit"));

        scanner1.close();


    }

    static void printMenu() {
        System.out.println("MENU: ");
        System.out.println("type 1 to create a file");
        System.out.println("type 2 to create a folder");
        System.out.println("type 5 to list files in current directory");
        //System.out.println("type 9 to return to previous directory");
        System.out.println("type 0 to print menu");
        System.out.println("type \"exit\" to exit program");
        System.out.println("waiting for your input");
    }

    static void listFiles(String startDir) {
        File file1 = new File(startDir);
        File[] files = file1.listFiles();

        if (files != null && files.length > 0) {
            for (File file : files) {
                // Check if the file is a directory
                if (file.isDirectory()) {
                    System.out.println(file.getName() + " " + file.getAbsolutePath());
                } else {
                    System.out.println(file.getName() + " (size in bytes: " + file.length() + ")");
                }
            }
        }

    }

    static void walkTest(String path) throws IOException {
        Stream<Path> walk = Files.walk(Paths.get(path));
        List<String> result;
        //directories
        result = walk.filter(Files::isDirectory)
                .map(x -> x.toString()).collect(Collectors.toList());
        // regular files
        result = walk.filter(Files::isRegularFile)
                .map(x -> x.toString()).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
