package ch2;

import utils.XmlUtils;

public class Client {
    public static void main(String[] args) {
        ImageReaderFactory imageReaderFactory;
        ImageReader imageReader;
        // 通过读取config.xml文件来获取类名，使得可以不用修改源程序只需要修改而更改所需要获取的对象
        imageReaderFactory = (ImageReaderFactory) XmlUtils.getBean("ch2.className");
        imageReader = imageReaderFactory.createImageReader();
        System.out.println("软开191班 贺志飞 5720191408");
        imageReader.readImage();
    }
}
