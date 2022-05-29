package ch1;

public class Client {
    public static void main(String[] args) {
        Department department1, department2;
        Employee employee1, employee2, employee3, employee4, employee5;

        department1 = new Department("研发组");
        department2 = new Department("测试组");

        employee1 = new Employee("张三");
        employee2 = new Employee("李四");
        employee3 = new Employee("王五");
        employee4 = new Employee("赵六");
        employee5 = new Employee("吴七");

        department1.add(employee1);
        department1.add(employee2);

        department2.add(employee3);
        department2.add(employee4);

        MeetingList meetingList = new MeetingList();

        meetingList.addUser(department1);
        meetingList.addUser(department2);
        meetingList.addUser(employee5);

        System.out.println("软件开发191班 贺志飞 5720191408");
        meetingList.sendNotification();
    }
}
