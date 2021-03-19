// Q2 Write a program to findd given year is Leap year or not ( using ternary statement ) 
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int leapyear = 2008 ; // input year
		boolean  result = false ; // flag
		String output = "" ; // output text
		// leap year is every 4 year
		if(leapyear % 4 == 0 ) {
			
			// check for 00's year 
			
			if( leapyear % 100 == 0) {
				// 00 is leap if it's divisible by 400
				result = ( leapyear % 400 == 0 )? true : false ; 
			}else {
				// if it's not a 00 year and is divisible by 4
				result = true ; 
			}
			
		}
		output = (result) ? leapyear +" is a leap year" : leapyear +" is not leap year";
		System.out.println(output);
		
	}

}
