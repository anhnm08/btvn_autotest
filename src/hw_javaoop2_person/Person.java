package hw_javaoop2_person;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;


    public Person(){
        name = "Tên_kts";
        age = 22;
        gender ="Nữ_kts";
        address = "HN_kts";
        phone = "012345_kts";
    }

    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    protected void getInfo(){  //mục đích để in ra info của 4 biến
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(address);
        System.out.println(phone);

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender(){
        return gender;
    }

    protected String getAddress() {
        return address;
    }

    protected String getPhone() {
        return phone;
    }
}

