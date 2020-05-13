package javaString;

public class ToString2<retrun> {
	
	int num;
  

	 ToString2(int num) { //constructor
	this.num=num;
       }
		 
	// @Override
	public String toString() {
		return "num " +num ;
	}
		 public static void main(String args[]){  
			 ToString2 ts=new ToString2(2);
			 System.out.println(ts); // when we try to print object it prints string by ovveridng we can get desigred output
			
		 
		 } 

	   }



