import java.util.ArrayList;
import java.util.List;
class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void addStudent(String name, int age, int id) {
        Student student = new Student(name, age, id);
        model.addStudent(student);
    }

    public void displayStudents() {
        List<Student> students = model.getStudents();
        view.printStudents(students);
    }
}