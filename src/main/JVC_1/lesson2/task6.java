package JVC_1.lesson2;

public class task6 {

//   6.** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место,
//        в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
//        checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.


    public static void checkBalance() {
        int[] arr = {1,2,3,3,3};
        int s = arr[0] + arr[1] + arr[2];
        int t = arr[3] + arr[4];

        if (s == t) {
            System.out.println(true);
        } else
        System.out.println(false);
    }





    public static void main(String[] args) {
        checkBalance();
    }
}
