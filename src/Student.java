import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
     private String group;
    private boolean isElder;
    private double averageMark;


    public Student(){

    }
    public Student(String firstName, String lastName, String group, boolean isElder, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.isElder = isElder;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean isElder() {
        return isElder;
    }

    public void setElder(boolean elder) {
        isElder = elder;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }



    public void getScholarship(){
        if(averageMark == 5) {
            System.out.println("Ваша стпиендия равна 1000 сом! Молодцы!");
        }else{
            System.out.println("Вы хорошо постарались! Ваша стпиендия равна 800 сомам!");
        }
    }

    public void getByName(Student[] students, String firstName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName().equals(firstName)) {
                System.out.println("Студент которого вы искали " + students[i].firstName);
            }
        }
    }

    public void elder(Student[] students, String firstName){
        for (int i = 0; i < students.length; i++) {

            if (students[i].getFirstName().equals(firstName)) {
                if(students[i].isElder == false ){
                    System.out.println(firstName + " назначен старостой");
                }
            }

        }
    }

}
