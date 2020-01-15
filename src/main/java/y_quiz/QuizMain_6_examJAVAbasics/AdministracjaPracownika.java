package y_quizes.QuizMain_6_examJAVAbasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public interface AdministracjaPracownika {

    static void importPracownikow_ZPliku() {
        String path1 = "D:\\OneDrive - AT\\_dev\\_java101\\b_cschool\\src\\t_temp\\exportPracownikow.txt";
        File file1 = new File(path1);
        Scanner scanner1 = null;
        try {
            scanner1 = new Scanner(file1);
        } catch (FileNotFoundException e) {e.printStackTrace();
        }
        usuwanieDuplikatow();
        // dodawanie z pliku
        while (scanner1.hasNextLine()) {
            String string=scanner1.nextLine();
            String[] stringArray = string.split(", ");

            String substringName = stringArray[1].substring(stringArray[1].indexOf('<') + 1, stringArray[1].indexOf('>'));
            String substringNazwisko = stringArray[2].substring(stringArray[2].indexOf('<') + 1, stringArray[2].indexOf('>'));
            String substringPESEL = stringArray[3].substring(stringArray[3].indexOf('<') + 1, stringArray[3].indexOf('>'));
            String substringZarobek = stringArray[4].substring(stringArray[4].indexOf('<') + 1, stringArray[4].indexOf('>'));

            Pracownik pracownik = new Pracownik(substringName,substringNazwisko,substringPESEL,Integer.valueOf(substringZarobek));
        }
        scanner1.close();
    }

    static void eksportPracownikow_DoPliku() throws IOException {
        String path1 = "D:\\OneDrive - AT\\_dev\\_java101\\b_cschool\\src\\t_temp\\exportPracownikow.txt";
        File file1 = new File(path1);
            file1.createNewFile();
            PrintWriter printWriter1 = new PrintWriter(file1);
       // Iterator<Pracownik> iterator = listaWszystkichPracownikow.iterator();
        ListIterator<Pracownik> listIteratorPracownik = Pracownik.getListaWszystkichPracownikow().listIterator();
        while(listIteratorPracownik.hasNext()) {
            printWriter1.println(listIteratorPracownik.next());
            printWriter1.flush();
        }
printWriter1.close();
    }
    static void usuwanieDuplikatow () {
        String path1 = "D:\\OneDrive - AT\\_dev\\_java101\\b_cschool\\src\\t_temp\\exportPracownikow.txt";
        File file1 = new File(path1);
        Scanner scanner1 = null;
        try {
            scanner1 = new Scanner(file1);
        } catch (FileNotFoundException e) {e.printStackTrace();
        }
        // usuwanie duplikatow
        List<Pracownik> listPracownikToRemove = new ArrayList<>();
        while (scanner1.hasNextLine()) {
            String string=scanner1.nextLine();
            String substringId = string.substring(string.indexOf('<') + 1, string.indexOf('>'));
            System.out.println(substringId);
            Integer id = Integer.parseInt(substringId);
            for (Pracownik pracownik: Pracownik.getListaWszystkichPracownikow())
                if (pracownik.getId()==id) listPracownikToRemove.add(pracownik);
        }
        for (Pracownik pracownik: listPracownikToRemove) {
            Pracownik.removeFromListaWszystkichPracownikow(pracownik);
        }
        scanner1.close();
    }

    public int getZarobkiPracownika_Miesieczne ();
    public int getZarobkiPracownika_Roczne ();


   static int getSrednieZarobkiWszystkichPracownikow_Roczne() {
        int sum = 0;
        int counter =0;
        for (Pracownik pracownik : Pracownik.getListaWszystkichPracownikow() ) {
            sum = sum + pracownik.getZarobkiPracownika_Roczne();
            counter++;
        }
        return sum/counter;
    }
    static int getMedianeZarobkowWszystkichPracownikow_Roczne() {
/*        listaWszystkichPracownikow.sort(zarobek);
        Collections.sort(listaWszystkichPracownikow, new Comparator<zarobek>() {

            public int compare(Score o1, Score o2) {
                // compare two instance of `Score` and return `int` as result.
                return o2.getScores().get(0).compareTo(o1.getScores().get(0));
            }
        });*/
            return -1;
        }

}


