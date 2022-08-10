package garbage_collection;

import java.util.Scanner;

class Gobal // This class to store a global variable ......
{
	int x=10;
	int y = 20;
	void display()  // display method calls from the another class...
	{
		System.out.println("X : "+x+" Y : "+y); // printing these variables here
	}
	
}

public class Garbage_Class 	// main class 
{  
	static Scanner sc = new Scanner(System.in);
	static int a;//varaible declared......
	public static void main(String[] args)  // main method
	{
		Garbage_Class ob = new Garbage_Class(); // creating object of our class
		ob = null;    	// passing variable null
		System.gc();  	// implicitly calling finalize method
		fun();  	// calling fun method
		fun1();  	// calling fun1 method
		boxing(); 	// calling boxing method
		unboxing();	// calling unboxing method
		 
		
	}
	
	static void fun() // 
	{
		Gobal g = new Gobal(); // creating object of demo class
		g.display();         // calling display method
	}
	
	static void fun1()
	{
		Gobal g = new Gobal();  // creating same reference object here that means it is use less here because one object is already created by same reference
		g.display();	      // calling by same object display method
	}
	public static void boxing()   // boxing method that converts the data type into a Wrapper class object.
	{
		System.out.println("\n        Boxing Process"); 
		System.out.println("Enter the value of a : ");  // taking a no from user
		 a = sc.nextInt();                      // store that no into a int
		Integer ob = new Integer(a);		   // then convert that no into a reference object	
		ob = a;
		System.out.println("The value after boxing is : "+ob); // printing the object value
	}
	
	public static void unboxing()  // unboxing method that converts the Wrapper class object into a data tyoe
	{
		System.out.println("\n       UnBoxing Process");
		System.out.println("Enter the value of a : ");    // taking a no from user
		Integer ob = new Integer(sc.nextInt());	     // store that no into a wrapper class object
		 a = ob;				     // convert that object value into a data type
		a = ob;
		System.out.println("The value after unboxing is : "+a);	// printing that variable
	}
	public  void finalize()    // finalize method that calls by the System.gc method or by the itself also throught the use of class object
	{
		System.out.println("\nThis is Finalize Method is Overriden");  
	}
	
	
}
