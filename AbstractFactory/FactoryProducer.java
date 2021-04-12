package AbstractFactory;

public class FactoryProducer {
   public static AbstractFactory getFactory(boolean isRound){
       if(isRound) return new RoundShapeFactory();
       else return new ShapeFactory();
   }
}
