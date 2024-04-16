package Tasks;

import java.util.Arrays;

public class PlayerApp {
    public static void main(String[] args) {
        Player[] player = {
                new Player("Osman",25,3),
                new Player("Ferid",70,4),
                new Player("Vusal",40,1),
                new Player("elnur",40,2),
                new Player("eli",40,5)
        };
     //   Arrays.sort(player);
        Arrays.sort(player,new PlayerCompareByScore());
        System.out.println(Arrays.toString(player));
    }
}
