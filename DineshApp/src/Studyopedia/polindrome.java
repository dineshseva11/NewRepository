package Studyopedia;

public class polindrome {

	public static void main(String[] args) {
		int num=555;
		int onum=num;
		int rev=0;
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			rev=(rev*10)+rem;

			num=num/10;
		}
	
  if(onum==rev)
  {
	System.out.println("polindrome");
  }
	else
	{
		System.out.println("not a polindrome");
		}
	}
}

