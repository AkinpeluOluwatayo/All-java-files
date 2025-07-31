import java.util.Scanner;
  public class LargestNumber {
     public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     int[] sizes = new int[4];

  for (int index = 0; index < sizes.length; index++){

       System.out.println("Enter sizes");
	sizes[index] = input.nextInt();

	}
 
   	int largest = sizes[0];
	int smallest = sizes[0];

   for(int index = 1; index < sizes.length; index++){
	
   if (sizes[index] > largest){
  
	 largest = sizes[index];
  
	}
 
	

   if  (sizes[index] < smallest){

	smallest = sizes[index];

	}

	}
  





   System.out.println("The smallest is: " + smallest);
   System.out.println("The largest is: " + largest);



}

}