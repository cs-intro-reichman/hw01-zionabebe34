/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// Put your code here

		int coins , quarters , cents; 
		coins = Integer.parseInt(args[0]); 
		quarters = 25; 
		cents = coins % quarters; 
	    coins =  coins / quarters;

		System.out.println("Use" + " " + coins + " " + "quarters" + " " + "and" + " " + cents + " " +"cents"); 




	}
}