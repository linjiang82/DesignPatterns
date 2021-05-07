package Mediator;

interface IUser {
    void sendMsg(String msg,String userId);

    void receiveMsg(String msg);
}

public class User implements IUser {

    private Chatroom chatroom;
    private String id;
    private String name;

    public User(Chatroom chatroom, String id, String name) {
        this.chatroom = chatroom;
        this.id = id;
        this.name = name;
    }

    @Override
    public void sendMsg(String msg, String userId) {
        System.out.println(this.getName()+" is sending "+  msg);
        getChatroom().sendMsg(msg,userId);

    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println(this.getName()+" received a msg: "+msg);

    }

    public Chatroom getChatroom() {
        return chatroom;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
