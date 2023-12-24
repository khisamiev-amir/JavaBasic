package OOP.Inheritance.Task3110;

public class Aspirant extends Student implements Teeth{
    @Override
    public void CleanTeeth() {
        System.out.println("trtrtr");
    }

    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        if(this.getAverageMark()==5){
            return 200;
        }else{
            return 180;
        }
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "scientificWork='" + scientificWork + '\'' +
                '}';
    }
}
