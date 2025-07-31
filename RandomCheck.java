import java.util.Random;

import java.util.Scanner;
	public class RandomCheck {
	public static void main(String[] args) {

	Random random = new Random();
	Scanner input = new Scanner(System.in);
	
	
	int sum = 0;
     for(int i = 1; i <= 50; i++) {

	int input1 = input.nextInt();
	int guessNumber = random.nextInt(3)+1;
	

      if( i > 18) {

	 System.out.println("you are an adult");
      } else {

	 System.out.println("Ayo you are a child, chicken");
       }
	    

	 System.out.println();

	 }

	

	





}


}