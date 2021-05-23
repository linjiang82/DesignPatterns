package Command;

public class Demo {
    public static void main(String[] args) {
        Invoker remote = new Invoker();
        Fan f1 = new Fan();
        Light l1 = new Light();
        DishWasher d1 = new DishWasher();
        StopLight LightStopCommand = new StopLight(l1);
        StartLight LightStartCommand = new StartLight(l1);
        StopFan fanStopCommand = new StopFan(f1);
        StartFan fanStartCommand = new StartFan(f1);
        TurnOnDishwasher turnOnDishwasher = new TurnOnDishwasher(d1);
        TurnOffDishwasher turnOffDishwasher = new TurnOffDishwasher(d1);
        remote.setCommand(LightStopCommand);
        remote.pressButton();

        remote.setCommand(LightStartCommand);
        remote.pressButton();
        remote.setCommand(fanStartCommand);
        remote.pressButton();
        remote.setCommand(fanStopCommand);
        remote.pressButton();
        remote.setCommand(turnOffDishwasher);
        remote.pressButton();
        remote.setCommand(turnOnDishwasher);
        remote.pressButton();
    }


}
