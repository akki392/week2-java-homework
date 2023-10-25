package StringHomework;
/*Write a java program which remove extra space from both side “ I love
java ”
Expected output: “I love java”*/

public class Question2 {
    public static void main(String[] args) {
        String name = "  I love java  ";
        name = name.replace("  "," ");
        System.out.println("Expected output:"+name);
    }
}
