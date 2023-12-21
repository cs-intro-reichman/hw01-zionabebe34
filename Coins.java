/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		
        //define the arguments
		int coins , quarter , cents; 
		coins = Integer.parseInt(args[0]); 
		quarter = 25; 

		//caculate the value of cents and quarters
		cents = coins % quarter; 
	    coins =  coins / quarter;

		System.out.println("Use" + " " + coins + " " + "quarters" + " " + "and" + " " + cents + " " +"cents"); 




	}
}