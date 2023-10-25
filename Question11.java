/*Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output: 2.138888888888889*/
public class Question11 {
   static float a=25.5f;
    static double b=3.5d;
    static float c=40.5f;
    static double d=4.5d;
    static double sum=((a*b-b*b)/(c-d));

    public static void m2(){

        System.out.println("Expected output: "+sum);
    }
    public static void main(String[] args) {
        m2();
    }
}
