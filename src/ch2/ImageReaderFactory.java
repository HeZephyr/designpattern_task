package ch2;

public interface ImageReaderFactory {
    /**
     * 生成读取图片对象
     * @return 图片对象
     */
    public ImageReader createImageReader();
}
