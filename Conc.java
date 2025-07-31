import java.util.Scanner;
public class Conc {
 public static void main(String [] args) {

    Scanner input = new Scanner(System.in);



    System.out.println("Enter name");
    String input1 = input.nextLine(); 

    System.out.println("Enter age");
    int input2 = input.nextInt(); 

    System.out.println("Enter hobby");
    String userInput = input.next(); 

    System.out.println("Enter complexion");
    String userInput1 = input.next(); 




System.out.println("Her name is" + " "  + input1 + " " + "and she is" + " "  + input2 + " " + "she definely loves" + " " + userInput + " " + "She is beautiful because she is " + " " + userInput1 +  " " + "in complexion");



}


}