package Modul;

public class ClassStudent {
    String student;
    int age;
    int point;

    public ClassStudent(String student, int age, int point) {
        this.student = student;
        this.age = age;
        this.point = point;
    }

    public String getStudent(String student) {
        return student;
    }

    public int getAge(int age) {
        return age;
    }

    public int getPoint(int point) {
        return point;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return
                "student=" + student +
                        ", age=" + age +
                        ", point=" + point;
    }
}

