package Observer;

public abstract class Observer {
    public Subject subject;
    abstract void update();
    void subscribe(){
        subject.attach(this);
    };
    void unsubscribe(){
         subject.deattach(this);
     };
}

class OctalObserver extends Observer{
    public OctalObserver(Subject sub){
        this.subject=sub;
    }
    @Override
    void update(){
        System.out.println("Octal updated");
    }
}
class HexObserver extends Observer{
    public HexObserver(Subject sub){
        this.subject=sub;
    }
    @Override
    void update(){
        System.out.println("Hex updated");
    }
}
class BinaryObserver extends Observer{
    public BinaryObserver(Subject sub){
        this.subject=sub;
    }
    @Override
    void update(){
       System.out.println("Binary updated");
    }
}
