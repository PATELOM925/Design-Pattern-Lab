public class redShapedecorator extends ShapeDecorator{

    public redShapedecorator(Shape decoratedshape) {
        super(decoratedshape);
    }
    public void draw(){
        decoratedshape.draw();
        setRedBorder(decoratedshape);
    }

    public void setRedBorder(Shape decoratedshape){
        System.out.println("Shape Color: RED");
    }
}
