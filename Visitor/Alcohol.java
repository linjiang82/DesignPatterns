package Visitor;

public class Alcohol implements Visitable{
    private double price;
    Alcohol(double price){
        this.price=price;
    }


    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
