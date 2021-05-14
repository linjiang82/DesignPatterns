package Visitor;

public class TaxVisitor implements Visitor{


    @Override
    public void visit(Necessity necessity) {
        System.out.println("Necessity tax price");
        System.out.println(necessity.getPrice()*0+necessity.getPrice());
    }

    @Override
    public void visit(Tobacco tobacco) {
        System.out.println("Necessity tax price");
        System.out.println(tobacco.getPrice()*0.32+tobacco.getPrice());

    }

    @Override
    public void visit(Alcohol alcohol) {
        System.out.println("Necessity tax price");
        System.out.println(alcohol.getPrice()*0.18+alcohol.getPrice());

    }
}
