import java.util.ArrayList;
import java.util.List;

class StudentView {
    public void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", ID: " + student.getId());
        }
    }
}