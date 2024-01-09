package Studyopedia;

public class single_Array {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println("the size of an array "+ a.length);
		for(int i=0;i<a.length;i++)    //0=10;T 1=20;T   2=30;T   3=40;T   4=50;T
		{
			
			System.out.println(a[i]);
		}
	


int sum=0;

for(int i=0;i<a.length;i++) {
	sum=sum+a[i];                              //0+10=10;   10+20=30,  30+30=60,  60+40=100,  100+50=150
}
System.out.println("sum of array elements" + sum);
for (int i=a.length-1;i>=0;i--)
{
	System.out.println(a[i]);
}


int max=a[0];
for (int i=1;i<a.length;i++)
{
	if(a[i] < max)
	{
		max=a[i];
	}
}
System.out.println("largest element is : " + max);
	}
}