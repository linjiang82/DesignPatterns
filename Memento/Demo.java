package Memento;

public class Demo {
    public static void main(String[] args) {
        Originator ori = new Originator();
        CareTaker ct = new CareTaker();
        ori.setState("haha");
        ct.add(ori.saveStateToMemento());
        ori.setState("good");
        ct.add(ori.saveStateToMemento());
        ori.setState("day");
        ct.add(ori.saveStateToMemento());
        ori.setState("today");
        ct.add(ori.saveStateToMemento());
        ori.getStateFromMemento(ct.get(2));
        ori.getState();
        ori.getStateFromMemento(ct.get(3));
        ori.getState();
    }
}
