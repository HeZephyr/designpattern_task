package ch4;

public class Yingzhang extends Officer {
    public Yingzhang(String name) {
        super(name);
    }

    @Override
    public void handleMission(Mission mission) {
        if (mission.getEnemyNumber() >= 50 && mission.getEnemyNumber() < 200) {
            System.out.println(name + "营长" + "下达代号为" + mission.getCode() + "的作战任务，敌人数量为" + mission.getEnemyNumber());
        } else if (mission.getEnemyNumber() >= 200) {
            System.out.println("开会讨论代号为" + mission.getCode() + "的作战任务，敌人数量为" + mission.getEnemyNumber());
        } else {
            throw new RuntimeException("抛出异常：敌人数量小于50，不应该由营长处理，越级");
        }
    }
}
