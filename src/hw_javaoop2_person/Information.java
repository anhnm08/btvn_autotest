package hw_javaoop2_person;

public class Information {
    public static void main (String[] args){

        Person per1 = new Person();

        System.out.println(per1.getName());
        System.out.println(per1.getAge());
        System.out.println(per1.getGender());
        System.out.println(per1.getAddress());
        System.out.println(per1.getPhone());

        Person per2 = new Person("Anh",23,"Female","Hanoi","012345678");
        System.out.println("__________________");
        per2.getInfo();

    }
}
