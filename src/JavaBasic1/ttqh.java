/* Kiểm tra tên học sinh nhập vào có phải là "anh" không?
tuổi có lớn hơn 18 không?
giới tính là nữ không?
*/

package JavaBasic1;
import java.util.Scanner;
public class ttqh {
    String verify(String name, int age, String gender){
//        String name;
//        int age;
//        String gender;

        if( name.contains("anh") && age >= 18 && gender.equalsIgnoreCase("Female")){
            return "Verified successfully";
        }

        else if (name.contains("anh") && (age < 18 || !gender.equalsIgnoreCase("Female"))){
            return "check age or gender again";
        }

        else{
            return "verified unsuccessfully";
        }
    }

String compare(int n){
        int number = 100;
        if( n == number){
            return "n = number";
        }
        else if ( n < number){
            return "n < number";
        }
        else{
            return " n > number";
        }
}

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine(); // take a line as input
        int age = input.nextInt();
        input.nextLine();// Consume the newline character left by nextInt()
        String gender = input.nextLine();

        ttqh obj = new ttqh();
        String result = obj.verify(name, age, gender);
        System.out.println(result);

        int n = input.nextInt();
        input.nextLine();
        String compare = obj.compare(n);
        System.out.println(compare);

        input.close();
    }

}
