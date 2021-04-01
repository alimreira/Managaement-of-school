public class Teacher extends Staffs{
    private Courses courses;

    public Teacher(String name, Courses courses) {
        super(name);
        this.courses = courses;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }
}
