package methods;

public class Main {

	public static void main(String[] args) {

		sayiBulmaca();
		mesajVer("");
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,6,7,0,8};
		int aranacakSayi= 6;
		boolean varMi = false;
		
		for(int sayi: sayilar) {
			if(sayi==aranacakSayi) {
				varMi= true;
				break;
			}
		}
		
		if(varMi) {
			mesajVer(aranacakSayi+ ": Sayı mevcut");
		}
		else {
			mesajVer(aranacakSayi+ ": Sayı mevcut değildir.");
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}
}
