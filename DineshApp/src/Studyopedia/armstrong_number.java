package Studyopedia;

public class armstrong_number {

	public static void main(String[] args) {
		int num=153;
		int onum=num;
		int arm=0;
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			arm=arm+(rem*rem*rem);

			num=num/10;
		}
	
  if(onum==arm)
  {
	System.out.println("armstrong");
  }
	else
	{
		System.out.println("not a armstrong");
		}
	
	}

}
