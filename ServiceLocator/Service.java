package ServiceLocator;

public interface Service {
    public String getName();
    public void execute();
}

class Service1 implements Service{
    public String getName(){
        return "Service1";
    }

    public void execute(){
        System.out.println("Service1 exec");
    }
}
class Service2 implements Service{
    public String getName(){
        return "Service2";
    }

    public void execute(){
        System.out.println("Service2 exec");
    }
}
