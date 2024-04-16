package Tasks;

import java.util.Comparator;

public class PlayerCompareByScore implements Comparator<Player> {


    @Override
    public int compare(Player a, Player b) {
        if(a.score > b.score){
            return 1;
        } else if (a.score<b.score) {
            return -1;
        }else {
            if(a.ID> b.ID){
                return -1;
            } else if (a.ID<b.ID) {
                return 1;
            }else{
                return 0;
            }
        }
//        return a.score>b.score? 1:a.score<b.score?-1:
//                a.ID>b.ID?1: a.ID<b.ID?-1:a.name.compareTo(a.name);
    }
}
