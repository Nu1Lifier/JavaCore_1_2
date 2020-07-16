package lesson6;

public class horse extends animal{
    private int maxDistanceRun = 1000;
    private int maxDistanceSail = 10;
    private double maxHeightJump = 0.5;


    public horse() {

    }

    public horse(int distance) {
        super(distance);
    }


    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= maxDistanceRun - 500)
            System.out.println("Лошадь запросто преодолела " + distance + " метров");

        if (distance > 500 && distance <= maxDistanceRun)
            System.out.println("Лошадь пробежала " + distance + " метров и довольна прогулкой");

        if (distance > maxDistanceRun) {
            System.out.println("лошадь: " + distance + "???  та ну не, я столько не хочу бегать");
        }
    }

    @Override
    public void sail(int distance) {
        if (distance <= maxDistanceSail)
            System.out.println("Лошадь проплыла " + distance + " метров");
        if (distance > maxDistanceSail)
        System.out.println("Лошадь не настолько плавательная");

    }

    @Override
    public void jump( double height) {
        if(height >= 0 && height <= maxHeightJump) {
            System.out.println("Лошадь подпрыгнула на " + height + " метра");
        } else
            System.out.println("Лошадь: нее, я на такое расстояние не прыгну");
    }
}
