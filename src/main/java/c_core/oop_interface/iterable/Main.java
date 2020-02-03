package c_core.oop_interface.iterable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Zwierze> listaZw = new ArrayList<>();
        listaZw.add(new Zwierze());
        listaZw.add(new Zwierze());
        listaZw.add(new Zwierze());

        Owca owca1 = new Owca(listaZw);

        for (Zwierze zwierze : owca1) {
            zwierze.makeNoise();
        }
    }
}
