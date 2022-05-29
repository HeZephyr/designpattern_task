package ch1;

public class Employee extends User {
    public Employee(String name) {
        this.name = name;
    }
    @Override
    public void add(User user) {
        throw new IllegalArgumentException("不支持此方法！");
    }

    @Override
    public User getUser(int index) {
        throw new IllegalArgumentException("不支持此方法!");
    }

    @Override
    public void remove(User user) {
        throw new IllegalArgumentException("不支持此方法！");
    }

    @Override
    public void action(String info) {
        System.out.println(name + "收到会议通知：" + info);
    }
}
