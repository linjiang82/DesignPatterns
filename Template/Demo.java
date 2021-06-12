package Template;

public class Demo {
    public static void main(String[] args) {
        House grassHouse = new GrassHouse();
        House glassHouse = new GlassHouse();
        grassHouse.buildHouse();
        glassHouse.buildHouse();
    }
}
