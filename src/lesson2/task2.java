package lesson2;

public class task2 {


    //   2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void arrayFilling (){
        int arr[] = new int[8];
        for (int i=0; i < arr.length; i++){
            arr[i] = 0;
            System.out.print (arr[i] + i*3 + " " );
        }

    }


    public static void main(String[] args) {
        arrayFilling();
    }
}
