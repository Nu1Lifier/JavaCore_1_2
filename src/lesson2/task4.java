package lesson2;

public class task4 {


//   4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void square1DiagonalArray (){
        int counter = 1;
        int[][] data = new int[5][5];
        int n = 1;
        int SIZE = 5;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE ; j++) {
                if (i == j){ n = 1; }

                System.out.printf("%3d", data[i][j] = n++);

//                    4 0
//                    3 1
//
//                    1 3
//                    0 4
            }
            System.out.println();
        }



//        for (int [] datum : data) {
//            for (int i : datum) {
//                System.out.printf("%3d", i);
//
//            }
//            System.out.println();
//
//        }



    }


    public static void main(String[] args) {
        square1DiagonalArray();
    }
}

