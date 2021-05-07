package Mediator;

public class Demo {
    public static void main(String[] args) {
        Chatroom chatroom = new Chatroom();
        User u1 = new User(chatroom,"123","John");
        User u2 = new User(chatroom,"124","Emma");
        User u3 = new User(chatroom,"125","Emily");
        chatroom.addUser(u1);
        chatroom.addUser(u2);
        chatroom.addUser(u3);
        u1.sendMsg("hello","124");
        u2.sendMsg("hello back","123");
    }
}
