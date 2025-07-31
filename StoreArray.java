import java.util.Scanner;
public class StoreArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] size = new int[5];
    int sum = 0;

 for (int index = 0; index < size.length; index++) {

	System.out.print("Enter sizes: ");
	size[index] = input.nextInt();
        

	sum += size[index];

	}


	System.out.println ("The sum of the size is: " +  sum);

	


  }


}

