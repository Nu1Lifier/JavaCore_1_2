package lesson7;

public class Cat {

    private final String name;
    private final int appetite;
    private int satiety;

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void info(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Cat [" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                ']';
    }

    public void eat(Plate plate) throws InterruptedException {
        doEat(plate);
        info();
        plate.info();
        System.out.println();
        Thread.sleep(3000);
    }

    public void doEat(Plate plate) {
        if (plate.getFood() >= appetite){
            satiety = satiety + appetite;
            plate.decreaseFood(appetite);
        } else {
            satiety = satiety + plate.getFood();
            plate.decreaseFood(plate.getFood());
        }
    }
}
