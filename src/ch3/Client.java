package ch3;

import utils.XmlUtils;

public class Client {
    public static void main(String[] args) {
        Application application;
        application = (Application) XmlUtils.getBean("ch3.className");

        System.out.println("软件开发191班 贺志飞 5720191408");
        application.run();
    }
}
