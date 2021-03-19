// Q2 - Class is a blueprint for creating object. Class is collection of variables,attributes and method.
// Object is an instance of class. We can create object as much as we like or as per need of project.
// Each object holds unique identifier in memory .


// Q5 - Constructor is called when each object is created. 
// Q5 - Method can be accessed after creating an object unless it's a Static Method. 

//Q1 Answer

//class Car
public class Car {

	String name = "Honda";
	String model = "Accord" ; 
	int price = 25000;
	
	
	Car(){
		// constructor without params..
	}
	
	
	// Constructor with parameters
	Car(String n, String m, int p){
		name = n;
		model = m;
		price = p;
	}
	// a method
	void carDetails() {
		
		System.out.println("This is "+name+" model \""+model+"\" which costs around "+ "$"+ price);

	}
}
