package java_core_2_lesson_3;

import java.util.HashMap;
import java.util.HashSet;

public class MainPhoneBook {


    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Bob", 4564587, 0, 0);
        phoneBook.add("Mike", 12547896, 12365478, 98563214);
        phoneBook.add("Billy", 12345678, 78953000, 45698521);
        phoneBook.add("Bob", 8954458, 0,0);


        phoneBook.get("Bob");
    }
}

class PhoneBook {

    HashMap<String, HashSet<Integer>> phoneBook1;

    PhoneBook() {
        this.phoneBook1 = new HashMap<>();
    }

    void add(String name, int num1, int num2, int num3) {
        HashSet<Integer> phoneBook = phoneBook1.getOrDefault(name, new HashSet<>());
        phoneBook.add(num1);
        phoneBook.add(num2);
        phoneBook.add(num3);

        phoneBook1.put(name, phoneBook);
    }

    void get(String name) {

        System.out.printf("%nКонтакт "+name+": "+ phoneBook1.getOrDefault(name, new HashSet<>()));
    }
}
