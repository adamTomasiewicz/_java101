package c_core.oop_interface.iterable;

import java.util.Iterator;
import java.util.List;

public class Owca implements Iterable<Zwierze> {
    private List<Zwierze> listaZwierzow;

    public Owca(List<Zwierze> listaZwierzow) {
        this.listaZwierzow = listaZwierzow;
    }

    @Override
    public Iterator<Zwierze> iterator() {
        return listaZwierzow.iterator();
    }
}
