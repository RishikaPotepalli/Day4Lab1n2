package uu;
import java.util.Scanner;

public class Traffic {
	public static void main(String[] args) 
	{       
		while(true){
			System.out.println("Select the number: ");
			System.out.println("1-RED");
			System.out.println("2-GREEN");
			System.out.println("3-YELLOW");
			
			Scanner a = new Scanner(System.in);//accept user input
			int n=a.nextInt();
			
			
			switch(n){
			case 1: System.out.println("STOP");
			break;
			case 2: System.out.println("GO");
			break;
			case 3: System.out.println("READY");
			break;
			default: System.out.println("Wrong input");
			break;
			}
		}}

	}
