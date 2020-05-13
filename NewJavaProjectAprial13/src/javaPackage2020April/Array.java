package javaPackage2020April;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  arrayRefVar=new datatype[size];  
		
	//	int a[]=new int[5]; //instantiate(object) & declaration 
		
		int a[]= {33,22,11,44,55}; //another way to declare data in array
		
		
		/*    a[0]=10; //another way to assign variables to array
		a[1]=11;
		a[2]=20;
		a[3]=50;
		a[4]=60;
		//a[5]=70; //array index out of bound      */
		
		
		int len=a.length;
		System.out.println("len is "+ len);
		for(int loop:a) {
			System.out.println(loop);
		}

	}

}
