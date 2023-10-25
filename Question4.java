/* Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
*/
public class Question4 {
    String name = "akash";
    String surname = "dalwadi";
    static String city = "london";
    static String testinglanguage ="java";

    public void a1 () {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(city);
        System.out.println(testinglanguage);
    }

    public static void a2 () {
        Question4 question4=new Question4();
        System.out.println(question4.name);
        System.out.println(question4.surname);
        System.out.println(city);
        System.out.println(testinglanguage);
    }
    public static void main(String[] args) {
        Question4 question4=new Question4();
        question4.a1();
        a2();
    }




}

