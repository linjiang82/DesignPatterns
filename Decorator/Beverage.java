package Decorator;

public abstract class Beverage {
private String description;
Beverage(String s){
    this.description=s;
}
abstract double cost();
public String getDescription(){
    return description;
}
}

class Flatwhite extends Beverage{

    Flatwhite(String name){
       super(name);
    }

    @Override
    double cost() {
        return 3.5;
    }
}

abstract  class Addon extends Beverage{
    Beverage beverage;
    Addon(String s, Beverage beverage) {
        super(s);
        this.beverage = beverage;
    }
}

class MilkAddon extends Addon{

    MilkAddon(String s, Beverage beverage) {
        super(s,beverage);
    }
    @Override
    public String getDescription(){
        return beverage.getDescription()+" with Milk";
    }

    @Override
    double cost() {
        return beverage.cost()+0.5;
    }
}
class SugarAddon extends Addon{

    SugarAddon(String s, Beverage beverage) {
        super(s,beverage);
    }
    @Override
    public String getDescription(){
       return beverage.getDescription()+" with Suger";
    }

    @Override
    double cost() {
        return beverage.cost()+1.0;
    }
}