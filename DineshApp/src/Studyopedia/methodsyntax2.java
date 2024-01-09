package Studyopedia;

public class methodsyntax2 {
	                              //method without returntype and with parameters
	                              //finding sum of 2 integers

	int a,b;                      //instance type
	void sum(int x,int y)          //instance variables x and y
	{
	a=x;                          //a=100
	b=y;                          //b=200
	int total=a+b;                //300
	
	System.out.println(total);
	
	}
	public static void main (String[] args) {
		
		methodsyntax2 obj1 =new methodsyntax2();
		obj1.sum(100,200);             //method invoke/call values
		
	
	
	}
}
