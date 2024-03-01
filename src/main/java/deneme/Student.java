package deneme;

public class Student extends Teacher{
    public Student(String name, String lastName, String school, Integer grade) {
        super(name, lastName, school);
        this.grade = grade;
    }

    Integer grade;


}
