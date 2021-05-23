package Command;

public interface IReceiver {
}

class Light implements IReceiver{
    public void start(){
        System.out.println("Light started");
    }
    public void stop(){
        System.out.println("Light stopped");
    }
}
class Fan implements IReceiver{
    public void start(){
        System.out.println("Fan started");
    }
    public void stop(){
        System.out.println("Fan stopped");
    }
}

class DishWasher implements IReceiver{
    public void turnOff(){
        System.out.println("Dishwasher turned off");
    }
    public void turnOn(){
        System.out.println("Dishwasher turned on");
    }
}
