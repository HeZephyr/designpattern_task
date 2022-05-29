package ch5.double_check_lock;

public class VirtualUserGenerator {
    private volatile static VirtualUserGenerator virtualUserGenerator = null;
    private int count = 0;
    private VirtualUserGenerator() {

    }
    public static VirtualUserGenerator getVirtualUserGenerator() {
        if (virtualUserGenerator == null) {
            synchronized (VirtualUserGenerator.class) {
                if (virtualUserGenerator == null) {
                    // 创建单例实例
                    virtualUserGenerator = new VirtualUserGenerator();
                }
            }
        }
        return virtualUserGenerator;
    }
    public void generateUser() {
        count ++;
        System.out.println("生成了一个虚拟用户，当前虚拟用户数量为" + count);
    }
}
