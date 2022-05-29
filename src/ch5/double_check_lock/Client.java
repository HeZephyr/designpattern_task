package ch5.double_check_lock;

public class Client {
    public static void main(String[] args) {
        VirtualUserGenerator virtualUserGenerator1, virtualUserGenerator2;
        virtualUserGenerator1 = VirtualUserGenerator.getVirtualUserGenerator();
        virtualUserGenerator2 = VirtualUserGenerator.getVirtualUserGenerator();

        System.out.println("软件开发191班 贺志飞 5720191408");
        System.out.println("双重检测锁实现虚拟用户生成器");
        if (virtualUserGenerator1 == virtualUserGenerator2) {
            System.out.println("是相同的虚拟用户生成器");
        }
        virtualUserGenerator1.generateUser();
        virtualUserGenerator2.generateUser();
    }
}
