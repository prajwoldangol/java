
//Q3 - Global variable is defined in scope of class before method are created. Local variable is defined within
// local scope such as inside a method as shown in example below. Local Var is only accessible to block where its defined.
// Global var can be acccesed anywhere inside a class.


//Q4 -Yes, We can have both global and local variabe with same name.


public class GlobalLocal {
	//defining global variable
	static String globalVar = "Hey I am  Global var from Global space" ; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GlobalLocal.globalVar) ;
		localVar();

	}
	
	static void localVar() {
		//local variable with same name as global var
		String globalVar = "Hey I am Local var now from Local space" ; 
		
		System.out.println(globalVar) ;
	}
}
