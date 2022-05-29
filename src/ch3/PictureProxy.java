package ch3;

public class PictureProxy implements Application {
    private RealApplication realApplication = new RealApplication();

    @Override
    public void run() {
        System.out.println("图片快捷方式已经被调用！");
        realApplication.run();
    }
}
