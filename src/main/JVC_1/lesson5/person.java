package JVC_1.lesson5;

public class person {
     String fullName;
     String position;
     String email;
     int phone;
     int salary;
     int age;

     public int getAge(){
         return age;

     }


    public person(String fullName, String position, String email, int phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void personInfo() {
        System.out.println("Fio " + fullName + "\npos " + position + "\nemail " + email + "\nphone "+ phone + "\nsalary "+ salary + "\nage "+ age + "\n");
    }

}