package iinputAndOutputOperations;

import java.io.FileOutputStream;

public class FileOutputwithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try{    
             FileOutputStream fout=new FileOutputStream("C:\\Users\\Admin\\Desktop\\selenium Tutoril\\java .txt");    
            fout.write(66);    
             fout.close();    
             System.out.println("success...");    
            }
		 catch(Exception e)
		 {System.out.println(e);}    
		
		
		

	}

}
