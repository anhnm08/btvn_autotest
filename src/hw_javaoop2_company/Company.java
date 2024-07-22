package hw_javaoop2_company;

import hw_javaoop2_person.Person;

public class Company {
    public static void main(String[] args) {

       // Person person1 = new Person("Minh Anh",21,"Nữ","Hạ Long", "012345678");
        Person person1 = new Person("Minh Anh", 22, "Nữ");

        System.out.println("__________________");
        //person1.getInfo();
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());

    }
}

