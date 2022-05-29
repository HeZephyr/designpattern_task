package ch5.eager_singleton;

public class VirtualUserGenerator {
    private static final VirtualUserGenerator virtualUserGenerator = new VirtualUserGenerator();
    private int count = 0;
    private VirtualUserGenerator() {
    }
    public static VirtualUserGenerator getVirtualUserGenerator() {
        return virtualUserGenerator;
    }
    public void generateUser() {
        System.out.println("生成了一个虚拟用户，当前虚拟用户数量为" + count);
    }
}
