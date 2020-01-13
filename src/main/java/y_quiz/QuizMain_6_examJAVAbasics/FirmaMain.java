package y_quiz.QuizMain_6_examJAVAbasics;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FirmaMain {
    public static void main(String[] args) throws FileNotFoundException {


        Pracownik pracownik1 = new Pracownik("Jan", "Kowalski", "88223388",3500);
        pracownik1.setDzial(DzialAdministracji.getInstance());
        Pracownik pracownik2 = new Pracownik("Janina", "Kowalska", "88223388",4000);
        pracownik2.setDzial(DzialHR.getInstance());
        Pracownik pracownik3 = new Pracownik("Andrzej", "Malinowski", "88223388",4500);
        pracownik3.setDzial(DzialHR.getInstance());
      //  DzialHR.getInstance().nadajUprawnieniaKierownika(pracownik3);

        Pracownik pracownik4 = new Pracownik("Urszula", "Malinowska", "88223388",5000);
        pracownik4.setDzial(DzialSekretariat.getInstance());
        Pracownik pracownik5 = new Pracownik("Test", "test", "88223388",5500);
        pracownik4.setDzial(DzialSekretariat.getInstance());

        System.out.println(AdministracjaPracownika.getSrednieZarobkiWszystkichPracownikow_Roczne());

        Pracownik.listaWszystkichPracownikow.stream().forEach(p -> System.out.println(p));
        try {
            AdministracjaPracownika.eksportPracownikow_DoPliku();
        } catch (IOException e) {
            e.printStackTrace();
        }

        AdministracjaPracownika.importPracownikow_ZPliku();

        Pracownik.listaWszystkichPracownikow.stream().forEach(p -> System.out.println(p));

    }
}
