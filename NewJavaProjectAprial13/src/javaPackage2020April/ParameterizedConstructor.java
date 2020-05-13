package javaPackage2020April;

public class ParameterizedConstructor {

	 int id;
	 String s1;

	
	ParameterizedConstructor(int i,String s){
		 
		 id=i;
		 s1=s;
		 
		System.out.println(+id +" " +s1);
		
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizedConstructor pc=new ParameterizedConstructor(22,"siva"); 
		 

	}

}
