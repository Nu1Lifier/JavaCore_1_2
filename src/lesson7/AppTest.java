package lesson7;

public class AppTest {

    public static void main(String[] args) throws InterruptedException {

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Forest", 3, 0);
        cats[1] = new Cat("Skinny", 1, 0);
        cats[2] = new Cat("Morris", 4, 0);
        cats[3] = new Cat("Pumpik", 5, 0);
        cats[4] = new Cat("Gladiator", 7, 0);

        Plate plate = new Plate(10);
//        Plate[] plates = new Plate[3];
//        plates[0] = new Plate(10);
//        plates[1] = new Plate(10);
//        plates[2] = new Plate(10);


        for (int i = 0; i < cats.length; i++) {
            plate.checkFood();
            cats[i].eat(plate);
        }
    }
}
