package ch6;

public class GifImage extends Image {
    public GifImage() {

    }
    public GifImage(Filter filter) {
        this.filter = filter;
    }
    @Override
    public void process() {
        System.out.println("对GIF格式的图片进行处理");
        filter.addFilter();
    }
}
