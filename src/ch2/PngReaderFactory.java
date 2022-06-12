package ch2;

public class PngReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader createImageReader() {
        ImageReader pngReader = new PngReader();
        return pngReader;
    }
}
