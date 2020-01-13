package y_quiz.QuizMain_6_examJAVAbasics;

public abstract class Dzial implements AdministracjaDzialu{
    protected String name;
    private PracownikDyrektor pracownikDyrektor;
    private PracownikKierownik pracownikKierownik;

    @Override
    public void addPracownikaDoDzialu(Pracownik pracownik) {
        pracownik.setDzial(this);
    }
    @Override
    public void removePracownikaZDzialu (Pracownik pracownik){
        pracownik.setDzial(null);
    }
    @Override
    public void nadajUprawnieniaKierownika(Pracownik pracownik) {
        this.setPracownikKierownik(new PracownikKierownik(pracownik,222,333));
    }

    @Override
    public void odbierzUprawnieniaKierownika(Pracownik pracownik) {
    }
    @Override
    public void wypiszSrednieZarobkiDzialu_roczne(Dzial dzial){
        int sum = 0;
        int counter =0;
        for (Pracownik pracownik :Pracownik.listaWszystkichPracownikow ) {
            if (pracownik.getDzial().getName() ==dzial.getName()){
            sum = sum + pracownik.getZarobkiPracownika_Roczne();
            counter++;}
        }
        System.out.println(sum/counter);

    };
    @Override
    public void wypiszMedianeZarobkowDzialu_roczne(Dzial dzial) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PracownikDyrektor getPracownikDyrektor() {
        return pracownikDyrektor;
    }

    public void setPracownikDyrektor(PracownikDyrektor pracownikDyrektor) {
        this.pracownikDyrektor = pracownikDyrektor;
    }

    public PracownikKierownik getPracownikKierownik() {
        return pracownikKierownik;
    }

    public void setPracownikKierownik(PracownikKierownik pracownikKierownik) {
        this.pracownikKierownik = pracownikKierownik;
    }


}
class DzialAdministracji extends Dzial {
    private static DzialAdministracji instance = new DzialAdministracji();
    private DzialAdministracji() {
        this("dzialAdministracji");
    }
    private DzialAdministracji(String name) {
        this.name = name;
    }
    public static DzialAdministracji getInstance() {
        return instance;
    }
    @Override
    public String toString() {
        return "Dzial{" +
                "name='" + getName() + '\'' +
                ", pracownikDyrektor=" + getPracownikDyrektor() +
                ", pracownikKierownik=" + getPracownikKierownik() +
                '}';
    }
}

class DzialHR extends Dzial {

    private static DzialHR instance = new DzialHR();

    private DzialHR() {
        this("dzialHR");
    }

    private DzialHR(String name) {
        this.name = name;
    }
    public static DzialHR getInstance() {
        return instance;
    }
    @Override
    public String toString() {
        return "Dzial{" +
                "name='" + getName() + '\'' +
                ", pracownikDyrektor=" + DzialHR.getInstance().getPracownikDyrektor() +
                ", pracownikKierownik=" +  DzialHR.getInstance().getPracownikKierownik()+
                '}';
    }
}

class DzialSekretariat extends Dzial{
    private static DzialSekretariat instance = new DzialSekretariat();
    private DzialSekretariat() {
        this("dzialSekretariat");
    }
    private DzialSekretariat(String name) {
        this.name = name;
    }
    public static DzialSekretariat getInstance() {
        return instance;
    }
    @Override
    public String toString() {
        return "Dzial{" +
                "name='" + getName() + '\'' +
                ", pracownikDyrektor=" + getPracownikDyrektor() +
                ", pracownikKierownik=" + getPracownikKierownik() +
                '}';
    }

}
