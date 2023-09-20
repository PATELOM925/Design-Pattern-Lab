import java.util.ArrayList;
import java.util.List;

class StudentModel {
    private List<Student> students;

    public StudentModel() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}