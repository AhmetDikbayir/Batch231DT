package deneme;

public class Teacher extends Human {

    final String job = "Teacher";

    String school;
    String department;

    public Teacher(String name, String lastName, int age, String okul, String department) {
        super(name, lastName, age);

        this.school = okul;
        this.department = department;
    }

    public Teacher(String name, String lastName, String school) {
        super(name, lastName);
        this.school = school;
    }

    public String jobDefinition(String dep){
        this.department = dep;
        return dep;
    }
    @Override
    public Integer older(Integer age){

        age += 2;
        this.age = age;
        return age;
    }

    public Integer giveNote(Integer score){
        return score;
    }


}
