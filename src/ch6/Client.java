package ch6;

import utils.XmlUtils;

public class Client {
    public static void main(String[] args) {
        Image image;
        Filter filter;
        image = (Image) XmlUtils.getBean("ch6.imageClassName");
        filter = (Filter) XmlUtils.getBean("ch6.filterClassName");

        image.setFilter(filter);

        image.process();
    }
}
