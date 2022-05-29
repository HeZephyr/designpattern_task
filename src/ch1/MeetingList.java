package ch1;

import java.util.ArrayList;
import java.util.List;

public class MeetingList {
    private List<User> users = new ArrayList<>();
    public void addUser(User user) {
        users.add(user);
    }
    public void remove(User user) {
        users.remove(user);
    }
    public void sendNotification() {
        String info = "于2022年6月18日14:30在1302召开会议";
        for (Object user : users) {
            ((User)user).action(info);
        }
    }
}
