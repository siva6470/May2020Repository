package javaPackage2020April;

abstract class  Demo{
	 void run (){
		 System.out.println(" this is rum method in abstract class");
		      }
	 
	 Demo(){ // constructor in abstract class
		 
		 System.out.println(" constructor method inabstract class");
	    }
	 
	 abstract void eat();
	 
	 static void drink() {
		 System.out.println(" this is static method in abstraction ");
	 }
	 
} //closing first class

class Demo1 extends Demo{ 
	
	void eat() { // implementing abstract method
		
		System.out.println("implemented abstract method");
	}
	
}

public class Abstaraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo dm=new Demo1();
		dm.eat();
		dm.run();
		Demo.drink(); // calling static method with class name caz it is static
		
		
	}

}
