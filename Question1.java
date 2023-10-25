/* write a java program using the following steps.
  1.1 declare two instance variables.
  1.2 declare one instance method.
  1.3 call both instance variables into the instance method inside the print statement.
  1.4 declare the main method.
  1.5 call the above instance method into the main method and run the program.
 */

public class Question1 {
    String name = "akash";
    String surname = "dalwadi";

    public void m1() {
        System.out.println(name);
        System.out.println(surname);
    }
    public static void main(String[] args) {
        Question1 question1 = new Question1();
        question1.m1();
    }

}
