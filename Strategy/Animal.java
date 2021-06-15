package Strategy;

public abstract class Animal {
    public IFly getFly() {
        return fly;
    }

    public void setFly(IFly fly) {
        this.fly = fly;
    }

    private IFly fly;
    public void makeSound(){
        System.out.println("I am making noise");
    }
    public void eat(){
        System.out.println("I am eating");
    }
    public void fly(){
        this.fly.fly();
    }

}

class Dog extends Animal{
}
class Bird extends Animal{

}
