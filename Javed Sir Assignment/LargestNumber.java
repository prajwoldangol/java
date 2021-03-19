// Q4 Write a program to find largest number among 3 ( using if else nested if )
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 6;
		int c = 83;
		// check for first number
		if ( a > b && a > c ) {
			System.out.println( a +" is largest number " ) ;
		}
		// check for second number
		else if(b  >a && b  >c){
			System.out.println( b +" is largest number " ) ;
		}else {
			
			System.out.println( c +" is largest number " ) ;
		}
	}

}
