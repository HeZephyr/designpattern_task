package ch2;

public class JpgReader implements ImageReader {
    @Override
    public void readImage() {
        System.out.println("读取Jpg格式的图片");
    }
}
