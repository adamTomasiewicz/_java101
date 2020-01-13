package e_oop_firma.spaces;

import e_oop_firma.movable.Krzeslo;
import e_oop_firma.movable.Lawa;
import e_oop_firma.movable.Tablica;

import java.util.Arrays;

public class Room extends Space{

        private int id;
        private String nazwa;

        private Lawa[] tablicaLawek = new Lawa[8];
        private Krzeslo[] tablicaKrzesel = new Krzeslo[16];
        private Tablica[] tablicaTablic= new Tablica[2];

        public Room(int id, String nazwa) {
            this.id = id;
            this.nazwa = nazwa;

        }

        void addLawa(Lawa lawa) {
            int firstFreeIndex=0;
            for (int i = 0; i <this.tablicaLawek.length ; i++) {
                if(this.tablicaLawek[i]==null) firstFreeIndex=i;
            }
            this.tablicaLawek[firstFreeIndex]=lawa;

        }
        void addKrzeslo(Krzeslo krzeslo) {
            int firstFreeIndex=0;
            for (int i = 0; i <this.tablicaKrzesel.length ; i++) {
                if(this.tablicaKrzesel[i]==null) firstFreeIndex=i;
            }
            this.tablicaKrzesel[firstFreeIndex]=krzeslo;

        }
        void addTablica(Tablica tablica) {
            int firstFreeIndex=0;
            for (int i = 0; i <this.tablicaTablic.length ; i++) {
                if(this.tablicaTablic[i]==null) firstFreeIndex=i;
            }

            this.tablicaTablic[firstFreeIndex]=tablica;
        }


        @Override
        public String toString() {
            return "SalaMain{" +
                    "id=" + id +
                    ", nazwa='" + nazwa + '\'' +
                    ", tablicaLawek=" + Arrays.toString(tablicaLawek) +
                    ", tablicaKrzesel=" + Arrays.toString(tablicaKrzesel) +
                    ", tablicaTablic=" + Arrays.toString(tablicaTablic) +
                    '}';
        }
    }

