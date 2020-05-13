package exceptionHandling;

public class ThroughException {
	int age;
	  
	 ThroughException(int age){ 
		this.age=age;
		
		     if(age<18)
		    	 
		      throw  new ArithmeticException("not valid");  
		     else  
		      System.out.println("welcome to vote");  
		   }  
		 
	
	public static void main(String args[]){  
		ThroughException te=new ThroughException(19); //13  
	      System.out.println("rest of the code...");  

	       }


}
