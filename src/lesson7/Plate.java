package lesson7;

public class Plate {
    private int food;
    private int space;

    public Plate(int food, int space) {
        this.food = food;
        this.space = space;
    }


    public void setSpace(int space) {
        this.space = space;
    }

    public void addFood(int food) throws InterruptedException {
        this.food += this.space;
        System.out.println("added " + food +  " food in plate");
        info();
        setSpace(0);
        Thread.sleep(3000);
    }
    public void decreaseFood (int foodCount){
        this.food -= foodCount;
        this.space += foodCount ;
    }

    public void checkFood() throws InterruptedException {
        if (this.food <= 6){
            addFood(space);
        }
    }

    public int getFood() {
        return food;
    }


    public void info(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food  +
                '}';
    }


}
