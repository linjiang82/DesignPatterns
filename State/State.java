package State;

public interface State {
    public void turnOn();
    public void turnOff();
    public void turnUp();
    public void turnDown();
    public void ChannelUp();
    public void ChannelDown();
}

class OffState implements State{

    TV tv;

    public OffState(TV tv) {
        this.tv = tv;
    }

    @Override
    public void turnOn() {
        System.out.println("TV is on now");
        tv.setState(tv.onState);
    }

    @Override
    public void turnOff() {
        System.out.println("TV is already off, no need to turn off");
    }

    @Override
    public void turnUp() {
        System.out.println("Please turn it on first");

    }

    @Override
    public void turnDown() {

        System.out.println("Please turn it on first");
    }

    @Override
    public void ChannelUp() {
        System.out.println("Please turn it on first");

    }

    @Override
    public void ChannelDown() {
        System.out.println("Please turn it on first");

    }
}
class OnState implements State{

    TV tv;

    public OnState(TV tv) {
        this.tv = tv;
    }

    @Override
    public void turnOn() {

        System.out.println("TV is already on,please enjoy");
    }

    @Override
    public void turnOff() {

        System.out.println("Turning off now");
        tv.setState(tv.offState);

    }

    @Override
    public void turnUp() {
        System.out.println("Turned 10% up ");
    }

    @Override
    public void turnDown() {
        System.out.println("Turned 10% down ");

    }

    @Override
    public void ChannelUp() {

        System.out.println("Changed channel up");
    }

    @Override
    public void ChannelDown() {

        System.out.println("Changed channel down");
    }
}
