package b_javaBasics.collections.map;

public class MapMain {
    public static void main(String[] args) {
        //keySet()

        NewAllegro newAllegro1 = new NewAllegro();
        newAllegro1.createUser("jan.kowalski");
        newAllegro1.createUser("jagoda.nowak");
        newAllegro1.createUser("grzegorz.abc");

        User user1 = newAllegro1.getUser(1);
        System.out.println(user1);

        for (User userIter : newAllegro1.getAllUsers())
            System.out.print(userIter + " ");
        System.out.println();
    }
}
