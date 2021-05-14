package Visitor;

public class TaxHolidayVisitor implements  Visitor{
    @Override
    public void visit(Necessity necessity) {
        System.out.println("Necessity holiday tax price");
        System.out.println(necessity.getPrice()*0+necessity.getPrice());
    }

    @Override
    public void visit(Tobacco tobacco) {
        System.out.println("Necessity holiday tax price");
        System.out.println(tobacco.getPrice()*0.45+tobacco.getPrice());

    }

    @Override
    public void visit(Alcohol alcohol) {
        System.out.println("Necessity holiday tax price");
        System.out.println(alcohol.getPrice()*0.32+alcohol.getPrice());

    }
}
