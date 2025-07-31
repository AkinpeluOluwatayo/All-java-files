import java.util.Scanner;
  public class foodOrder {
  public static void main(String[] args){

  mainMenu();
  }

  public static void mainMenu(){
  Scanner inputCollector = new Scanner(System.in);
  System.out.print("""
            
            Welcome to Ayomide resturant
     
	Select Order
1. Order
2. Sell

					""");
int userInput = inputCollector.nextInt();

switch(userInput){
case 1: 
      System.out.print("""
	customers drink order 
     Select Order
1. Coke
2. Fanta
3. Pepsi
4. Exit

               """);
int drinkOrder = inputCollector.nextInt();

switch(drinkOrder){
case 1:
	System.out.print("""

 customers food order 
   select Order
1. Pizza
2. Chicken
3. Pasta
4. Exit
	""");
break;


case 2: 
System.out.print("""

 customers food order 
   select Order
1. Pizza
2. Chicken
3. Pasta
4. Exit
	""");
break;

case 3:
System.out.print("""

 customers food order 
   select Order
1. Pizza
2. Chicken
3. Pasta
4. Exit
	""");
break;

case 4:
mainMenu();
break;
}


}

}


}




