// Q7 answer - In java we ccannot have nested methods. It Leads to an error as shown in example below.
public class Nestedmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
	}
	
	static void run() {
		void dance() {
			System.out.println("AAA");
		}
	}

}
