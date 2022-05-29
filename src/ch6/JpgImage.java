package ch6;

public class JpgImage extends Image {
    public JpgImage() {

    }
    public JpgImage(Filter filter) {
        this.filter = filter;
    }
    @Override
    public void process() {
        System.out.println("对JPG格式的图片进行处理");
        filter.addFilter();
    }
}
