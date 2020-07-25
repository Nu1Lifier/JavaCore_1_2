package Java_Core_2_lesson_2;

public class App {

    public static void main(String[] args) {
        String[][] array = new String[4][4];

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j] = "пум" + j;
                System.out.println(array[i][j] + " ");

            }
            System.out.println();
        }


        try {
            try {
                int sum = ArraySize.getArray(array);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
