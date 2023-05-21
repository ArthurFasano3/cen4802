package cen4802c;

/**
 * 
 * @author Arthur Fasano
 * @version 5/21/2023
 *
 */

public class RecursiveFib {

	/**
	 * 
	 * @param args launches application
	 */
	
	public static void main(String[] args) {
		
		int value1 = 10;
		
		int value2 = fibonacci(value1);
		
		System.out.printf("The %d th value of the fibonacci sequence is %d ." , new Object[] {value1, value2});

	}

/**
* 
* @param n , value of the number used to find the fib number in the sequence
* @return , returns the value of the fibonacci number requested by the user in the sequence
*/
public static int fibonacci(int n) {
		
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
		
	}

}
