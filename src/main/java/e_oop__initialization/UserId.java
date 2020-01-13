package e_oop__initialization;

public class UserId {
    private final long id;

    //constructors
    public UserId(long id) {
        this.id = id;
    }
    public UserId (int id) {
        this.id = id;
    }
    public UserId(String id) {
        this.id = Long.valueOf(id);
    }


}
