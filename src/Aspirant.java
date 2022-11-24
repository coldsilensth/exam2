import javax.swing.plaf.PanelUI;

public class Aspirant extends Student{
    String scientificWork;


    public Aspirant(String firstName, String lastName, String group, boolean isElder, double averageMark, String scientificWork) {
        super(firstName, lastName, group, isElder, averageMark);
        this.scientificWork = scientificWork;

    }

    public Aspirant(){

    }


    @Override
    public void getScholarship() {
        if(getAverageMark() == 5) {
            System.out.println("Ваша стпиендия равна 2000 сом! Молодцы!");
        }else{
            System.out.println("Вы хорошо постарались! Ваша стпиендия равна 1800 сомам!");
        }


    }

//    public double getScholarship(){
//        if(averageMark == 5) {
//            System.out.println("Ваша стпиендия равна 2000 сом! Молодцы!");
//        }else{
//            System.out.println("Вы хорошо постарались! Ваша стпиендия равна 1800 сомам!");
//        }
//    }

}
