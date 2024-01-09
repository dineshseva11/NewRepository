package Studyopedia;

public class copyconstructor2 {
  int a,b;
  copyconstructor2(int x,int y)
  {
	  a=x;
	  b=y;
  }
  copyconstructor2()
  {
	  a=1;
	  b=2;
  }
	public static void main(String[] args) {
		copyconstructor2 obj=new copyconstructor2(100,200);
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		copyconstructor2 obj1=new copyconstructor2();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

}
