package Adapter;

public class Demo {

    public static void main(String[] args) {
        RobotAttacker theRobot = new RobotAttacker();
        EnemyAttacker robotAttacker = new EnemyAttackerAdapter(theRobot);
        robotAttacker.attack();
        robotAttacker.moveForward();
        robotAttacker.assignDriver("John");
    }

}
