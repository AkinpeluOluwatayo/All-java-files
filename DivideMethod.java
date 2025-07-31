public class General {
   public static void main(String [] args) {

    System.out.println(divideNumber(10, 2));

    System.out.println(sumNumber(3, 9));

    System.out.println(multiplyNumber(10, 9));
 
   }

    public static int divideNumber( int num1, int num2) {
    
    int division = num1 / num2;
    return division;
    }
    public static int sumNumber(int num1, int num2, int num3){
    int addition = num1 + num2 + num3;
    return addition;

}
    public static int multiplyNumber(int num1, int num2, int num3){
    int multiply = num1 * num2 * num3;
    return multiply;



}

}