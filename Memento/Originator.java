package Memento;

public class Originator {
    private String state;

    public String getState() {
        System.out.println((state));
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Momento saveStateToMemento() {
        return new Momento(state);

    }

    public void getStateFromMemento(Momento momento) {
        state = momento.getState();
    }
}
