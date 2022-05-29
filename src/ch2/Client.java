package ch2;

public class Client {
    public static void main(String[] args) {
        ImageReaderFactory imageReaderFactory;
        ImageReader imageReader;
        imageReaderFactory = (ImageReaderFactory) XMLUtils.getBean();
        imageReader = imageReaderFactory.createImageReader();
        imageReader.readImage();
    }
}
