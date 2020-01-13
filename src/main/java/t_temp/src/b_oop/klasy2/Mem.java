package pl.akademiakodu.classes_And_Objects;

import java.util.LinkedList;
import java.util.List;

public class Mem {


   private String name;
   private String url;
   private String opis;
   private boolean favorite;


   public Mem(String name1, String url1, String opis1, boolean favorite1){
       this.name = name1;
       this.url = url1;
       this.opis = opis1;
       this.favorite = favorite1;
   }

    public static void main(String[] args) {

        Mem mem1 = new Mem("pies", "www.ojezu.pl", "merdajacy ogonem piesek" , true);
        Mem mem2 = new Mem("pies2", "www.ojezu.pl", "merdajacy glowa piesek" , true);
        Mem mem3 = new Mem("pies3", "www.ojezu.pl", "niemerdajacy piesek" , false);
    List<Mem> mems = new LinkedList<>();
    mems.add(mem1);
    mems.add(mem2);
    mems.add(mem3);

        for (Mem mem : mems) {
            if (mem.favorite==true){
                System.out.println(mem.name+" "+mem.favorite);
            }



        }


    }

}
