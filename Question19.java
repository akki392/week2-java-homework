/*Write a Java Program using below steps.
19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement
 */
public class Question19 {
    String name ="hitesh";
    static String name1 ="rutvi";
    public void code1 () {
        String method ="instance";
        System.out.println(method);
        System.out.println(name);
        System.out.println(name1);
    }
    public static void agile () {
        String method1 ="static";
        Question19 question19=new Question19();
        System.out.println(method1);
        System.out.println(question19.name);
        System.out.println(name1);
    }
    public static void main(String[] args) {
        String name2 ="codebuster demo";
        System.out.println(name2);
        Question19 question19=new Question19();
        question19.code1();
        agile();
    }
}
