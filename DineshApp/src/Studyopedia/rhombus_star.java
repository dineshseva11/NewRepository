package Studyopedia;

public class rhombus_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {

				System.out.print("* ");
			}

			System.out.println();
		}
		for (int i =3 ; i > 0; i--) {     // j=1,
			for (int j = 1; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}




	}

