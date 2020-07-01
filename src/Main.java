public class Main {


// всякая всячина

//    public static String createPhoneNumber(int[] numbers) {
//        for(int i=0;i<numbers.length;i++){
//
//
//
//        }
//    }

    public static void main(String[] args) {

    }

    public static class drawSpiralExample {
        static int MAX = 100;
        static void spiralFill(int m, int n, int a[][]) {
            int val = 1;
            int k = 0, l = 0;

            while (k < m && l < n) {
                for (int i = l; i < n; ++i) {
                    a[k][i] = val++;
                }
                k++;

                for (int i = k; i < m; ++i) {
                    a[i][n - 1] = val++;
                }
                n--;
                if (k < m) {
                    for (int i = n - 1; i >= l; --i) {
                        a[m - 1][i] = val++;
                    }
                    m--;
                }
                if (l < n) {
                    for (int i = m - 1; i >= k; --i) {
                        a[i][l] = val++;
                    }
                    l++;
                }
            }
        }

        public static void main(String[] args) {
            int m = 3, n = 3;
            int a[][] = new int[MAX][MAX];
            spiralFill(m, n, a);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
//




// 1) Стандартная задача с собеседований: при помощи метода drawSpiral(int height, int weight) и двумерного массива нарисовать спиральную матрицу:
//01 12 11 10
//02 13 16 09
//03 14 15 08
//04 05 06 07
//Принцип заполнения: вниз -> вправо -> вверх -> влево
//Учтите, что столбцов и строк может быть минимум 1. А если числа разных разрядов, то еще нужно подумать о форматировании (подсказка: printf() поможет)
