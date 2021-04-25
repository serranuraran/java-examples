package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman sayýsý : " + mesaj.length());
		System.out.println("5.eleman : " + mesaj.charAt(4)); // 5.karakterini bulur
		System.out.println(mesaj.concat(" Yaþasýn!")); // concat=birleþtirmek
		// System.out.println(mesaj);
		System.out.println(mesaj.startsWith("b")); // b ile baþlýyor mu(java küçük büyük harf duyarlý o yüzden
		System.out.println(mesaj.endsWith(".")); // nokta ile bitiyor mu
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // 0 dan 4 e kadar elemanlarý karakterlere ata, 5i dahil etmez
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a')); // belirttiðimiz karakter mesajýn içinde kaçýncý indexte, baþka a lar da
												// var ama ilk bulduðumuzu verir ve bitirir
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a")); // aramaya en saðdan baþlýyor

		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2)); // bir metnin içerisinden parça almak -2.indexinden itibaren parçaladý
												// mesela
		System.out.println(mesaj.substring(2, 4)); // 2den 4 e kadar 4 dahil deðil

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase()); // küçük harfe çevirir
		System.out.println(mesaj.toUpperCase()); // büyük harfe çevirir

		// String mesaj=" Bugün hava çok güzel. ";
		System.out.println(mesaj.trim()); // baþýmdaki sonundaki boþluklarý atar
	}
}

