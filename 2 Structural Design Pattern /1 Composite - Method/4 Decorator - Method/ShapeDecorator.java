public class ShapeDecorator implements Shape{
    Shape decoratedshape;
    public ShapeDecorator(Shape decoratedshape){
        this.decoratedshape=decoratedshape;
    }
    public void draw() {
        decoratedshape.draw();
    }
}
