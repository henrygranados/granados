/*
 * Author: Henry Granados
 */
import java.util.*;
import java.io.*;

public class computer {
 
    public static void main(String args[]){
    	Scanner console = new Scanner(System.in);
       
    	//create a file named myFile.txt
    	createFile object1 = new  createFile();
    	object1.openFile();
    	object1.addRecords();
    	object1.closeFile();
    	
    	//This code reads the File and outputs it on the screen
    	System.out.println("-----------------------------------------------------------------------"); 
    	System.out.println("This is the list of customers being read from a file called myFile.txt ");
    	System.out.println("-----------------------------------------------------------------------");
    	readFile r = new readFile();
    	r.openFile();
    	r.readfile();
    	r.closeFile();
 
        
    	LinkedList<customers> list = new LinkedList<customers>();
    	try
    	{
    	Scanner file = new Scanner(new File("myFile.txt"));
    	while(file.hasNext())
    	{
    		String name = file.next();
    		String lname = file.next();
    		String email = file.next();
    		list.add(new customers(name,lname, email));
    	}
    	}
    	catch (Exception e) {
			// TODO: handle exception
		}
        Collections.sort(list,new Mycustomers());
        System.out.println("This is the list of customers sorted by their last names: ");
        System.out.println("--------------------------------------------------------------");
        System.out.println();
        for(customers cu:list){
            System.out.println(cu);
        }
        //This code will search an sspecific customer
        System.out.println("\nPLEASE  ENTER a first name to search: ");
        String fname = console.nextLine();
        System.out.println("PLEASE ENTER a last name to search: ");
        String lname = console.nextLine();
        boolean found = false;
        for(customers cu:list){
        	if(cu.getLastName().equals(lname) && cu.getName().equals(fname))
        	{
        		System.out.println("\nThe customer you are looking for was found:\n"+cu);
        		found = true;
        	}
        }
        if(!found)
        	
        System.out.println(fname+" "+lname+" is not found");
    }
}
 //This code sorts the file by last name
class Mycustomers implements Comparator<customers>{
 
    public int compare(customers e1, customers e2) {
    	return e1.getLastName().compareTo(e2.getLastName()); 
    }
}
 
class customers{
     
    private String name;
    private String lastName;
    private String email;
     
    public customers(String n, String l , String e){
        this.name = n;
        this.lastName = l;
        this.email = e;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail(){
        return email;	
    }
    public void setEmail(String email){
    	this.email = email;
    }
    public String toString(){
        return "First Name: "+this.name+"\nLast Name: "+this.lastName + "\nEmail: "+this.email+"\n";
    }
}

    	
    	
    	
        
