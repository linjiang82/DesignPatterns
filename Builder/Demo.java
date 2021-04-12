package Builder;

public class Demo {

    public static void main(String[] args) {
        User user= new User.Userbuild("John","Lin").age(19).build();
        System.out.println(user.getAddress());
        System.out.println(user.getAge());
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
    }

}
