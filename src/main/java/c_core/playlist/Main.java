package c_core.playlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        //a
        Song rollingStone = new Song("Rolling Stone");
        Song brownSugar = new Song("brownSugar");
        Song labamba = new Song("labamba");
        Song janieGotAGun = new Song("Janie got a gun!");

        //b
        Movie casablanca = new Movie("casablanca");
        Movie chlopakiNiePlacza = new Movie("chlopaki nie placza");

        //c
        List<Media> playList1 = Arrays.asList(rollingStone, labamba, chlopakiNiePlacza);
        Playlist listNr1 = new Playlist(playList1);
        List<Media> playList2 = Arrays.asList(janieGotAGun, casablanca);
        Playlist listNr2 = new Playlist(playList2);

        List<Playable> listNr3 = new ArrayList<>();
        listNr3.add(labamba);
//        listNr3.add(listNr1);
//        listNr3.add(listNr2);
        listNr3.add(chlopakiNiePlacza);


    }
}
