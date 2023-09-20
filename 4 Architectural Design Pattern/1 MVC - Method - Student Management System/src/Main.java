public class Main {
    public static void main(String[] args) {
        StudentModel model = new StudentModel();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.addStudent("Om", 20, 7);
        controller.addStudent("Krishna", 21, 29);
        controller.addStudent("Dev", 16, 13);

        controller.displayStudents();
    }
}