import java.util.Random;
import java.util.Scanner;
	public class GuessingGame {
	public static void main(String[] args){

	Random random = new Random();
	Scanner input = new Scanner(System.in);

int sum = 0;
for(int i = 1; i <= 100; i++) {
    int guessNumber = random.nextInt(2)+1;

     System.out.println("attempt " +i );
     int userGuess = input.nextInt();	

    if (userGuess == guessNumber){
	System.out.println("True!");
	

       }else{
	 System.out.print("False! ");
	    }
  }




}


}