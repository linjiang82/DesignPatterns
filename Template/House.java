package Template;

abstract class House {
    public void buildHouse(){
        buildBase();
        buildWall();
        buildRoot();
        paintHouse();
        decorate();
    }

    abstract void buildWall();
    abstract void paintHouse();
    abstract void decorate();
    private void buildRoot(){
        System.out.println("building root");
    }
    private void buildBase(){
        System.out.println("building base");
    }
}

class GlassHouse extends House{
    @Override
    void buildWall() {
        System.out.println("build glas wall");

    }

    @Override
    void paintHouse() {
        System.out.println("paint glas wall");
    }

    @Override
    void decorate() {

        System.out.println("decorate glas house");
    }
}
class GrassHouse extends House{
    @Override
    void buildWall() {
        System.out.println("build grass wall");

    }

    @Override
    void paintHouse() {
        System.out.println("paint grass wall");
    }

    @Override
    void decorate() {

        System.out.println("decorate grass house");
    }
}
