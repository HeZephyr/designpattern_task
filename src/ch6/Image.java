package ch6;

public abstract class Image {
    protected Filter filter;
    public void setFilter(Filter filter) {
        this.filter = filter;
    }
    /**
     * 处理图片方法
     */
    public abstract void process();
}
