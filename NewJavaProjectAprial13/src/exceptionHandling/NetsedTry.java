package exceptionHandling;

public class NetsedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try{  
			
		    
			try{  
		     System.out.println("going to divide");  
		     int b =39/0;  
		    }
		    catch(ArithmeticException e)
		    {
		    	System.out.println(e);
		    	}  
		   
	try{  
	  int a[]=new int[5];  
	   a[5]=4;  
		    }
	catch(ArrayIndexOutOfBoundsException e)
	{ 
	System.out.println(e);
		}  
		      System.out.println("other statement w ith in min try block");  
		     } //main try block closed
		
        catch(Exception e)
		  {
        	System.out.println("handeled");
        	}  
		finally { //finally block 
		       System.out.println("normal flow..");  
		}

	} // main method 

} //class closed 
