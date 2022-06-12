package ch5.eager_singleton;

public class Client {
    public static void main(String[] args) {
        VirtualUserGenerator virtualUserGenerator1, virtualUserGenerator2;
        virtualUserGenerator1 = VirtualUserGenerator.getVirtualUserGenerator();
        virtualUserGenerator2 = VirtualUserGenerator.getVirtualUserGenerator();

        System.out.println("饿汉式单例实现的虚拟用户生成器测试");
        System.out.println("打印virtualUserGenerator1：" + virtualUserGenerator1);
        System.out.println("打印virtualUserGenerator2：" + virtualUserGenerator2);
        if (virtualUserGenerator1 == virtualUserGenerator2) {
            System.out.println("它们是同一个虚拟用户生成器");
        }
    }
}
