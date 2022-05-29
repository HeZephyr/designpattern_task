package ch4;

public class Client {
    public static void main(String[] args) {
        Mission mission = new Mission("1001", 70);
        Officer bangzhang, paizhang, yingzhang;

        bangzhang = new Banzhang("张三");
        paizhang = new Paizhang("李四");
        yingzhang = new Yingzhang("王五");

        // 设置上级
        paizhang.setSuccessor(yingzhang);
        bangzhang.setSuccessor(paizhang);

        System.out.println("软件开发191班 贺志飞 5720191408");
        bangzhang.handleMission(mission);
    }
}
