public class Applicants {
    private String name;
    private Classes classApplied;
    private int age;

    public Applicants(String name, Classes classApplied, int age) {
        this.name = name;
        this.classApplied = classApplied;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classes getClassApplied() {
        return classApplied;
    }

    public void setClassApplied(Classes classApplied) {
        this.classApplied = classApplied;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
