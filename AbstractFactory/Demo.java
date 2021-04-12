package AbstractFactory;

public class Demo {

    public static void main(String[] args) {
 AbstractFactory factory =         FactoryProducer.getFactory(true);
Shape shape=  factory.getShape("Rectangle");
shape.draw();

    }
}
