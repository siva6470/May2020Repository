package javaPackage2020April;

public class ArrayTwoD_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Multi diamentional array demo
		
		String Student_names[][]=new String[3][3];// it creates 9  memory allocation as 3*3 
		Student_names[0][0]="siva";
		Student_names[0][1]="siva1";
		Student_names[0][2]="siva2";
		Student_names[1][0]="siva3";
		Student_names[1][1]="siva4";
		Student_names[1][2]="siva5";
		Student_names[2][0]="siva6";
		Student_names[2][1]="siva7";
		Student_names[2][2]="siva8";
		
		System.out.println("Student name is "+Student_names[2][0]);
		
	/*	int cell=Student_names.length*Student_names[0].length;
		System.out.println(" multi diamentional aray length is " +clle);  printing 2d mentional array length ?   */
	
		
		System.out.println("row count " +Student_names.length); // it prints all rows 
		System.out.println("column count " +Student_names[0].length); // to print columns in Zero row thats why we kept zero index
		
		
		//Printing all elements of 2d mentional using for loop with I and j symbol
		
		for(int i=0;i<3;i++) {
			
			for (int j=0;j<3;j++)
			{
		System.out.println("ALL NAMES ARE HERE  :   " +Student_names[i][j]);
		    }
		
		                     }
	
	}
	
}

