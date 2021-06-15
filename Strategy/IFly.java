package Strategy;

public interface IFly {
    public void fly();
}


class CannotFly implements IFly{

    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
class FlyHigh implements IFly{

    @Override
    public void fly() {
        System.out.println("I can fly high");
    }
}
