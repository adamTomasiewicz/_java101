package f_files.FileMain_1_cmd_bash;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//todo: 2019.12.18 CMD/BASH w konsoli:
//1: Dir - wypisanie wszystkich plikow z katalogu
//1: Cd .. cofniecie do poprzedniej sciezki
//2: Cd katalog - przejscie do konkretnej sciezki

//3: Tree (dla chetnych) - wyswietla dokladna strukture w całej ścieżce
//4: Mkdir - stworzenie folderu
//5: Rmdir - usuniecie folderu
//6: copy null
//7: zmiana dysku
//8: uruchom cmd
//9: Exit - zamkniecie scannera
//0: print menu
public class ProjectMain_1_cmd_bash {

    public static void main(String[] args) throws IOException {

        //file options
        String dirStart = "D:\\OneDrive - AT\\_dev\\_java101\\b_cschool\\src\\t_temp";
        String dirCurrent = "D:\\OneDrive - AT\\_dev\\_java101\\b_cschool\\src\\t_temp\\";
        String dirForFileEmpty = "D:\\OneDrive - AT\\_dev\\_java101\\b_cschool\\src\\t_temp\\empty.txt";

        // try catch (IOException e) { e.printStackTrace(); }
        // PrintWriter printWriter1 = new PrintWriter(path2);   printWriter1.close();

        File file1;
        File file2;

        //scaner and while
        printMENU_0();
        Scanner scanner1 = new Scanner(System.in);
        String input = "";
        String input1;
        String input2;


        do {
            System.out.println("-------------");
            System.out.println("current directory: " + dirCurrent);
            System.out.println("type command");
            input = scanner1.nextLine();
            //  When you call, sc.close() in first method, it not only closes your scanner but closes your System.in input stream as well.
            //  You can verify it by printing its status at very top of the second method as :
            // Its best to use specific scanner only for 1 kind of input.

            if (input.length() == 1) {
                switch (input) {
                    case "1":
                        dir_1(dirCurrent);
                        break;
                    case "2":
                        tree_2(dirCurrent);
                        break;
                    case "3":
                        dirCurrent = cd_3(dirCurrent);
                        break;
                    case "4":
                        mkdir_4(dirCurrent);
                        break;
                    case "5":
                        rmdir_5(dirCurrent);
                        break;
                    case "6":
                        newFile_6(dirCurrent);
                        break;
                    case "7":
                        break;
                    case "8":
                        runCMD_8();
                        break;
                    case "9":
                        input = exit_9();
                        break;
                    case "0":
                        printMENU_0();
                        break;
                    default:
                        System.out.println("you choose wrong option, type 0 to print menu or type \"exit\" to exit");
                        break;
                }
            } else {
                switch (input) {
                    case "dir":
                        dir_1(dirCurrent);
                        break;
                    case "tree":
                        tree_2(dirCurrent);
                        break;
                    case "cd":
                        dirCurrent = cd_3(dirCurrent);
                        break;
                    case "mkdir":
                        mkdir_4(dirCurrent);
                        break;
                    case "rmdir":
                        rmdir_5(dirCurrent);
                        break;
                    case "copynul":
                        newFile_6(dirCurrent);
                        break;
                    case "7":
                        break;
                    case "runCMD":
                        runCMD_8();
                        break;
                    case "exit":
                        input = exit_9();
                        break;
                    case "print MENU":
                        printMENU_0();
                        break;
                    default:
                        System.out.println("you choose wrong option, type 0 to print menu or type \"exit\" to exit");
                        break;
                }
            }

        }
        while (!input.equals("exit"));
        scanner1.close();

    }

    //todo "dir_1" - wypisanie wszystkich plikow z katalogu
    static File[] dir_1(String dirCurrent) {
        File file1 = new File(dirCurrent);
        File[] files = file1.listFiles();

        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file.getAbsolutePath());
                }
            }
            for (File file : files) {
                if (file.isDirectory() == false) {
                    System.out.println(file.getName() + " (size in bytes: " + file.length() + ")");
                }
            }
        }
        return files;
    }

    // TODO "tree_2" - wyswietla dokladna strukture w całej ścieżce
    static void tree_2(String dirCurrent) {
        String[] stringArray = dirCurrent.split("[\\\\]");
        String newDirectory = "";

        for (int i = 0; i < stringArray.length - 1; i++) {
            newDirectory = newDirectory + stringArray[i] + "\\";
            dir_1(newDirectory);
            System.out.println("---------------");
            System.out.println(stringArray[i + 1]);
            System.out.println("---------------");
        }
    }

    //todo 3: Cd .. cofniecie do poprzedniej sciezki lub Cd katalog - przejscie do konkretnej sciezki
    static String cd_3(String dirCurrent) {
        String[] stringArray = dirCurrent.split("[\\\\]");
        String newDirectory = "";
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("type name of directory or \"..\" to go up or \"[d:]\" to change disk");
        String input2 = scanner2.nextLine();

        if (input2.equals("..")) {
            for (int i = 0; i < stringArray.length - 1; i++) {
                newDirectory = newDirectory + stringArray[i] + "\\";
            }
        } else if (input2.matches("^\\[[a-zA-Z][:]\\]")) {
            for (int i = 0, n = input2.length(); i < n; i++) {
                if (Character.isLetter(input2.charAt(i))) {
                    return newDirectory + input2.charAt(i) + ":";
                }
            }

        } else {
            for (int i = 0; i < stringArray.length; i++) {
                newDirectory = newDirectory + stringArray[i] + "\\";
            }
            newDirectory = newDirectory + input2;
        }
        System.out.println("newDirectory= " + newDirectory);
        return newDirectory;
    }

    //todo 4: Mkdir - stworzenie folderu
    static void mkdir_4(String dirCurrent) {

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("provide name for new directory");
        String input4 = "";
        input4 = scanner4.nextLine();
        File file4 = new File(dirCurrent + "\\" + input4);
        file4.mkdirs();

    }

    //5: Rmdir - usuniecie folderu
    static void rmdir_5(String dirCurrent) {
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("specify directory to delete");
        String input5;
        input5 = scanner5.nextLine();
        File file5 = new File(dirCurrent + "\\" + input5);
        File[] allContents = file5.listFiles();
        if (allContents != null) {
            System.out.println("dir is not empty, do you want to delete it regardless: \"y\" or \"n\"");
            input5 = scanner5.nextLine();
            if (input5.equals("y")) {
                for (File file : allContents) {
                    System.out.println(file + "deleted");
                    rmdir_5_withRecursion(file);
                }
            }
            file5.delete();
        } else file5.delete();
        System.out.println("directory " + input5 + " has been deleted");
    }

    static boolean rmdir_5_withRecursion(File dirToBeDeleted) {
        File[] allContents = dirToBeDeleted.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                rmdir_5_withRecursion(file);
            }
        }
        return dirToBeDeleted.delete();
    }

    //6: copy nul > newFile.txt
    static void newFile_6(String dirCurrent) throws IOException {
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("type name of a file with extension");
        String input6 = "";
        input6 = scanner6.nextLine();
        File file6 = new File(dirCurrent + "\\" + input6);
        file6.createNewFile();
        System.out.println("file " + input6 + " has been created");

    }

    //7: zmiana dysku
    //static void changeDisk_7() {}

    //8: uruchom cmd
    static void runCMD_8() throws IOException {
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && ping localhost\"");
        System.out.println("CMD has been run");
    }

    //9: Exit - zamkniecie scannera
    static String exit_9() {
        System.out.println("exiting program");
        return "exit";
    }

    //0: print menu
    static void printMENU_0() {
        System.out.println("MENU: ");
        System.out.println("type 1 or \"dir\" to print files");
        System.out.println("type 2 or \"tree\" to print files in all directories above");
        System.out.println("type 3 or \"cd\" to print files in all directories above");
        System.out.println("type 4 or \"mkdir\" create directory");
        System.out.println("type 5 or \"rmdir\" delete directory");
        System.out.println("type 6 or \"copynul\" to create new file");
        System.out.println("type 8 or \"runCMD\" to run CMD");

        System.out.println("type 9 or \"exit\" to exit program");
        System.out.println("type 0 or \"menu\" to print menu");
        System.out.println("-----------");
        System.out.println("waiting for your input:");
    }

    /*static void walkTest(String path) throws IOException {
        Stream<Path> walk = Files.walk(Paths.get(path));
        List<String> result;
        //directories
        result = walk.filter(Files::isDirectory)
                .map(x -> x.toString()).collect(Collectors.toList());
        // regular files
        result = walk.filter(Files::isRegularFile)
                .map(x -> x.toString()).collect(Collectors.toList());
        result.forEach(System.out::println);
    }*/


}