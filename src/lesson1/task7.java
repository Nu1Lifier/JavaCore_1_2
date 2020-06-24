package lesson1;

public class task7 {


    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static String yourName (String Name){
        return  ("Привет, " + Name);
    }


    public static void main(String[] args) {
        System.out.println(yourName("Акакий"));
    }
}
