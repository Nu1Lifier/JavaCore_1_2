package java_core_2.lesson1;

public class Robot extends Team {
    private int robotMaxRange;
    private int robotMaxJump;

    public Robot(int robotMaxRange, int robotMaxJump) {
        this.robotMaxRange = robotMaxRange;
        this.robotMaxJump = robotMaxJump;
    }



    @Override
    public void run(int Range) {
        if (Range <= robotMaxRange )
            System.out.println("Робот пробежал " + Range + " метров" );
        else System.out.println("Робот не смог пробежать " + Range + " метров");
    }

    @Override
    public void jump(int Jump) {
        if (Jump <= robotMaxJump)
            System.out.println("Робот прыгнул на высоту " + Jump + " метров");
        else System.out.println("Робот не смог прыгнуть на высоту " + Jump + " метра");
    }

    @Override
    public void runTreadmill(Treadmill treadmill) {
        if (treadmill.getRange() <= robotMaxRange )
            System.out.println("Робот пробежал " + treadmill.getRange() + " метров" );
        else System.out.println("Робот не смог пробежать " + treadmill.getRange() + " метров");
    }

    @Override
    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= robotMaxJump)
            System.out.println("Робот смог перепрыгнуть препятствие высотой " + wall.getHeight() + " метра");
        else System.out.println("Робот не смог перепрыгнуть препятствие");
    }
}
