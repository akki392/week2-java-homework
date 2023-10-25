/*Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
public class Question14 {
    static int a =125;
    static int b=24;
    static int add=a+b;
    static int sub=a-b;
    static int mul=a*b;
    static int div=a/b;
    static int mod=a%b;
    public static void m2(){

        System.out.println("Expected output: ");
        System.out.println("125 + 24 = "+add);
        System.out.println("125 - 24 = "+sub);
        System.out.println("125 * 24 = "+mul);
        System.out.println("125 / 24 = "+div);
        System.out.println("125 mod 24 = "+mod);
    }
    public static void main(String[] args) {
        m2();
    }
}
