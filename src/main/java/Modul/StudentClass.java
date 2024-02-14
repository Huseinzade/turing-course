package Modul;


public class StudentClass {
    public static void main(String[] args) {
        ClassStudent student1 = new ClassStudent("Ismayil", 27, 10);
        ClassStudent student2 = new ClassStudent("Elnur", 25, 9);
        ClassStudent student3 = new ClassStudent("Vusal", 23, 8);
        ClassStudent[] students = new ClassStudent[3];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;


        int max = student1.point;
        int j = 0;
        for (int i = 0; i < students.length; i++) {
            if (max < students[i].point) {
                max = students[i].point;
                j = i;
            }
        }
        System.out.println(students[j].toString());
        System.out.println(students[j].student + " | " + students[j].age + " | " + students[j].point);
    }
}
