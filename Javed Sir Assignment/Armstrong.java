// Write a program to find whether given number is Armstrong or not.
public class Armstrong {

	public static void main(String[] args) {
		int num = 54745 ; // input number
		int resultnumber = num ; // to compare the final output with non manupulated num.
		int result = 0 ; // final result
		int temp = 0 ; // first temp value
		int temp2 = 1 ; 
		int newnumber = 0 ; 
		int count = 0 ; // counter for number n
		int tempo = num ;
		// while loop counting the number of digits in input 54745 have 5 digit so it makes count 5
		while( tempo != 0 ) {

			tempo = tempo / 10;
			count++;
		}		
		while( num != 0 ) {
			// this gives the last number as remainder
			temp = num % 10 ;
			temp2 = temp ; // maintain original digit
			
			// finding the multiplication of temp value n times where n is count
			int i = 1 ; 
			while(  i < count) {
				
				temp = temp*temp2 ;	
				i++;
			}
			// gives the remaining number 
			newnumber = num / 10 ;
			// num will be the newnumber
			num = newnumber ; 
			// add the n multiplication of all individual digits
			result += temp ; 
			
		}	
		if(result == resultnumber ) {
			System.out.println(resultnumber + " is Armstrong Number");
		}else {
			System.out.println(resultnumber + " is not Armstrong Number");
		}

	}

}
