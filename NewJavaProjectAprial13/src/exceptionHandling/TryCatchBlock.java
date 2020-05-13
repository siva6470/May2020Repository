package exceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int data=90/0;
		
		System.out.println("this statemnt will not exicute"); //  // if exception occurs, the remaining statement will not exceute  

		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
			System.out.println("handling airthematic exception");
		}

	}

}
