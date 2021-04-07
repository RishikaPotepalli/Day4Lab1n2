package o5;
import java.util.Scanner;
public class power {

	  public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the number: ");
	    int num= in.nextInt();
	    if (isTwoPower(num)) {
	      System.out.println("yes,the number is power of two");
	    } else {
	      System.out.print("no,the number is not power of two");
	    }
	  }

	  private static boolean isTwoPower(int number) {

	    if (number % 2 != 0) {
	      return false;
	    } else {

	      for (int i = 0; i <= number; i++) {

	        if (Math.pow(2, i) == number) 
                return true;
	      }
	    }
	    return false;
	  }
	}