package javaPackage2020April;

public class ThisKeyword {

		void m()
		{
			System.out.println("hello m");}  
		
		void n()
		{  
		System.out.println("hello n");  
		
		//m();//same as this.m()  
		
		this.m(); // this refers current class method  and call m method internally
		
		}  
		 
	
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		ThisKeyword tk=new ThisKeyword();
 		tk.n(); // it prints both methods
	
 	}

}
