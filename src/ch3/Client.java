package ch3;

import utils.XmlUtils;

public class Client {
    public static void main(String[] args) {
        Application application;
        application = (Application) XmlUtils.getBean("ch3.className");

        application.run();
    }
}
