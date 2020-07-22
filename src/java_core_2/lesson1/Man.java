package java_core_2.lesson1;

public class Man extends Team {

    public Man(int maxRange, int maxJump) {
        super(maxRange, maxJump);
    }

    @Override
    public void runTreadmill(Treadmill treadmill) {
        if (treadmill.getRange() <= getMaxRange() )
            System.out.println("Человек пробежал " + treadmill.getRange() + " метров" );
        else System.out.println("Человек не смог пробежать " + treadmill.getRange() + " метров");
    }

    @Override
    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= getMaxJump())
            System.out.println("Человек смог перепрыгнуть препятствие высотой " + wall.getHeight() + " метра");
        else System.out.println("Человек не смог перепрыгнуть препятствие");
    }


}
