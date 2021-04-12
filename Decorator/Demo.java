package Decorator;

public class Demo {

    public static void main(String[] args) {

        Beverage flatwhite = new Flatwhite("Flatwhite");
        System.out.println(flatwhite.getDescription());
        Beverage fwWithMilk = new MilkAddon("milk",flatwhite);
        System.out.println(fwWithMilk.getDescription());
        System.out.println(fwWithMilk.cost());
        Beverage withSugar = new SugarAddon("sugar",fwWithMilk);
        System.out.println(withSugar.getDescription());
        System.out.println(withSugar.cost());
    }
}
