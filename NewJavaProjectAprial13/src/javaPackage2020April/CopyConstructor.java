package javaPackage2020April;

public class CopyConstructor {
	int n1;
	String q1;
	
	CopyConstructor(int n,String q) {
		n1=n;
		q1=q;
		
		System.out.println(" 1 one --> " +n + " " +q);
	}
	
	CopyConstructor(CopyConstructor c){
		 n1=c.n1;
		 q1=c.q1;
		
		System.out.println("copy construcotr 2nd one--> "+n1+" "+q1);
	}
	 
	void display() {
		
		System.out.println("3rd one--> "+n1+" "+q1);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyConstructor cc=new CopyConstructor(20,"Siva1");
		CopyConstructor ct=new CopyConstructor(cc);
		cc.display();
		ct.display();
		
		
	}

}
