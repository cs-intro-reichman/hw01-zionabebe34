/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here	

		//define the arguments of the scale
		int x = Integer.parseInt(args[0]); 
		int y = Integer.parseInt(args[1]);

		//random numbers
		int a = (int) (Math.random() * (x - y) + y); 
		int b = (int) (Math.random() * (x - y) + y);
		int c = (int) (Math.random() * (x - y) + y);

		//Math.min give the min number between 2 numbers
		int min = Math.min( a , (Math.min(b , c ) ) ); 

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println("The minimal generated number was:" + " " + min); 







		
	}
}
