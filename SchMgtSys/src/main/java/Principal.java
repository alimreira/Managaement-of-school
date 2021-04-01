public class Principal extends Staffs{
    private boolean maritalStatus;

    public Principal(String name) {
        super(name);
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    //The admit method, turns applicants to student
    //before adding applicant(now student) to school

    public void admit(Applicants applicants, School school){// The instance of the applicants and school is called in the parameter so as to have access to them
        if(applicants.getAge() > 16){
            Student student = new Student(applicants.getName(), applicants.getClassApplied());
            school.getStudents().add(student);
            System.out.println(student.getName() +" has been successfully added to " +school.getName());
        }else{
            System.out.println(applicants.getName() +" was not admitted into " +school.getName() +" for failing age requirement");
        }

    }



    public void expel(Student student, School school){
        school.getStudents().remove(student);
        System.out.println(student.getName() +" has been expelled");
    }
}
