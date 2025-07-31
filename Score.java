import java.util.Scanner;
public class Score {
 public static void main(String [] args) {

  Scanner input = new Scanner(System.in);

int sum = 0;
int maxScore = 0;

for(int index =1;  index <= 3; index++) {
      
 	System.out.println("Enter ayomide's scores for subject" + index +  ":");  
	int userInput = input.nextInt(); 

	sum += userInput; 

if (userInput > maxScore ) {
 maxScore = userInput;
}
	
	  }
	 System.out.println("The sum of subject is: " + sum );

	int average = (sum / 3); 
	
	 System.out.println("The average score is: " + average);

 
   	 System.out.println("The highest is: " + maxScore);	







 
} 


}