package AbstractFactory;

public abstract class AbstractFactory {
abstract Shape getShape(String type);
}


class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String type){
        if(type=="Square"){
            return new Square();
        }
        else return new Rectangle();
    }
}
class RoundShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String type){
       if(type=="Square"){
           return new RoundSquare();
       }
       else return new RoundRectangle();
    }
}
