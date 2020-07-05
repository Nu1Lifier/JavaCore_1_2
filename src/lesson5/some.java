package lesson5;

public class some {


    public static void main(String[] args) {
        person[] persArray = new person[5];
        persArray[0]  = new person("Ivan", "Director", "Ivan.@3Topora.ru", 112, 35000, 23);
        persArray[1]  = new person("Clint", "cleaner", "Clint.@3Topora.ru", 911, 35000, 54);
        persArray[2]  = new person("Fedor", "commandos", "Fedor.@3Topora.ru", 228, 35000, 64);
        persArray[3]  = new person("Sanya", "mascot", "Sanya.@3Topora.ru", 322, 35000, 22);
        persArray[4]  = new person("Oleg", "hacker", "Oleg.@3Topora.ru", 148, 35000, 65);

        for (int i = 0; i < persArray.length ; i++) {
            if (persArray[i].getAge() > 40){
                persArray[i].personInfo();
            }

        }

    }

}
