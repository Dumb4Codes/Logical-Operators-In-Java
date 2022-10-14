import java.util.Scanner;

public class Z3_JavaLogicalOperators {

	public static void main(String[] args) {
		// logical operators = used to connect two or more expressions
		//    && = (AND) both conditions must be true
		//    || = (OR) either condition must be true
		//    !  = (NOT) reverses boolean value of condition
		
      int temp = 68;
      if (temp>30) {
    	  System.out.println("It is hot outside!");
      }
      else if(temp>=20 && temp<=30) {
    	  System.out.println("It is warm outside!");
      }
      else {
    	  System.out.println("It is cold outside!");
      }
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("You are playing a game press q or Q to exit the game");
      String response = scanner.nextLine();
      
      if(!response.equals("q") && !response.equals("Q")) {
    	  System.out.println("You exit the game!");
      }
      else {
    	  System.out.println("Your are still playing! pew* pew*");
      }
	}

}
