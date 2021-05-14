package Visitor;

public class Necessity implements Visitable {
    private double price;
    Necessity(double price){
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
