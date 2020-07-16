package lesson6;

public class animalsApp {
    public static void main(String[] args) {

        // лошадь и 1й кот
        horse horseKarl = new horse();
        cat catSalem = new cat();

        // лошадь
        horseKarl.run(150);
        horseKarl.run(527);
        horseKarl.run(2000);
        horseKarl.sail(10);
        horseKarl.jump(0.4);

        //1 кот
        catSalem.run(200);
        catSalem.run(201);
        catSalem.sail(5);
        catSalem.jump( 2);

        //2 кот (поменял макс дистанцию забега)
        cat catHarlem = new cat();
        catHarlem.setMaxDistanceRun(400);
        catHarlem.run(380);

        // я так понял, это и есть сборщик мусора? после забега 2го кота, макс дистанция стала прежней (200)
        catSalem.run(201);
        // upd блин, это же другой кот...


    }
}
