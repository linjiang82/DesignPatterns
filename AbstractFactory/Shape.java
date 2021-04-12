package AbstractFactory;

public interface Shape {
    public void draw();
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("Draw rectangle");
    }
}
class Square implements Shape{
    public void draw(){
        System.out.println("Draw Square");
    }
}
class RoundRectangle implements Shape{
    public void draw(){
        System.out.println("Draw RoundRectangle");
    }
}
class RoundSquare implements Shape{
    public void draw(){
        System.out.println("Draw roundSquare");
    }
}
