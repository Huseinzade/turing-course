package HappyFamily;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    }

    public void addChild(Human child) {
        if (children != null) {
            Human[] newChildren = new Human[children.length + 1];
            for (int i = 0; i < children.length; i++) {
                newChildren[i] = children[i];
            }
            newChildren[children.length] = child;
            children = newChildren;
        } else {
            children = new Human[1];
            children[0] = child;
        }
    }


    public void deleteChild (Human child){
        Human[] newChildren2 = new Human[children.length-1];
        int index = 0;
        for (int i = 0; i < children.length; i++) {
            if(children[i] == child){
                continue;
            }else {
                newChildren2[index] = children[i];
                index++;
            }
        }
        children = newChildren2;
    }

    public int countFamily(){
        int familySize = 2;
        if(children != null){
            familySize = familySize + children.length;
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
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
                father + ", CHILDREN= " + Arrays.toString(children) + ", PET= " + pet ;
    }
}
