package ch2;

public class JpgReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader createImageReader() {
        ImageReader jpgReader = new JpgReader();
        return jpgReader;
    }
}
