package Studyopedia;

public class methodsyntax12 {
	//method without return type and without parameters
	//finding sum of 2 integers
	
	     int a,b;      //instance variable declaration
	     void sum() //instance method
	{
		 a=10; b=20;
		 int total=a+b;
		 System.out.println(total);		
	}
	
	     static void display()     //static method
	{                  
	
	     System.out.println("this is display method");
	}

	public static void main(String[] args) {
		Methodsyntax1 obj1=new Methodsyntax1();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		obj1.sum();
		Methodsyntax1.display();
		
	}

}

