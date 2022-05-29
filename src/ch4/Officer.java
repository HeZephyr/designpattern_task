package ch4;

public abstract class Officer {
    protected String name;
    protected Officer successor;
    public Officer(String name) {
        this.name = name;
    }
    public void setSuccessor(Officer successor) {
        this.successor = successor;
    }

    /**
     * 递交任务书
     * @param mission
     */
    public abstract void handleMission(Mission mission);
}
