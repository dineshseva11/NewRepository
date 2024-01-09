package Studyopedia;

public class copyconstructor {
  int a,b;
  copyconstructor()
  {
	  a=10;
	  b=20;
  }
	public static void main(String[] args) {
		copyconstructor obj=new copyconstructor();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		copyconstructor obj1=new copyconstructor();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

}