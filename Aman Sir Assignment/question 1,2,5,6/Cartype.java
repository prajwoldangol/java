// Q2 - Class is a blueprint for creating object. Class is collection of variables,attributes and method.
// Object is an instance of class. We can create object as much as we like or as per need of project.
// Each object holds unique identifier in memory .



// Q5 - Constructor is called when each object is created. 
// Q5 - Method can be accessed after creating an object unless it's a Static Method. 

//Q1 answer

public class Cartype {

	public static void main(String[] args) {
		// Q6 answer -  creating object "type"  from class " Car  " using a parameterized Constructor.
		Car type = new Car("Tesla", "S", 50000);
		// acccessing a method after creating object.
		type.carDetails();
		
		// Q6 answer - Using Default constructor instead of parameterized prints the default values from a method carDetails()
		Car type2 = new Car();
		type2.carDetails();

	}

}
