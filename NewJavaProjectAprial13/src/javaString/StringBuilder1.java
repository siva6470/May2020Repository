package javaString;

public class StringBuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder("Hello ");  
		
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);//prints HJavaello  
		
		sb.append("siva");
		System.out.println(sb);////prints HJavaellosiva
		
		sb.reverse();  
		System.out.println(sb);//prints olleH

	}

}
