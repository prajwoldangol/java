//Q8 answer - Calling same method within method. 

public class Recursion {
	
	static int multiply( int num ) {
		
		if(num != 0 ) {
			
			return num * multiply( num - 1);
		}
		else {
			// exit of num is 0 . IF it's not done then the program runs for infinity.
			return 1;
		}
	
	
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = multiply(5);
		System.out.println(result);
	}
	
	
}
