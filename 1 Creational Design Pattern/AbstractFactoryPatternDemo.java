public interface Shape
{
    void draw();
}
public class RoundedRactangle implements Shape
{
    public void draw()
    {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}
public class RoundedSquare implements Shape
{
    public void draw()
    {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}
public class Rectangle implements Shape
{
    public void draw()
    {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
public abstract class AbstractFactory
{
    abstract Shape getShape(String shapeType);
}
public class RoundedShapeFactory extends AbstractFactory
{
    public Shape getShape(String shareType)
    {
        if(shapeType.equalsIgnoreCase("RECTANGLE"))
        {
            return new RoundedRectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE"))
        {
            return new RoundedSquare();
        }
        return null;
    }
}
public class FactoryProducer
{
    public static AbstractFactory getFactory(boolean rounded)
    {
        if(rounded)
        {
            return new RoundedShapeFactory();
        }else
        {
            return new ShapeFactory();
        }
    }
}

public class AbstractFactoryPatternDemo
{
    public static void main(String[] args)
    {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        //get an object of Shape Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape1.draw();
        //get an object of Shape Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        //call draw method of Shape Square
        shape2.draw();
        //get shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        //get an object of Shape Rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape3.draw();
        //get an object of Shape Square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        //call draw method of Shape Square
        shape4.draw();

    }
}