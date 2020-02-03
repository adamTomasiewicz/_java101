package b_javaBasics.collections;

import java.util.Random;

public class CollectionsMain {


    public static void main(String[] args) {
        int[] myTable = new int[3];
        myTable[0] = 11;
        myTable[1] = 22;
        myTable[2] = 33;
        int[] myTable2 = {1, 2, 3, 4};

        for (int n : myTable) {
            System.out.print(n + ",");
        }
        for (int n : myTable2) {
            System.out.print(n + ",");
        }

        String a = "kotek1";
        String b = "alicja";
        //  print(2);
        //  print(retur());
    }

    static void print(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "cześć");
        }
    }

    static int retur() {
        Random random = new Random();

        return random.nextInt(100) + 1;

    }
}

// konstruktor domyślny
/*        System.out.println("Akademia Kodu");
            List<String> dogs = new ArrayList <> ();
            dogs.add("Brandon");
            dogs.add("1");
            dogs.add("john");
            dogs.add("bandzior");

        Iterator<String> iterator = dogs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

/*
      List<String> users = new ArrayList<>();
      users.add("adamus");
      users.add("anna");
      users.add("zdzislaw");
        System.out.println(users.size());

        for (String dupa:users) {
            System.out.println(dupa);
        }
                users.remove("adamus");
                users.add(1, "joanna");
        System.out.println(users);
        System.out.println(users.contains("anna"));
        System.out.println(users.indexOf("joanna"));


*/




