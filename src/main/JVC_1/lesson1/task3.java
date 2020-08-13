package JVC_1.lesson1;

public class task3 {




    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float calculate (float a, float b, float c, float d) { return  (a * (b + (c / d))); }


    public static void main(String[] args) {
        System.out.println(calculate(4,4,4,4));
    }

}
