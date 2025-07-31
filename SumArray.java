   public class SumArray {
   public static void main(String[] args) {
   

   int [] scores = {2,3,4,5}; 

    int sum = 0;

    for(int index = 0; index < scores.length; index++) {

        
	 sum += scores[index];
	}

		System.out.println(sum);


}

}