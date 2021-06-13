package Adapter;

public class EnemyAttackerAdapter implements EnemyAttacker{

    private RobotAttacker theRobot;

    EnemyAttackerAdapter(RobotAttacker newRobot){
        this.theRobot= newRobot;
    }


    @Override
    public void attack() {
        this.theRobot.smashedWithHands();
    }

    @Override
    public void moveForward() {
        this.theRobot.walkForward();
    }

    @Override
    public void assignDriver(String name) {
        this.theRobot.reactToHuman(name);
    }
}
