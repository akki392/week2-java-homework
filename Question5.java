/* Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.)
*/
public class Question5 {

    public static void main(String[] args) {
        String name = "calculator";
        System.out.println("----"+name+"----");
        Question5 q = new Question5();
        q.addition(20,23.5);
        q.subtraction(25,20);
        multiplication(23,29);
        division(25,20);

    }
    public void name(String nam){System.out.println(nam);}
    public void addition(int x,double y){
        String name="calculator_";
        String name1="addition";
        System.out.println(name+name1);
        System.out.println(x+y);}
    public void subtraction(int x,int y){
        String name="calculator_";
        String name1="subtraction";
        System.out.println(name+name1);
        System.out.println(x-y);}
    public static void multiplication(int x,int y){
        String name="calculator_";
        String name1="multiplication";
        System.out.println(name+name1);
        Question5 question5=new Question5();
        System.out.println(x*y);
    }
    public static void division(int x,double y){
        String name="calculator_";
        String name1="division";
        System.out.println(name+name1);
        Question5 question5=new Question5();
        System.out.println(x/y);
    }
}