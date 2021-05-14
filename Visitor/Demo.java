package Visitor;

public class Demo {

    public static void main(String[] args) {
        Necessity milk  = new Necessity(3.6);
        Alcohol beer  = new Alcohol(2.5);
        Tobacco sigar  = new Tobacco(30.0);
        TaxVisitor tax = new TaxVisitor();
        TaxHolidayVisitor taxHoliday = new TaxHolidayVisitor();
        milk.accept(tax);
        beer.accept(tax);
        sigar.accept(tax);
        milk.accept(taxHoliday);
        beer.accept(taxHoliday);
        sigar.accept(taxHoliday);
    }
}
