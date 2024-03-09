package HappyFamily;

import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int trickLevel;
    private int age;
    private String[] habits;

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int trickLevel, int age, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.trickLevel = trickLevel;
        this.age = age;
        this.habits = habits;
    }

    public Pet() {

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        if (trickLevel >= 1 && trickLevel < 100) {
            this.trickLevel = trickLevel;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }


    public void eat() {
        System.out.println("i am eating");
    }

    public void respond() {
        System.out.println("Hello owner. I am - " + nickname + " I miss you");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return getSpecies() + "{nickname=" + getNickname() + ", age=" +
                getAge() + ", tricklevel=" + getTrickLevel() +
                ", habits=" + Arrays.toString(getHabits());
    }
}
