import java.util.Scanner; 
 public class Scoree {
 public static void main(String [] args) {

 Scanner input = new Scanner(System.in);

 int score = 0;

for(int index = 1; index <= 3; index++) {

	score += index;

	System.out.println("The subject score is: " + index + ": ");
	int studentScore = input.nextInt();

}
  	System.out.println("The sum of scores is: " +  score);




}

}