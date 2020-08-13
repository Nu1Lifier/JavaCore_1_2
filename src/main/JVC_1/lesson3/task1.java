package JVC_1.lesson3;

import java.util.Scanner;

public class task1 {

    public static void Answer() {
        int answer = (int) (Math.random() * 10);
        int maxTryCount = 5;
        int tryCount;
        int userAnswer;
        Scanner scannerAnswer = new Scanner(System.in);

        System.out.println("Введите число от 1 до 10");


        for ( tryCount = 1; tryCount <= maxTryCount; tryCount++) {

            userAnswer = scannerAnswer.nextInt();

            if (userAnswer == answer) {
                System.out.println("Поздравляю, вы угадали!");
                break;
            } else if (userAnswer > answer) {
                System.out.println("Вы ввели слишком большое число.");
            } else if (userAnswer < answer) {
                System.out.println("Вы ввели слишком маленькое число");
            }

            if (tryCount < maxTryCount){ System.out.println("Попробуйте еще раз. Введите число от 1 до 10\n У вас осталось " + (maxTryCount - tryCount) + " попыток"); }
            else if (tryCount == maxTryCount){ System.out.println("Вы проиграли"); }

        }

            System.out.println("1 - repeat\n 2 - exit");
            userAnswer = scannerAnswer.nextInt();
            if (userAnswer == 1) {
                Answer();
            } else {
                System.exit(0);
            }

    }



    public static void main(String[] args) {

        Answer();

    }

}
