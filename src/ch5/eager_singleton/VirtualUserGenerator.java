package ch5.eager_singleton;

public class VirtualUserGenerator {
    private static final VirtualUserGenerator instance = new VirtualUserGenerator();
    private VirtualUserGenerator() {
    }
    public static VirtualUserGenerator getVirtualUserGenerator() {
        return instance;
    }
}
