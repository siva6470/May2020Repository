package javaPackage2020April;

class Sample{
	
	final int i=10;
void display() {
	
	// i=20; // we cant change craible with in the class if we declare variable as final
	System.out.println(i);
}
}



public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample sm= new Sample();
		sm.display();

	}

} // with final keyword we cant change variables with in the class
 // with final keyword we cant chane methods by inheritence meant cant ovverride
// with final keyword we cant extend class by in heritence
