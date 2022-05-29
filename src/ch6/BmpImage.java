package ch6;

public class BmpImage extends Image {
    public BmpImage() {

    }
    public BmpImage(Filter filter) {
        this.filter = filter;
    }
    @Override
    public void process() {
        System.out.println("对BMP格式的图片进行处理");
        filter.addFilter();
    }
}
