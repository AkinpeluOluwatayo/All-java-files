import java.util.Random;
import java. util.Scanner;
public class Calculator{
   public static void main(String[] args){

   Scanner scanner = new Scanner(System.in);
   Random random = new Random();

   char operator;
   
  
   int wrongAnswer = 0;
    int correctAnswer = 0; 

   for (int i = 1; i <= 10; i++){

   int guessNumber1 = random.nextInt(10)+1;
  
   int guessNumber2 = random.nextInt(10)+1;
   
   int guessOperator = random.nextInt(4);
   int sum = 0;
  
   
switch(guessOperator){
  case 0:
	operator = '+';
        sum = guessNumber1 + guessNumber2;
   break;

   case 1:
	operator ='-';
	sum = guessNumber1 - guessNumber2;
   break;

   case 2:
	operator = '/';
	sum = guessNumber1 / guessNumber2;
   break;

   default:
	operator ='*';
	sum = guessNumber1 * guessNumber2;
   break;


}
   
	    System.out.println("Question " + i + ": What is " + guessNumber1 + " " + operator + " " + guessNumber2 + " ?");
            int userAnswer = scanner.nextInt();

	if (userAnswer == sum){

	System.out.println("Correct Answer");
	correctAnswer++;
    }
	else{
	    System.out.println("Wrong  Answer.");
	    System.out.println("Correct Answer is: " + sum);
	    wrongAnswer++;

            
    }
    }

	System.out.println("Task completed");
	System.out.println("Correct Answer" + correctAnswer);
	System.out.println("Wrong Answer" + wrongAnswer);
}

}