package javaString;

public class ToString1 {
       
	int rollno;  
		 String name;  
		 String city;  
		  
		 ToString1(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		   
		 public String toString()
		  
		 {//overriding the toString() method  
		  return rollno+" "+name+" "+city;  
		
		 }  
		
		 
		 public static void main(String args[]){  
			 ToString1 s1=new ToString1(101,"Raj","lucknow");  
			 ToString1 s2=new ToString1(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  
		 
		 } 

	   }



