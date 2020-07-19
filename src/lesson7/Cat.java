package lesson7;

public class Cat {

    protected final String name;
    private int appetite;
    private int satiety;



    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }


    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) throws InterruptedException {
        doEat(plate);
        info();
        plate.info();
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

    public void info(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}
