import java.util.Scanner;
 public class New {
 public static void main(String [] args) {

  Scanner input = new Scanner(System.in);

  System.out.print("""    
   Select Option   
1.) Amount of numbers
2.) Size of numbers
		           """);
int userInput = input.nextInt();

switch(userInput) {
 case 1: 
	int num = 0;

for(int index = 1; index <= 3; index++) {

	num += index;

        System.out.println("Enter numbers");
	int numInput = input.nextInt();
}
	
	System.out.println("The sum of numbers are: " + num);

	int average = (3 / 2);

	System.out.println("The average is: " + average);




}
   




}

}