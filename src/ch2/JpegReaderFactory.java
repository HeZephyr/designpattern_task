package ch2;

public class JpegReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader createImageReader() {
        ImageReader jpegReader = new JpegReader();
        return jpegReader;
    }
}
