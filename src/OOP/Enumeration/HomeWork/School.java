package OOP.Enumeration.HomeWork;

public class School {
    private int schoolNumber;
    private int numberOfStudent;
    private Season season;

    public School(int schoolNumber, int numberOfStudent, Season season) {
        this.schoolNumber = schoolNumber;
        this.numberOfStudent = numberOfStudent;
        this.season = season;
    }


    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public Season getSeason() {
        return season;
    }
}
