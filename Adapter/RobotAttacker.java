package Adapter;

import java.util.Random;
public class RobotAttacker {
    private Random r = new Random();

    public void smashedWithHands() {
        int damage = r.nextInt(10)+1;
        System.out.println("The robot caused "+ damage+" damage with the hands");
    }

    public void walkForward() {
        int steps = r.nextInt(5)+1;
        System.out.println("The robot walked "+ steps+" forward");

    }

    public void reactToHuman(String name) {
        System.out.println(name +" is controlling the robot");
    }
}
