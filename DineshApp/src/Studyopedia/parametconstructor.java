package Studyopedia;

public class parametconstructor {
  int a,b;
  parametconstructor(int x,int y)
  {
	  a=x;
	  b=y;
  }
	public static void main(String[] args) {
		parametconstructor obj=new parametconstructor(100,200);
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}
