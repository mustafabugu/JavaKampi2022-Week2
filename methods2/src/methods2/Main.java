package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok sıcak.";
		String yeniMesaj = mesaj.substring(2, 8);
		System.out.println(yeniMesaj);
		System.out.println(topla(5, 7));
		ekle();
		sil();
		guncelle();
		int toplam = topla2(2, 3, 4, 5, 6); // boş arrayde gönderebiliriz.
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi.");
	}

	public static void sil() {
		System.out.println("Silindi.");
	}

	public static void guncelle() {
		System.out.println("Güncellendi.");
	}

	public static int topla(int a, int b) {
		return a + b;
	}

	public static int topla2(int... sayilar) { // int den sonra ...(3 nokta'da kızmaz.)
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
}
