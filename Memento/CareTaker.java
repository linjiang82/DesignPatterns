package Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Momento> momentos = new ArrayList<>();
    public void add(Momento momento){
        momentos.add(momento);
    }
    public Momento get(int index){
        return momentos.get(index);
    }
}
