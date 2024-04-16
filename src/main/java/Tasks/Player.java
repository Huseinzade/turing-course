package Tasks;

public class Player implements Comparable<Player>{
    String name;
    int score;
    long ID;

    public Player(String name, int score, long ID) {
        this.name = name;
        this.score = score;
        this.ID = ID;
    }

    @Override
    public int compareTo(Player o) {
        return (int)(this.ID - o.ID);
    }

    @Override
    public String toString() {
        return "{name='%s', score=%d, ID=%d}".formatted(name, score, ID);
    }
}
