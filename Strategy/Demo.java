package Strategy;

public class Demo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();
        IFly cannotFly = new CannotFly();
        IFly flyHigh = new FlyHigh();
        dog.setFly(cannotFly);
        bird.setFly(flyHigh);
        bird.eat();
        bird.makeSound();
        bird.fly();
        dog.eat();
        dog.makeSound();
        dog.fly();

    }
}
