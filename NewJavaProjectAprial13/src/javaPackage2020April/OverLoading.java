package javaPackage2020April;

 class Integer{
		int add(int a, int b) {
		return a+b;
		      }
	
	int add(int a, int b,int c) {
		return a+b+c;
	       }
	      } //closing integer class
	

 
 public class OverLoading { //main class
        public static void main(String[] args) {
	
        	// TODO Auto-generated method stub
        
	       Integer in=new Integer();
		System.out.println(in.add(11,10)); // we can pass ir regular sequence of parameters in overloading
		System.out.println(in.add(11,10,22));
	 }

     }
