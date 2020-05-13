package javaPackage2020April;

class Student{
	
	String name;
	String course;

 void setName(String name) {
	 this.name=name;
         }
 
 void setCourse(String course) {
	 this.course=course;
	 
             }
	
  String getName() {
	 return name;
 } 
  
  String getCourse(){
	  return course;
  }
 
} // closing class student 

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.setName("siva");
		st.setCourse("java");
		System.out.println(st.getCourse());
		System.out.println(st.getName());
		
		
	}

}
