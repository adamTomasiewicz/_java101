package pl.adamTomasiewicz.c_programator.h_collections.queue.map;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class User {
    private final Integer id;
    private final String userName;
    private final List<String> koszyk;

    public User(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
        this.koszyk = new ArrayList<>();

    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public List<String> getKoszyk() {
        return koszyk;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("userName='" + userName + "'")
                .add("koszyk=" + koszyk)
                .toString();
    }
}
