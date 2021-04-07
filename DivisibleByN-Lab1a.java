package Lab1a;
import java.util.Scanner;

public class DIVISIBLElab1b {

	
	
	static int sum(int N, int X, int Y)
	{
		int A1, A2, A3;
	
		A1 = ((N / X)) * (2 * X + (N / X - 1) * X) / 2;
		A2 = ((N / Y)) * (2 * Y + (N / Y - 1) * Y) / 2;
		A3 = ((N / (X * Y))) * (2 * (X * Y)+ (N / (X * Y) - 1) * (X * Y))/ 2;
						
	
		return A1 + A2 - A3;
	}
	
	
	public static void main(String []args)
	{
		int N = 14;
		int X = 3, Y = 5;
	
		System.out.println(sum(N, X, Y));
	
	}
}