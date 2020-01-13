package pl.akademiakodu.classes_And_Objects;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    String email;
    String password;
    boolean admin;

    public static void main(String[] args) {

        User person1 = new User(); //class constructor
        person1.name = "Adam";
        person1.email = "Kowalski";
        person1.password = "21909321909031";
        person1.admin = true;


        User person2 = new User(); //class constructor
        person2.name = "Adam";
        person2.email = "Kowalski";
        person2.password = "21909321909031";
        person2.admin = false;

        List<User> users = new ArrayList<>();
        users.add(person1);
        users.add(person2);
        //list.add();

        for (User user : users) {
            System.out.println(user.name + " " + user.email + " is admin: " + user.admin);
        }


    }
}