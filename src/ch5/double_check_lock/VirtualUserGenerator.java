package ch5.double_check_lock;

public class VirtualUserGenerator {
    private volatile static VirtualUserGenerator instance = null;
    private VirtualUserGenerator() {

    }
    public static VirtualUserGenerator getVirtualUserGenerator() {
        if (instance == null) {
            synchronized (VirtualUserGenerator.class) {
                if (instance == null) {
                    // 创建实例
                    instance = new VirtualUserGenerator();
                }
            }
        }
        return instance;
    }
}
