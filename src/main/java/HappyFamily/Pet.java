package HappyFamily;

import java.util.Arrays;
import java.util.Set;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int trickLevel;
    private int age;
    private Set<String> habits;

    public Pet( String nickname, int trickLevel, int age, Set<String> habits) {
        this.nickname = nickname;
        this.trickLevel = trickLevel;
        this.age = age;
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
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
        this.trickLevel = trickLevel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    /// METHODS

    public void eat() {
        System.out.println("i am eating");
    }

    public abstract void respond();

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
        StringBuilder hab = new StringBuilder();
        for(String i : habits){
            hab.append(i).append(", ");
        }
        return getSpecies() + "{nickname=" + getNickname() + ", age=" +
                getAge() + ", tricklevel=" + getTrickLevel() +
                ", habits=" + hab.toString();
    }
}
