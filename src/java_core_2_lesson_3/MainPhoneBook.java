package java_core_2_lesson_3;

import java.util.HashMap;
import java.util.HashSet;

public class MainPhoneBook {


    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Bob", 4564587);
        phoneBook.add("Bob", 8954458);
        phoneBook.add("Bob", 895213423);
        phoneBook.add("Mike", 12547896);
        phoneBook.add("Billy", 12345678);


        phoneBook.get("Bob");
    }
}

class PhoneBook {

    HashMap<String, HashSet<Integer>> phoneBook1;
    PhoneBook() {
        this.phoneBook1 = new HashMap<>();
    }

    void add(String name, int num1) {
        HashSet<Integer> phoneBook = phoneBook1.getOrDefault(name, new HashSet<>());
        phoneBook.add(num1);
        phoneBook1.put(name, phoneBook);
    }

    void get(String name) {

        System.out.printf("%nКонтакт "+name+": "+ phoneBook1.getOrDefault(name, new HashSet<>()));
    }
}
