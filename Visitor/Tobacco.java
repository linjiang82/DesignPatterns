package Visitor;

public class Tobacco implements Visitable {

    private double price;

    Tobacco(double price) {
        this.price = price;
    }


    public double getPrice() {
        return price;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
