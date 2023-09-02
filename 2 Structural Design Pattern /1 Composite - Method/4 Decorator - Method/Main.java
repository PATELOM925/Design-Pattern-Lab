public class Main {
    public static void main(String[] args) {

        Shape rect = new Rectangle();
        Shape redRectangle = new redShapedecorator(new Rectangle());
        Shape redCircle = new redShapedecorator(new Circle());

        System.out.println("Rectangle without border color");
        rect.draw();

        System.out.println("\nRectangle  with RED border color");
        redRectangle.draw();

        System.out.println("\nCircle with RED border color");
        redCircle.draw();

    }
}
