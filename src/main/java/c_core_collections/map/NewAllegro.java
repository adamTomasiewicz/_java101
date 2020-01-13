package c_core_collections.map;

import java.util.*;

public class NewAllegro {
    private final Map<Integer,User> mapIntUser;

    public NewAllegro() {
        mapIntUser = new HashMap<>();
    }
    public void createUser (String userName){
        Integer nextID=getNextID();
        User user = new User(nextID,userName);
        mapIntUser.put(user.getId(),user);
    }
    public User getUser(Integer id){
        return mapIntUser.get(id);
    }
    public Set<User> getAllUsers() {
        return new HashSet<User>(mapIntUser.values());
    }

    private int getNextID () {
        Set<Integer> allIds = mapIntUser.keySet();
        if(allIds.isEmpty()) {return 1;}
        return Collections.max(allIds)+1;

    }
}
