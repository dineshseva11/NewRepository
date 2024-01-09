package Studyopedia;

public class methodsyntax4 {
	               //with return type and with parameters
	int a,b;
	int sum (int x,int y)
	{
		a=x;
		b=y;
		int total=a+b;
		return total;
	}

	public static void main(String[] args) {
		methodsyntax4 obj=new methodsyntax4();
		System.out.println(obj.sum(100,200));

	}

}
