package javaPackage2020April;

 class Inherit { //Base class
	
	
	 void bark() {
		System.out.println("Actual this method calling from child class object even it is in base class method " + " dog barks");
		
	         }
	 
      }  
 
 class Eats extends Inherit{ //child class
	 void eats() {
		 System.out.println(" dog also eats");
	 }
	    }
 
 	
 class Inheritence { //main class and main method
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eats et=new Eats(); // here we r creating object for second class and caling base class method with child class object
	
		et.eats();
	    et.bark(); 
		
		
	}

}
