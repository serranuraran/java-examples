package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);

		System.out.println("Eleman say�s� : " + mesaj.length());
		System.out.println("5.eleman : " + mesaj.charAt(4)); // 5.karakterini bulur
		System.out.println(mesaj.concat(" Ya�as�n!")); // concat=birle�tirmek
		// System.out.println(mesaj);
		System.out.println(mesaj.startsWith("b")); // b ile ba�l�yor mu(java k���k b�y�k harf duyarl� o y�zden
		System.out.println(mesaj.endsWith(".")); // nokta ile bitiyor mu
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // 0 dan 4 e kadar elemanlar� karakterlere ata, 5i dahil etmez
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a')); // belirtti�imiz karakter mesaj�n i�inde ka��nc� indexte, ba�ka a lar da
												// var ama ilk buldu�umuzu verir ve bitirir
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a")); // aramaya en sa�dan ba�l�yor

		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2)); // bir metnin i�erisinden par�a almak -2.indexinden itibaren par�alad�
												// mesela
		System.out.println(mesaj.substring(2, 4)); // 2den 4 e kadar 4 dahil de�il

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase()); // k���k harfe �evirir
		System.out.println(mesaj.toUpperCase()); // b�y�k harfe �evirir

		// String mesaj=" Bug�n hava �ok g�zel. ";
		System.out.println(mesaj.trim()); // ba��mdaki sonundaki bo�luklar� atar
	}
}

