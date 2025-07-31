import java.util.Scanner;
public class Even {
   public static void main(String [] args) {

   Scanner input = new Scanner(System.in);
   int userInput = input.nextInt();	

   int product = 1;

for(int index = 1; index <= 20; index++) {
	
	if (index % 2 == 0)
	 product *= index; 
     }


System.out.println("the product of the number is: " + product);




}
}