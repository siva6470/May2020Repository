package javaPackage2020April;

public class MultiDiamentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arry=new int[3][3];
		arry[0][0]=10;
		arry[0][1]=20;
		arry[0][2]=20;
		arry[1][0]=40;
		arry[1][1]=40;
		arry[1][2]=40;
		arry[2][0]=40;
	arry[2][1]=40;
	arry[2][2]=40;
	
	int length=arry.length;arry[1][0]=40;
	System.out.println(length);
	
	for(int[] ary1:arry) {
		for(int ary2:ary1) {
			
		System.out.println(ary2);
	}
	}	
	}
}
