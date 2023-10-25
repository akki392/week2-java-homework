/*18. Write a Java Program using below steps.
18.1 Declare your council name as static variables.
18.2 Declare your house number as instance variables.
18.3 Declare one instance method name borough() and call Static variable
18.4 Declare static method name address() and call instance variable
18.5 Call both user defined methods into main method.
*/
public class Question18 {
 static String councilname ="brent";
 int housenumber = 84;
    public void borough () {
        System.out.println(councilname);
    }
    public static void address () {
        Question18 question18=new Question18();
        System.out.println(question18.housenumber);
    }
    public static void main(String[] args) {
        Question18 question18=new Question18();
        question18.borough();
        address();
    }

}
