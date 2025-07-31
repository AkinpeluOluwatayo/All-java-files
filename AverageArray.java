import java.util.Scanner;
   public class AverageArray {
     public static void main(String[] args) {


	int[] average = new int[4];

	int sum = 0;

	average[0] = 2;
	average[1] = 4;
	average[2] = 6;
	average[3] = 8;
	
	for(int index = 0; index < average.length; index++) {

		sum += average[index];

	}

		System.out.println(sum);

	average = sum;

	if (average / average.length == 0 ){

	

	}else{
		System.out.print(sum);
		
		}







}


}