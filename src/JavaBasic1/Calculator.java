package JavaBasic1;

public class Calculator {
    public int sumNumbers(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public double multiplyNumbers(double n3, double n4){
        double result = n3*n4;
        return result;
    }

public static void main(String[] args) {

        Calculator obj = new Calculator();

        int output1 = obj.sumNumbers(2, 5);
        System.out.println("Tổng 2 số nguyên là: " + output1);

        double output2 = obj.multiplyNumbers(3.5,6.5);
        System.out.println("Tích 2 số thực là: " + output2);

    }

}
