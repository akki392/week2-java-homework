/*Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method.
*/
public class Question17 {
    String city = "Harrow";
    static String country = "united kingdom";

    public void a1 () {
        System.out.println(country);
    }
    public static void a2 () {
        Question17 question17=new Question17();
        System.out.println(question17.city);
    }
    public static void main(String[] args) {
        Question17 question17=new Question17();
        question17.a1();
        a2();
    }
}
