package java_core_2.lesson1;

public class AppTest {

    public static void main(String[] args) {
        int Stage = 0;

       Team[] team = new Team[3];
       team[0] = new Cat(700, 5);
       team[1] = new Man(3000, 3);
       team[2] = new Robot(30000, 15);

       Treadmill treadmill = new Treadmill(300);
       Wall wall = new Wall(2);


       do {
           for ( Stage = 1; Stage <=3 ; Stage++) {
               treadmill.setRange(treadmill.getRange()*Stage);
               wall.setHeight(wall.getHeight()*Stage);
           for (int i = 0; i < 3; i++) {
               team[i].runTreadmill(treadmill);
           }
               for (int j = 0; j < 3; j++) {
                   team[j].jumpWall(wall);
               }

               System.out.println(Stage + " этап окончен" + "\n");
           }


       } while (Stage == 3);

    }
}
