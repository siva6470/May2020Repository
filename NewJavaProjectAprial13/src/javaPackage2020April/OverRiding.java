package javaPackage2020April;


class ExampleOfOverride{
	
	void add() {
		
		System.out.println(" this is method of base class");
	}

}

class Example2OFOverride extends ExampleOfOverride {
	
void add() {
		
		System.out.println(" this is method of child class");
	}
	
}
public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example2OFOverride ord=new Example2OFOverride(); //here we created object for child class  so it is applicable for child class
		ord.add();
		
	//over riding is specific implementation of method I.e. if we create object for 
		// parent class and calling parent class methos then it prints parent class method 
		
	}

}
