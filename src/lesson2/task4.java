package lesson2;

import java.util.Arrays;

public class task4 {


//   4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void square1DiagonalArray (){
        int counter = 1;
        int[][] data = new int[10][10];
        int n = 1;


        for (int i = 0; i < data.length; i++) {
            int lastIndex = data.length - 1;
            data[i][i] = data[i][lastIndex - i] = 1;
        }


        for (int i = 0; i < data.length ; i++) {
            System.out.println(Arrays.toString(data[i]));
        }

    }






    public static void main(String[] args) {

        square1DiagonalArray();

    }
}

