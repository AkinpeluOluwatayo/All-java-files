import java.util.Scanner;
public class Resturant {
public static void main(String[] args) {

menu();
}

   // method 1//
   // homepage//
public static void menu(){
Scanner inputCollector = new Scanner(System.in);

System.out.print("""
        HomePage
     1: Fast Food

     2: Local Dishes
		    """);
   int userInput = inputCollector.nextInt();



    // fast food menu//
switch(userInput){
case 1:
     System.out.print("""
          Fast Food
        1: Burger
        2: Pizza       
	3. Exit
			""");
     int foodMenu = inputCollector.nextInt();





switch(foodMenu){
case 3:
menu();
}
break;



     //local dishes//
case 2:
    System.out.print("""
       Local dishes
    1: Jollof Rice
    2: Egusi Soup
    3. Exit
		  """);
    int foodMenu2 = inputCollector.nextInt();





switch(foodMenu2){
case 3:
menu();
break;

}
}

}











}