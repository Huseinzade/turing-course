package HappyFamily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
    }

//    public void addChild(Human child) {
//        if (children != null) {
//            Human[] newChildren = new Human[children.length + 1];
//            for (int i = 0; i < children.length; i++) {
//                newChildren[i] = children[i];
//            }
//            newChildren[children.length] = child;
//            children = newChildren;
//        } else {
//            children = new Human[1];
//            children[0] = child;
//        }
//    }

    public void addChild(Human child) {
        children.add(child);
    }


    public void deleteChild (Human child){
        children.remove(child);
    }

    public int countFamily(){
        int familySize = 2;
        if(children != null){
            familySize = familySize + children.size();
        }
        if(pet != null){
            familySize++;
        }
        return familySize;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //// USEEEEE IT
    }

    @Override
    public String toString() {
        return "Family{ " + "MOTHER= " + mother + ", FATHER= " +
                father + ", CHILDREN= " + children.toString() + ", PET= " + pet.toString() ;
    }
}
