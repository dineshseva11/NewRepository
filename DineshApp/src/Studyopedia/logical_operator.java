package Studyopedia;

public class logical_operator {

	public static void main(String[] args) {
		// logical AND ,OR,NOT[ &&, ||, !|| ]
		
		
       int a=10;
       
       System.out.println(a<5 && a>11);        // T     F    - F

       System.out.println(a>5 || a<11);        // T     T    - T

       System.out.println(a<5 || a>=10);       //  T    T    - T

       System.out.println(!(a<5 && a<=10));    // T     T    -T

       
	
	}
	

}
