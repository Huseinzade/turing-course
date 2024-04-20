package HappyFamily;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"playing", "jumping", "sleeping"};
        //Pet pet1 = new Pet("Pitbull","Maykl",9,1,habits);


        Map<String,String> schedule1 = new HashMap<>();
        schedule1.put("Monday","Swimming");
        Map<String,String> schedule2 = new HashMap<>();
        schedule2.put("Sunday","Reading");
        Map<String,String> schedule3 = new HashMap<>();
        schedule3.put("Sunday","Reading");
        Map<String,String> schedule4 = new HashMap<>();
        schedule4.put("Sunday","Reading");
        Map<String,String> schedule5 = new HashMap<>();
        schedule5.put("Sunday","Reading");


        Human mother = new Human("Sevinc","Huseynova",1972,100,schedule1);
        Human father = new Human("Mezahir","Huseynov",1972,100,schedule2);
        Human child = new Human("Ismail","Huseynov",1996,85,schedule3);
        Human child2 = new Human("Leyli","Huseynova",1996,85,schedule4);
        Family family = new Family(mother,father);

        family.addChild(child);
        family.addChild(child2);
        family.deleteChild(child);
        System.out.println(family.toString());



        Human human1 = new Human("Ismail","Huseynov",1996,99,schedule3,family);
        System.out.println(human1.getSchedule());






    }
}
