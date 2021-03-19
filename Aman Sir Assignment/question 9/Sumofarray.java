
//Q9 answer - create an array of 10 numbers and print the sum of 10 numbers.

//import java.util.Arrays;

public class Sumofarray {

//program to print sum of array range
	public static void main(String[] args) {
		// this method returns range of numbers from 1 .... 10
		int[] num = myNumbers(10);
		
		//print array in colsole
		//System.out.println(Arrays.toString(num));
		
		int sums = 0 ; 
			// sum of array
			for( int j = 0; j<num.length; j++) {
				
				sums+=num[j];
			}
			
		System.out.println(sums);

	}

	static int[] myNumbers(int range) {
		//instantiate an array with size defined from the parameter
		int[] numbers = new int[range];
		if(range != 0) {
			
			for( int i = 0; i < range; i++) {

				numbers[i]=i+1;
			}
		}
		
		return numbers;


	}

}
