package collectonsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List1 {

	public static void main(String args[]) {
		
		ArrayList<String> st=new ArrayList<>();
		st.add("siva");
		st.add("kumar");
		st.add("siva1");
	/*	ListIterator<String> it=st.listIterator(st.size());
	while(it.hasPrevious()){
		
		System.out.println(it.previous());//reverse order
		
		
	}*/
	
	Iterator<String> it1=st.iterator();
	while(it1.hasNext()){
		
		System.out.println(it1.next());// order
		
		
	}
	
	
	}
	
}
