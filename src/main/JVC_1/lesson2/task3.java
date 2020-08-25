package JVC_1.lesson2;

import java.util.Arrays;

public class task3 {


    //   3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньше 6 умножить на 2;
    public static void comparisonAndMultiplyArray(){
        int arr[] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i=0; i < arr.length; i++) {
            if (arr[i] < 6){
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        comparisonAndMultiplyArray();
    }
}
