package Builder;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phone;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    User(Userbuild userbuild){
        this.firstName=userbuild.firstName;
        this.lastName=userbuild.lastName;
        this.age=userbuild.age;
        this.address=userbuild.address;
        this.phone=userbuild.phone;
    }
    public static class Userbuild{
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String phone;

        public Userbuild(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        Userbuild phone(String phone){
            this.phone =phone;
            return this;
        }
        Userbuild address(String address){
            this.address = address;
            return this;
        }
        Userbuild age(int age){
            this.age = age;
            return this;
        }
        User build(){
            User user = new User(this);
            return user;
        }
    }
}
