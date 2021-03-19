//Q1 Program to print table from 2 to 10 ( using for loop )
public class Table {

	public static void main(String[] args) {
		for( int i = 2; i<=10; i++) {
			
			for( int j = 1 ; j<=10; j++) {
				if( j == 1 ) {
					System.out.println("\n");
					System.out.println("Table Of "+ i ) ;
					System.out.println("\n");
				}
				System.out.println( i +"*" + j + " = " + i*j);
				
			}
		}

	}

}
