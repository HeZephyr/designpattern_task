package ch2;

public class GifReader implements ImageReader {
    @Override
    public void readImage() {
        System.out.println("读取GIF格式的图片");
    }
}
