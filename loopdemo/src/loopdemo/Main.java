package loopdemo;

public class Main {

	public static void main(String[] args) {
 		//While
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}

		System.out.println("While d�ng�s� bitti");
		
		//Do-While
		int j=1;
		do {
			System.out.println(j);
			j += 2;
		}while (j < 10);
		System.out.println("Do-While d�ng�s� bitti");
	}
}
