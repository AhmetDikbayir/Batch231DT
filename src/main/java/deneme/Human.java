package deneme;

public class Human {
    String name;
    String lastName;
    Integer age;
    String job;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Human(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Human(String name, String lastName, Integer age, String job) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.job = job;
    }

    public Number older(Integer age){
        age += 1;
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
