package javaString;

public class StringBuffer1 { // mutable OR midifyble // it can be changed  and it is thread safe

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="siva;";
		StringBuffer str1=new	StringBuffer("hello");
str1.append(str);
System.out.println(str1);
str1.reverse();
System.out.println(str1);

	
	}

    }
