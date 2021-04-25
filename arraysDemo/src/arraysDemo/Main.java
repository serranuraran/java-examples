package arraysDemo;

public class Main {

	public static void main(String[] args) {

		String[] ogrenciler = new String[3];
		ogrenciler[0]="Serra";
		ogrenciler[1]="Berat";
		ogrenciler[2]="Furkan";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("---------------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
