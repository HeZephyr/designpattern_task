package ch2;

public class JpegReader implements ImageReader{
    @Override
    public void readImage() {
        System.out.println("读取JPEG格式的图片");
    }
}
