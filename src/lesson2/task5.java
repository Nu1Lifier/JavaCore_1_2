package lesson2;

public class task5 {



//    5.** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        public static void minAndMax() {
            int[] arr = new int[]{4, 6, 3, 7, 9, 1, 2};
            int min = arr[0];
            int max = arr[0];


            for (int i = 0; i < arr.length; i++) {

                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println(min);
            System.out.println(max);
        }

    public static void main(String[] args) {
        minAndMax();
    }
}
