import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        School school = new School("JoyLand College");

        Principal principal = new Principal("Okon");

        Courses courses = new Courses("English");
        Courses courses1 = new Courses("Maths");
        Courses courses2 = new Courses("Biology");

        Teacher teacher = new Teacher("Feyi", courses);
        Teacher teacher1 = new Teacher("John", courses1);
        Teacher teacher2 = new Teacher("Emma", courses2);

        Classes classes = new Classes("JSS 1");
        Classes classes1 = new Classes("JSS 2");
        Classes classes2 = new Classes("JSS 3");

        Student student = new Student("Goodness", classes);
        Student student1 = new Student("Okafor", classes1);
        Student student2 = new Student("Benedict", classes2);

        Non_academic non_academic = new Non_academic("Jacob");
        Non_academic non_academic1 = new Non_academic("Henry");

        Applicants applicants = new Applicants("Grace", classes,14);
        Applicants applicants1 = new Applicants("Aboki", classes1, 17);
        Applicants applicants2 = new Applicants("Glory", classes,19);
        Applicants applicants3 = new Applicants("Edet", classes1, 19);

        school.setPrincipal(principal);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher);
        teacherList.add(teacher1);
        teacherList.add(teacher2);

        school.setTeacher(teacherList);
        List<Non_academic> non_academicList = new ArrayList<>();
        non_academicList.add(non_academic);
        non_academicList.add(non_academic1);

        school.setNon_academic(non_academicList);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);

        school.setStudents(studentList);

        principal.admit(applicants, school);
        principal.admit(applicants1, school);
        principal.admit(applicants2, school);
        principal.admit(applicants3, school);
//        principal.changeStudentName(students1, "Hello");
        principal.expel(student1, school);



        for(int i = 0; i < studentList.size(); i++) {
            System.out.println(school.getStudents().get(i).getName());

        }

    }
}
