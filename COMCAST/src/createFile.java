import java.io.*;
import java.lang.*;
import java.util.*;
public class createFile {
	private Formatter y;
	
	public void  openFile(){
		try{
			y = new Formatter("myFile.txt");
		}
		catch(Exception e){
			System.out.println("You have an error");
		}
	}
	public void addRecords(){
		y.format("%s %s %s\n", "Henry", "Granados", "henrygranados03@gmail.com");
		y.format("%S %s %s\n", "Mary","McDowell", "michael09@hotmail.com");
		y.format("%s %s %s","Peter","Lewis","Steven_10@gmail.com");
	}
	public void closeFile(){
		y.close();
	}

}
