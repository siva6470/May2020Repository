/**
 * 
 */
package javaPackage2020April;

/**
 * @author Admin
 *
 */
public interface Interface 
{ // opening block of interface
	     void run();
       
	     
	     class Demo2 implements Interface
           {
      @Override
	public void run() {
		// TODO Auto-generated method stub
			System.out.println(" here implementing interface method");
             }   
        }

       //class Demo3{
     public static void main(String args[]) {
	Interface dm1=new Demo2(); // here we have to instantiate object for interface and main method comes under interface block
	dm1.run();
	 
             }
} // interface block closing here