package Tasks;

import java.util.Comparator;

public class PlayerCompare implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {
        return a.score;
    }
}
