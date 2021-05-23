package Command;

public interface ICommand {
    public void execute();
}


class StartLight implements ICommand{
    private Light light;
    StartLight(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        this.light.start();
    }
}
class StopLight implements ICommand{
    private Light light;
    StopLight(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        this.light.stop();
    }
}

class TurnOffDishwasher implements ICommand{
    private DishWasher dishWasher;
    TurnOffDishwasher(DishWasher dishWasher){
        this.dishWasher=dishWasher;
    }
    @Override
    public void execute() {
        dishWasher.turnOff();
    }
}
class TurnOnDishwasher implements ICommand{
    private DishWasher dishWasher;
    TurnOnDishwasher(DishWasher dishWasher){
        this.dishWasher=dishWasher;
    }
    @Override
    public void execute() {
        dishWasher.turnOn();
    }
}

class StartFan implements ICommand{
    private Fan fan;
    StartFan(Fan fan){
        this.fan=fan;
    }

    @Override
    public void execute() {
        this.fan.start();
    }
}
class StopFan implements ICommand{
    private Fan fan;
    StopFan(Fan fan){
        this.fan=fan;
    }

    @Override
    public void execute() {
        this.fan.stop();
    }
}
