package Singleton;

public class Demo {

    public static void main(String[] args) {

        Singleton s =  Singleton.create("john", "hume");
        Singleton s1=  Singleton.create("emma", "hume");
        System.out.println(s.getName());
        System.out.println(s.getAddress());
        System.out.println(s1.getName());
        System.out.println(s1.getAddress());
    }
}
