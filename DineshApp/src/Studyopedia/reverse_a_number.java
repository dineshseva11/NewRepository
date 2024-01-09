package Studyopedia;

public class reverse_a_number {

	public static void main(String[] args) {
		int num=123;
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			System.out.print(rem);
			num=num/10;
		}
	}

}
