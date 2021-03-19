// write a program to print 1,2,5,6 using continue statement.

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<=6; i++) {

			if(i>2 && i<5) {
				continue;
			}
			System.out.println(i);
		}


	}

}
