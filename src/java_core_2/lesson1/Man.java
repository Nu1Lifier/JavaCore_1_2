package java_core_2.lesson1;

public class Man extends Team {
    private int manMaxRange;
    private int manMaxJump;

    public Man(int manMaxRange, int manMaxJump) {
        this.manMaxRange = manMaxRange;
        this.manMaxJump = manMaxJump;
    }



    @Override
    public void run(int Range) {
        if (Range <= manMaxRange )
            System.out.println("Человек пробежал " + Range + " метров" );
        else System.out.println("Человек не смог пробежать " + Range + " метров");
    }

    @Override
    public void jump(int Jump) {
        if (Jump <= manMaxJump)
            System.out.println("Человек прыгнул на высоту " + Jump + " метров");
        else System.out.println("Человек не смог прыгнуть на высоту " + Jump + " метра");
    }

    @Override
    public void runTreadmill(Treadmill treadmill) {
        if (treadmill.getRange() <= manMaxRange )
            System.out.println("Человек пробежал " + treadmill.getRange() + " метров" );
        else System.out.println("Человек не смог пробежать " + treadmill.getRange() + " метров");
    }

    @Override
    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= manMaxJump)
            System.out.println("Человек смог перепрыгнуть препятствие высотой " + wall.getHeight() + " метра");
        else System.out.println("Человек не смог перепрыгнуть препятствие");
    }


}
