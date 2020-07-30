package java_core_2_lesson_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayListTask1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Андрей");
        names.add("Валерий");
        names.add("Георгий");
        names.add("Степан");
        names.add("Иван");
        names.add("Геропокл");
        names.add("Евклид");
        names.add("Елисей");
        names.add("Евдоким");
        names.add("Панкрат");
        names.add("Ефим");
        names.add("Михаил");
        names.add("Джон");
        names.add("Георгий");
        names.add("Евклид");
        names.add("Геропокл");
        names.add("Георгий");
        names.add("Дмитрий");
        names.add("Сергей");
        names.add("Александр");

        System.out.printf("Вся коллекция имен составляет: %n" + names);

        Set<String> stringSet = new LinkedHashSet<>(names);
        System.out.printf("%nУникальные имена это:%n " + stringSet);

        HashMap<String, Integer> doubleNames = new HashMap<>();
        Integer doubleName;
        for (String i : names) {

            doubleName = doubleNames.get(i);
            doubleNames.put(i, doubleName == null ? 1 : doubleName + 1);
        }

         System.out.printf("%n" + doubleNames);
    }
}
