// Write a program to find fibonacci series from  0 to 5 numbers using do while.
public  class Fabonacci {

	public static void main(String[] args) {
		int fabonacci = 0 ; //first
		int fabonacci2 = 1; // second
		int temp = 0 ; //temporary value
		int i = 0 ;
		do {
			System.out.println(fabonacci);
			//store new current added value in temp
			temp = fabonacci + fabonacci2;
			// first become now second
			fabonacci = fabonacci2;
			// second is updated with current added temp value
			fabonacci2 = temp;

			i++;

		}
		while(i<=5);

	}

}
