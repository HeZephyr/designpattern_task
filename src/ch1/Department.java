package ch1;

import java.util.ArrayList;
import java.util.List;

public class Department extends User {
    List<User> members = new ArrayList<>();
    public Department(String name) {
        this.name = name;
    }
    @Override
    public void add(User user) {
        members.add(user);
    }

    @Override
    public void remove(User user) {
        members.remove(user);
    }

    @Override
    public User getUser(int index) {
        return members.get(index);
    }

    @Override
    public void action(String info) {
        for(Object member : members) {
            ((User)member).action(info);
        }
    }
}
