import java.util.Scanner;
   public class ArrayInput {
     public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int [] chairs = new int[5];


      chairs[0] = 5;
      chairs[1] = 4;
      chairs[2] = 3;
      chairs[3] = 2;
      chairs[4] = 1;

	System.out.println(chairs[0]+" Chairs");
	System.out.println(chairs[1]+" Chairs");
	System.out.println(chairs[2]+" Chairs");
	System.out.println(chairs[3]+" Chairs");
	System.out.println(chairs[4]+" Chair");


	System.out.println("What is the sum of the chairs in total?");
	int sumInput = input.nextInt();


	int sum = 0;

	for (int index = 0; index < chairs.length; index++){

	 sum += chairs[index];   


	}

	System.out.println("The total chairs are: "+sum);


	if(sumInput == sum) {
	
	System.out.print("You are correct!!!");

	}else{
	  
	System.out.print("You are wrong");

	}

	

}

}