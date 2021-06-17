package State;

public class TV {
    State offState;
    State onState ;
    private State state;

    public TV() {
         offState = new OffState(this);
         onState = new OnState(this);
        this.state = offState;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void turnOn(){
        this.state.turnOn();
    }
    public void turnOff(){
        this.state.turnOff();
    }
    public void turnUp(){
        this.state.turnUp();
    }
    public void turnDown(){
        this.state.turnDown();
    }
    public void channelUp(){
        this.state.ChannelUp();
    }
    public void channelDown(){
        this.state.ChannelDown();
    }

}
