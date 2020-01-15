package y_quizes.QuizMain_6_examJAVAbasics;

public interface AdministracjaDzialu  {


    public void addPracownikaDoDzialu (Pracownik pracownik);
    public void removePracownikaZDzialu (Pracownik pracownik);

    public void nadajUprawnieniaKierownika (Pracownik pracownik);
    public void odbierzUprawnieniaKierownika (Pracownik pracownik);


    public void wypiszSrednieZarobkiDzialu_roczne(Dzial dzial);
    public void wypiszMedianeZarobkowDzialu_roczne(Dzial dzial);



}
