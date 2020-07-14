package lesson6;

public class animal {
    String name;

    public animal() {

    }


    public animal (String name){
        this.name = name;
    }

    public void animalInfo(){
        System.out.println("animal: " + name);
    }

    public void jump(){
        System.out.println("animal is jumped");
    }
}



