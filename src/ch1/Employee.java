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
    public void action(String message) {
        System.out.print(name + "收到会议通知！");
        System.out.println("通知内容：" + message);
    }
}
