package JVC_1.lesson6;

public class cat extends animal {
    private int maxDistanceRun = 200;
    private final String maxDistanceSail = "Коты не плавают";
    private int maxHeightJump = 2;


    public void setMaxDistanceRun(int maxDistanceRun) {
        this.maxDistanceRun = maxDistanceRun;
    }


    public cat(){

    }

    public cat(int distance) {
        super(distance);
    }


    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= maxDistanceRun)
            System.out.println("Кот пробежал " + distance + " метров, теперь он хочет молочка");

        if (distance > maxDistanceRun)
            System.out.println("Кот: " + distance + " метров??? та ну не, я столько не хочу бегать");
        }

    @Override
    public void sail(int distance) {
        System.out.println(maxDistanceSail);

    }

    @Override
    public void jump(double height) {
        if(height >= 0 && height <= maxHeightJump) {
            System.out.println("Кот подпрыгнул на " + height  + " метра");
        } else
            System.out.println("Кот: нее, я на такое расстояние не прыгну");
    }
}
