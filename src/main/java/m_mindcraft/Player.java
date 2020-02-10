package m_mindcraft;

public class Player {
    private String name;
    private String username;
    private int points;

    public Player(String name, String username, int points) {
        this.name = name;
        this.username = username;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    String fullName() {
        return "name=" + this.name + " userName=" + this.username;
    }

    @Override
    public String toString() {
        return "Player{" + "name='" + name + '\'' + ", username='" + username + '\'' +
                ", points=" + points + '}';
    }
}
