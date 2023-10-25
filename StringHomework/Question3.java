package StringHomework;
/*Write a java program which replace a “I love java” to “we love java”
Expected output: We love java*/
public class Question3 {
    public static void main(String[] args) {
        String name = "I love java";
        String name1= "we love java";
        name = name1.replace("I love java ", "we love java");
        System.out.println("Expected output: " + name);
    }

}
