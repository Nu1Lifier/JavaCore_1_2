package JVC_1.lesson7;

public class Plate {

    private int food;
    private int space;

    public Plate(int food) {
        this.food = food;
    }


    public int getFood() {
        return food;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public void info(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Plate{" + "food=" + food  + '}';
    }

    public void checkFood() throws InterruptedException {
        if (this.food <= 6){
            addFood(space);
            System.out.println();
        }
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
}
