import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Masha", "Lisova", "7474",false, 5);
        Student student2 = new Student("Dasha", "Lisova", "7474",false, 4.6);

        Aspirant aspirant1 = new Aspirant("hhdhdhd", "dddd", "7474",false, 3.9,"jdjj");
        Aspirant aspirant2 = new Aspirant("hhdhdhd", "dddd", "7474",false, 5,"jdjj");

        Student student =  new Aspirant();

        Student[] students = {student1, student2,aspirant1,aspirant2};
        student.getByName(students, "Masha");

        for (int i = 0; i < students.length; i++) {

            students[i].getScholarship();
        }


        student.elder(students,"Dasha");

    }
}