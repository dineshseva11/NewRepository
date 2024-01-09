package Studyopedia;

public class fibanocci {

	public static void main(String[] args) {
	    int a=0, b=1;
	    System.out.println(a);
	    System.out.println(b);
	    for(int i=1;i<=10;i++)
	    {
	    	int res=a+b;
	    	System.out.println(res);
	    	a=b;
	    	b=res;
	    }
	}

}
