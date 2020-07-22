package java_core_2.lesson1;

public class Robot extends Team {

    public Robot(int maxRange, int maxJump) {
        super(maxRange, maxJump);
    }

    @Override
    public void runTreadmill(Treadmill treadmill) {
        if (treadmill.getRange() <= getMaxRange() )
            System.out.println("Робот пробежал " + treadmill.getRange() + " метров" );
        else System.out.println("Робот не смог пробежать " + treadmill.getRange() + " метров");
    }

    @Override
    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= getMaxJump())
            System.out.println("Робот смог перепрыгнуть препятствие высотой " + wall.getHeight() + " метра");
        else System.out.println("Робот не смог перепрыгнуть препятствие");
    }
}
