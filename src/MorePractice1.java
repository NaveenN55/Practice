import java.util.Scanner;

public class MorePractice1 
{

	public static void main(String[] args) 
	{
		System.out.println("I can print things to the screen");
		
		//make variables and intialize them
		int num = 9; // declared an initialized the variable
		String str = "This is a string";
		double decimal = 3.5;
		
		System.out.println(num + "\n");
		System.out.println(decimal);
		System.out.println(str);
		
	    num *= 2; // num = num * 2
	    decimal *= num; 
	    str += "concatenation";
	    System.out.println("num:" +  num);
	    System.out.println("decimal:" + decimal);
	    System.out.println("str:" +  str);
	    
	    Scanner keyboard = new Scanner(System.in);
	    System.out.print("What is your favorite sport?:");
	    String sport = keyboard.nextLine();
	    System.out.print("My favorite sport is:");
	    String sport1 = keyboard.nextLine();
	    System.out.println("Your favorite sport is " +  sport "My favorite sport is"  +  sport1);
	    
	}

}
