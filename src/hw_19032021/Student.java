package hw_19032021;

public class Student {
    private String name;
    private String surname;
    private int dateofBirthday;
    private int course;

    public Student(String name, String surname, int dateofBirthday, int course) {
        this.name = name;
        this.surname = surname;
        this.dateofBirthday = dateofBirthday;
        this.course = course;
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

    public int getDateofBirthday() {
        return dateofBirthday;
    }

    public void setDateofBirthday(int dateofBirthday) {
        this.dateofBirthday = dateofBirthday;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

}


