package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<>();
    private int state = 0;

    public int getState() {
        return state;
    }
    public void setState(int value){
        this.state=value;
        notifyAllObs();
    }
    public void attach(Observer ob){
        observerList.add(ob);
    }
    public void deattach(Observer ob){
        observerList.remove(ob);
    }
    private void notifyAllObs(){
        for(Observer ob : observerList){
            ob.update();
        }
    }
}
