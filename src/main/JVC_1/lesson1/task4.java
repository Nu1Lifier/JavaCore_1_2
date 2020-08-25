package JVC_1.lesson1;

public class task4 {

    // 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    // (включительно), если да – вернуть true, в противном случае – false.
    public static boolean task10and20 (int a, int b){
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {
        System.out.println(task10and20(15,1));
    }
}
