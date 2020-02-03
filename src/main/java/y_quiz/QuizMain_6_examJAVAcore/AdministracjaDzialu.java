package y_quiz.QuizMain_6_examJAVAcore;

public interface AdministracjaDzialu {


    void addPracownikaDoDzialu(Pracownik pracownik);

    void removePracownikaZDzialu(Pracownik pracownik);

    void nadajUprawnieniaKierownika(Pracownik pracownik);

    void odbierzUprawnieniaKierownika(Pracownik pracownik);


    void wypiszSrednieZarobkiDzialu_roczne(Dzial dzial);

    void wypiszMedianeZarobkowDzialu_roczne(Dzial dzial);


}
