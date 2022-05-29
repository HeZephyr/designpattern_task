package ch2;

public class GifReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader createImageReader() {
        ImageReader gifReader = new GifReader();
        return gifReader;
    }
}
