package JVC_1.lesson1;

public class task5 {

    // 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void  checkPositiveOrNegative (int a){
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void main(String[] args) {
        checkPositiveOrNegative(5);
    }
}
