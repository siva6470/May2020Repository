package javaString;

public class StringTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Siva";
		int a=10;
		String str1="siva";
		String str2="Siva"+"siva";
		
		System.out.println(str.trim());
		System.out.println(str.toCharArray());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(0)); // space takes zero index position
		System.out.println(str.valueOf(a)); //10
		System.out.println(str.replace('a', '@'));
		System.out.println(str.equalsIgnoreCase(str1)); //true
		System.out.println(" compare to "+str.compareTo(str1)); // return type 0 ,  -1,  1
		System.out.println("concatination  of str and str1 "+str2);
		

	}

}
