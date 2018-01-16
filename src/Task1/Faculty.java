package Task1;

import java.util.ArrayList;

public class Faculty {
        private int facultyNumber;
        private String facultySubject1;
        private String facultySubject2;
        private ArrayList<Student> studentList;

    public Faculty(int facultyNumber, String facultySubject1, String facultySubject2) {
        this.facultyNumber = facultyNumber;
        this.facultySubject1 = facultySubject1;
        this.facultySubject2 = facultySubject2;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void addStudentToFac(Student student) {
        studentList.add(student);
    }
}
