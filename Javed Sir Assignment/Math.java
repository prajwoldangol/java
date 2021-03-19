// Q3 Write a program to calculate Compound interest, simple interest, area of rectangle, perimeter of circcle using switch case.
public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float principalamount  = 10000 ; // principal amout
		float rate = 7;  // rate of interest
		int time = 2 ; // time
		int length = 5 ; // length
		int breadth = 6 ; // width or breadth
		int radius = 9 ; // radius ; 
		float Pi = 3.14f ; 
		String findthis = "AR" ; 
		float result = 0 ; 

		switch( findthis ) {
		// simple interest case.
		case "SI":
			// simple interest formula (p*t*r) / 100
			result  = (principalamount*time*rate)/100 ;
			System.out.println(" Simple Interest is " + result );
			break ;
		// compound interest case
		case "CI" :
			// compound interest formula p ( 1 + r/100 ) ^ t
			float ratepertime = 1 + rate/100  ; 
			float resulttemp = 1 ; 
			for( int i = 1 ; i <= time ; i++) {

				resulttemp*= ratepertime ; 
			}
			// compound interest = compound amount - principal 
			double compoundinterest = ((principalamount * resulttemp) - principalamount);
			
			System.out.println("Compound interest is " + compoundinterest) ; 
			break;
		// Area Of Rectangle case
		case "AR":
			// area of rectangle = l*b
			result = length * breadth ; 
			System.out.println("Area of Rectangle is " + result) ;
			break;
		// Perimeter of circle case
		case "PC":
			// perimeter of circle is 2*pi*r
			result = 2 * Pi * radius ; 
			System.out.println(" Perimeter of Circle is "+ result );
			break ; 
		default:
			System.out.println(" Error !! Case doesn't match ") ;
		}
	}

}
