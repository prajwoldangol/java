// Q5 Find odd and even number  in 1 to 100.

public class OddEven {

	public static void main(String[] args) {
		// maximum range of number input
		int range = 100 ;
		for(int i = 1; i <= range ; i ++) {

			// checking for even number 
			String result = (i % 2 == 0 ) ? i +" is even " : i + " is odd " ; 
			System.out.println(result);
		}
	}

}
