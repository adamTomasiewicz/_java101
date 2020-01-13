package y_quiz;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class QuizMain_5_operationsOnFiles {
    public static void main(String[] args) throws IOException {

        Scanner scanner1 = new Scanner(System.in);
        String studentIndex;
        do{
            System.out.println("type index of a student in this format \"A009\"");
            System.out.println("or type \"exit\" to exit");
            studentIndex=scanner1.nextLine();
            if(studentIndex.equals("exit")){
                continue;
            }
            else {
                createDirectoryAndFiles(studentIndex);
                System.out.println();
            }
        }
        while (!studentIndex.equals("exit"));
    scanner1.close();
    }

    static void createDirectoryAndFiles (String studentIndex) throws IOException {
    String dirForFileCreate = "D:\\OneDrive - AT\\_dev\\_java101\\b_cschool\\src\\x_temp\\";

    File dir1 = new File(dirForFileCreate+studentIndex);
        dir1.mkdirs();
    File file1 = new File(dirForFileCreate+studentIndex+"\\"+studentIndex+"_1.docx");
        file1.createNewFile();
    File file2 = new File(dirForFileCreate+studentIndex+"\\"+studentIndex+"_2.pdf");
        file2.createNewFile();
    File file3 = new File(dirForFileCreate+studentIndex+"\\"+studentIndex+"_3.txt");
        file3.createNewFile();
    }

}
