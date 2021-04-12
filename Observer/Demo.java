package Observer;

public class Demo {
    public static void main(String[] args) {
        Subject sub = new Subject();
        Observer ob1 = new BinaryObserver(sub);
        Observer ob2 = new OctalObserver(sub);
        Observer ob3 = new HexObserver(sub);
        ob1.subscribe();
        ob2.subscribe();
        ob3.subscribe();
        sub.setState(3);
        System.out.println("next update");
        ob1.unsubscribe();
        ob2.unsubscribe();
        sub.setState(5);
    }
}
