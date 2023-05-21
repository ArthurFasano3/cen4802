package cen4802c;

public class RecursiveFib {

	public static void main(String[] args) {
		
		int value1 = 10;
		
		int value2 = fibonacci(value1);
		
		System.out.printf("The %d th value of the fibonacci sequence is %d ." , new Object[] {value1, value2});

	}
	
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
