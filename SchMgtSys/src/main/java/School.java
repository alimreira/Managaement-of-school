import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Classes> classes = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private Principal principal;
    private List<Teacher> teacher = new ArrayList<>();
    private List<Non_academic> non_academic = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    public List<Non_academic> getNon_academic() {
        return non_academic;
    }

    public void setNon_academic(List<Non_academic> non_academic) {
        this.non_academic = non_academic;
    }

}
