package HappyFamily;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"playing", "jumping", "sleeping"};
        Pet pet1 = new Pet("Pitbull","Maykl",9,1,habits);
        System.out.println();
        pet1.setAge(22);
        pet1.setNickname("Tyson");
        pet1.setSpecies("Buldoq");
        pet1.setTrickLevel(15);
        System.out.println(pet1);
        pet1.respond();
        pet1.foul();
        pet1.eat();
        System.out.println();


        String[][] schedule = {
                {"Monday","Swiming"},
                {"Tuesday","Going for a walk"},
                {"Wednesday", "Coding"},
                {"Thursday","Watching TV"},
                {"Friday","Reading book"},
                {"Saturday","Shopping"},
                {"Sunday","Playing CS"}

        };

        Human mother = new Human("Sevinc","Huseynova",45);
        Human father = new Human("Mezahir","Huseynov",46);
        Human human1 = new Human("Ismayil","Huseynzade",28,7,pet1,
                mother,father,schedule);
        System.out.println(human1);
        mother.setName("Zahra");
        father.setName("Ismayil");
        human1.setName("Fatime");
        human1.setSurname("Huseynli");
        System.out.println();
        System.out.println(human1);
        human1.greetPet();
        human1.describePet();
        pet1.setTrickLevel(51);
        human1.describePet();
    }
}
