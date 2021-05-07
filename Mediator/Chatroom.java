package Mediator;

import java.util.HashMap;
import java.util.Map;


interface IChatroom {
    void sendMsg(String msg, String id);
    void addUser(User user);
}
public class Chatroom implements IChatroom {
    Map<String,User> users = new HashMap<>();

    @Override
    public void sendMsg(String msg, String id) {
        users.get(id).receiveMsg(msg);

    }

    @Override
    public void addUser(User user) {
        users.put(user.getId(),user);
    }
}
