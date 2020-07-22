package java_core_2.lesson1;

public abstract class Team {
    private int maxRange;
    private int maxJump;


    public Team(int maxRange, int maxJump) {
        this.maxRange = maxRange;
        this.maxJump = maxJump;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getMaxJump() {
        return maxJump;
    }


    public abstract void runTreadmill(Treadmill treadmill);
    public abstract void jumpWall(Wall wall);

}
