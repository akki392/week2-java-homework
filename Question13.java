/*Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.6 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Question13 {
    static float width=5.6f;
    static double height=8.5d;
    static double area = width*height;
    static double perimeter = 2*(width+height);

    public static void m2(){

        System.out.println("Expected output: ");
        System.out.println("Area is 5.6 * 8.5 ="+area);
        System.out.println("Perimeter is 2 * (5.6 + 8.5) ="+perimeter);
    }
    public static void main(String[] args) {
        m2();
    }

}
