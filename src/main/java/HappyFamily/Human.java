package HappyFamily;

import java.util.HashMap;
import java.util.Map;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Map<String, String> schedule;
    private Family family;


    public Human(String name, String surname, int year, int iq, Map<String, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }
    public Human(String name, String surname, int year, int iq, Map<String, String> schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("object is remova");
//        super.finalize();
//    }

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
        StringBuilder sch = new StringBuilder();
        if (schedule != null) {
            for (Map.Entry<String, String> i : schedule.entrySet()) {
                sch.append(i.getKey()).append(": ").append(i.getValue()).append(", ");
            }
        }
        return "{name=" + name + ", surname=" + surname + ", year=" +
                year + ", iq=" + iq + ", schedule=" + sch.toString();
    }


    public void greetPet() {
        System.out.println("hello, " + family.getPet().getNickname());
    }

    public void describePet() {
        String sly = (family.getPet().getTrickLevel() > 50) ? "very sly" : "almost not sly";
        System.out.println("I have  " + family.getPet().getSpecies() + " is " +
                family.getPet().getAge() + " years old, he is " + sly);
    }

}
