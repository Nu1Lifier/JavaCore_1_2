package lesson6;

public class animalsApp {
    public static void main(String[] args) {
        animal animal = new animal("Busya");
        cat cat = new cat("Bars", "white");
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();
    }
}
