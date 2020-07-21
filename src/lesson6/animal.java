package lesson6;

public abstract class animal {
    protected int distance;
    protected double height;


    public animal() {

    }

    public animal (int distance){
        this.distance = distance;
    }


    public abstract void run(int distance);
    public abstract void sail(int distance);
    public abstract void jump(double height);



}



