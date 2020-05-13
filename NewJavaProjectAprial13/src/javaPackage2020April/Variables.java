package javaPackage2020April;

public class Variables {

	int a=10; // class or instance variable cause these are declared inside class but out side of method
	static int b=20;
	
	public  void read(int c) {
		// TODO Auto-generated method stub

	 // local variables // int c=111;
		System.out.println("local variable is " +c);
		
		
		
	}
	
	public static void main(String[] args) {
		Variables vs=new Variables();
		System.out.println("class variable is " +vs.a);
         System.out.println("static is  " +b);
          vs.read(11);
        
	
	}

}
