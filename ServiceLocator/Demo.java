package ServiceLocator;

import ServiceLocator.Service;
import ServiceLocator.ServiceLocator;

public class Demo {
    public static void main(String[] args) {
        Service s1 = ServiceLocator.getService("Service1");
        s1.execute();
        Service s2 = ServiceLocator.getService("Service2");
        s2.execute();
        Service s11 = ServiceLocator.getService("Service1");
        s11.execute();


    }
}
