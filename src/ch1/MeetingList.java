package ch1;

import java.util.ArrayList;
import java.util.List;

public class MeetingList {
    private List<User> users = new ArrayList<>();
    public void addUser(User user) {
        System.out.println(user.getName() + "注册到会议列表中！");
        users.add(user);
    }
    public void removeUser(User user) {
        System.out.println(user.getName() + "退出会议列表！");
        users.remove(user);
    }
    public void sendNotification() {
        String message = "于2022年6月18日14:30在1302召开会议";
        for (Object user : users) {
            ((User)user).action(message);
        }
    }
}
