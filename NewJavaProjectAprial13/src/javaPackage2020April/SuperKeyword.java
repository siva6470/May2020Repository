package javaPackage2020April;


class Parent{
	
	int i=10;
	
	void eat() {
		
		System.out.println(" this is eating parent class");
	}
}

class child extends Parent{
	
	void print() {
		
		System.out.println(" this is child class");
		super.eat();
		System.out.println("base class variable by child class "  +super.i);
	}
	}

public class SuperKeyword {
		public static void main(String[] args) {
		// TODO Auto-generated method stub

			child ch=new child();
			ch.print();
			
			//Parent pr=new Parent();
			// pr.eat();
			
			
	}

}
