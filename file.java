import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;


public class file {
	
	
public static void main( String args[]){	


	
Scanner s1= new Scanner(System.in);
System.out.print(" Enter Your Full Name \n");  
String filename= s1.nextLine();          
filename= filename+".txt";
	try{
		
		
	File fileobj= new File(filename);
	
	if (fileobj.createNewFile())
System.out.println("File created");	
	else
		System.out.println("File Already Exsist");
	

}

	catch(Exception e)
	{} 
	
} 
} 