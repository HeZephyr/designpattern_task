package ch1;

public abstract class User {
    protected String name;
    /**
     * 添加对象
     * @param user
     */
    public abstract void add(User user);

    /**
     * 删除对象
     * @param user
     */
    public abstract void remove(User user);

    /**
     * 获取对象
     * @param index
     * @return 对象
     */
    public abstract User getUser(int index);
    /**
     * 会议行为
     */
    public abstract void action(String info);
    public String getName() {
        return name;
    }
}
