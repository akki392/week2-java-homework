/*Write a Java program that takes a number as input and prints its multiplication
table up to 10.
Test Data: Input a number: 8.
Expected Output:
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 10 = 80*/
public class Question10 {
    int a=1,b=2,c=3,d=4,e=5,f=6,g=7,h=8,i=9,j=10;

    public void m1() {
        System.out.println("Expected output:");
        System.out.println("8 * 1 =" +h*a);
        System.out.println("8 * 2 =" +h*b);
        System.out.println("8 * 3 =" +h*c);
        System.out.println("8 * 4 =" +h*d);
        System.out.println("8 * 5 =" +h*e);
        System.out.println("8 * 6 =" +h*f);
        System.out.println("8 * 7 =" +h*g);
        System.out.println("8 * 8 =" +h*h);
        System.out.println("8 * 9 =" +h*i);
        System.out.println("8 * 10 =" +h*j);
    }
    public static void main(String[] args) {
        Question10 question10 = new Question10();
        question10.m1();
    }
}
