package Adapter;
import java.util.Random;

public interface EnemyAttacker {
     void attack();
     void moveForward();
     void assignDriver(String name);
}

class EnemyTank implements EnemyAttacker{

    private Random r = new Random();

    @Override
    public void attack() {
      int damage = r.nextInt(10)+1;
      System.out.println("The tank caused "+ damage+" damage");
    }

    @Override
    public void moveForward() {
        int steps = r.nextInt(5)+1;
        System.out.println("The tank moved "+ steps+" forward");

    }

    @Override
    public void assignDriver(String name) {
        System.out.println(name +" is driving the tank");

    }
}
