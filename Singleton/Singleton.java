package Singleton;

public class Singleton {
    static private Singleton instance;

    private String name;
    private String address;

    private Singleton(String name, String address) {
        this.name = name;
        this.address = address;
    }

    static public Singleton create(String name, String address) {
        if (instance == null) {
            instance = new Singleton(name, address);
        }

        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
