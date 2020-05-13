package javaPackage2020April;

class Emp { //2nd class
	String empid;
	String salary;
	Agreegation agreegation; // entity refernce of another class called agregation
	
	Emp(String empid, String salary,Agreegation agreegation) { //method constructor
		this.empid=empid;
		this.salary=salary;
		this.agreegation=agreegation;
		   } //first method
	
     void display() { 
	System.out.println(empid+" "+salary);
	System.out.println(agreegation.city+" "+agreegation.name);
	
	
}
	}   //2 nd class closing
	
	
	
	
	
	public class Agreegation { //main class
		String name;
		String city;
	     
		public Agreegation(String name,String city) { //method
				this.name=name;
			    this.city=city;
			  } //closing first method
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agreegation ag=new Agreegation("siva","hyd");
		
	Emp em=new Emp("abc123","2 digits",ag);//here ag has total data of main calss(aggregation) and we passing ths refrence to agreegation(as parameter) which is in second class
	em.display();
	
	}

}
