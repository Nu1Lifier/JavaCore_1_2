package lesson4;

import java.util.Random;
import java.util.Scanner;

    public class tic_tac_toe {

        // Игровое поле можно представить в виде символьного двумерного массива размером 3х3, 4х4.
        // В каждой ячейке массива могут находиться символы 'X’, ‘O’, ‘•’,
        // которые означают фишки игроков и пустое поле. Для указания размера поля и количества
        // фишек для победы добавим две константы SIZE и DOTS_TO_WIN.

        public static char[][] map;
        public static final int SIZE = 4;
        public static final int DOTS_TO_WIN = 4;

        // Ячейки поля. Чтобы не забыть, какой символ за что отвечает, их можно записать в именные константы.
        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';

        // Основной игровой цикл
        public static void main(String[] args) {
            playGame();
        }

        public static void playGame() {
            initMap();
            printMap();
            while (true) {
                humanTurn();
              //printMap(); ЛИШНЕЕ
                if (checkWin(DOT_X)) {
                    System.out.println("Победил человек");
                    printMap();
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    printMap();
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("Победил Искуственный Интеллект");
                    printMap();
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    printMap();
                    break;
                }
            }
            System.out.println("Игра закончена");
        }

        // Инициализация поля. При запуске программы необходимо инициализировать поле и заполнить все его ячейки символом, обозначающим пустое поле.
        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        // Вывод поля в консоль. Проинициализированное поле готово. Теперь необходимо вывести его в консоль.
        public static void printMap() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Метод хода человека
        // Во-первых, создать Scanner для считывания данных из консоли.
        // Во-вторых, перед ходом игрока вывести сообщение о запросе координат.
        // В-третьих, запросить координаты и уменьшить их на 1, так как для игрока удобно вводить координаты в формате 1-3, при том что в массиве это индексы 0-2.
        public static Scanner sc = new Scanner(System.in);
        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y));
            map[y][x] = DOT_X;
        }

        // Ход компьютера.
        // Метод rand.nextInt(n) возвращает случайное число в диапазоне от 0 до n – 1 включительно.
        public static Random rand = new Random();
        public static void aiTurn() {
            int x, y;
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (!isCellValid(x, y));
            //System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1)); ЛИШНЕЕ
            map[y][x] = DOT_O;
        }

        // Проверка победы. Необходимо проверить все выигрышные комбинации. Если хотя бы одна будет найдена, вернуть true.
        // В приведённом ниже варианте производится проверка всех возможных комбинаций с помощью 8 условий,
        // для поля 3х3 такой подход может быть оправдан. Если размер поля или длину выигрышной серии можно будет увеличить,
        // лучше найти другой вариант проверки победы, например, через циклы(для поля 4х4 придется написать уже не 8, а 24 условия).
        public static boolean checkWin (char symb) {
            for (int i = 0; i < DOTS_TO_WIN; i++)

                if ((map[i][0] == symb && map[i][1] == symb && map[i][2] == symb && map[i][3] == symb) ||
                        (map[0][i] == symb && map[1][i] == symb && map[2][i] == symb && map[3][i] == symb))
                    return true;
            if ((map[0][0] == symb && map[1][1] == symb && map[2][2] == symb && map[3][3] == symb) ||
                    (map[3][0] == symb && map[2][1] == symb && map[1][2] == symb && map[0][3] == symb))
                return true;
            return false;
        }

        // Проверка ячеек. Метод isCellValid() проверяет возможность установки фишки в указанную ячейку.
        public static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                System.out.println("Проверьте значения х у");
                return false;
            }
            if (map[y][x] == DOT_EMPTY) return true;
            return false;
        }

        // Проверка поля.
        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }

    }




