import java.util.Scanner;
     public class Grade {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Enter score");
	int userInput = input.nextInt();
	System.out.println(score(userInput));


        }

	public static String score(int userInput){

	if (userInput > 100 || userInput < 0) {

	return "Invalid score.Please enter a value between 0 and 100";

	
	}else if (userInput > 77){

	return "Grade B:- Good job, keep improving!!";
	
	}else {

	return "you can do better, keep studying";

	}
	








	}


}