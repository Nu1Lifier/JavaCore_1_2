package java_core_2.lesson1;

public class Cat extends Team {
    private int catMaxRange;
    private int catMaxJump;

    public Cat(int catMaxRange, int catMaxJump) {
        this.catMaxRange = catMaxRange;
        this.catMaxJump = catMaxJump;
    }

    @Override
    public void run(int Range) {
        if (Range <= catMaxRange )
        System.out.println("Кот пробежал " + Range + " метров" );
        else System.out.println("Кот не смог пробежать " + Range + " метров");
    }

    @Override
    public void jump(int Jump) {
        if (Jump <= catMaxJump)
            System.out.println("Кот прыгнул на высоту " + Jump + " метров");
        else System.out.println("Кот не смог прыгнуть на высоту " + Jump + " метра");
    }

    @Override
    public void runTreadmill(Treadmill treadmill) {
        if (treadmill.getRange() <= catMaxRange )
            System.out.println("Кот пробежал " + treadmill.getRange() + " метров" );
        else System.out.println("Кот не смог пробежать " + treadmill.getRange() + " метров");
    }

    @Override
    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= catMaxJump)
            System.out.println("Кот смог перепрыгнуть препятствие высотой " + wall.getHeight() + " метра");
        else System.out.println("Кот не смог перепрыгнуть препятствие высотой " + wall.getHeight());
    }


}
