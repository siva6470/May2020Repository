package javaPackage2020April;

public class StaticKeyword {
	
	//static keyword we use for memory management and need not create any object we can share entire class
	int n;
	String s;
	static String rollno="$kumar";
	
	StaticKeyword(int s1,String w)
	{
		n=s1;
		s=w;
		System.out.println(n+" "+s+" " +rollno);

	}
	
	void display()
	{
		
		System.out.println(n+" "+s+" "+rollno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticKeyword st=new StaticKeyword(11,"Siva");
		st.display();
		
	}

}
