import java.io.*;
import java.util.*;
public class readFile {
	private Scanner x;
	//Opens a file
	public void openFile(){
		try{
			x = new Scanner(new File("myFile.txt"));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	//Reads the file
	public void readfile(){
		while(x.hasNext()){
			String a = x.next();
			String b = x.next();
			String c = x.next();
			System.out.printf("First Name: %s\nLast Name: %s\nEmail: %s\n\n", a , b , c);
			
		}
		System.out.println("--------------------------------------------------------------");	
	}
	//Closes the file
	public void closeFile(){
		x.close();
	}
}

