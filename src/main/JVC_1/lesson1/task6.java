package JVC_1.lesson1;

public class task6 {


    // 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное.
    public static boolean negativeTrue (int a){
        return  (a < 0);

        }

    public static void main(String[] args) {
        System.out.println(negativeTrue(-5));
    }
}
