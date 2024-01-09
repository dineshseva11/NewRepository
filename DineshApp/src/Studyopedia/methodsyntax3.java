package Studyopedia;

public class methodsyntax3 {
	           // method with returntype and no parameters
	int a,b;
	int sum()
	{
       a=10;b=20;
  int total=a+b;
  return total;
	}
	public static void main(String[] args) {
		methodsyntax3 obj=new methodsyntax3();
		int res=obj.sum();
		System.out.println(res);
		System.out.println(obj.sum());

	}

}
