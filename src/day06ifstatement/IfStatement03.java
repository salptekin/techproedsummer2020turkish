package day06ifstatement;

public class IfStatement03 {

	public static void main(String[] args) {
		// Bir char variable olusturun ve bir buyuk harf deger atayin
		// Eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi ise o gunleri yazdirin
		// Eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi degil ise 
		// ekrana "Boyle bir gun yok" yazdirin.
		// Pazar, Pazartesi, Persembe <-> Sali <-> Carsamba, Cuma, Cumartesi
		
		char gun = 'S';
		
		if(gun=='P') {
			System.out.println("Pazar, Pazartesi, Persembe");
		}
		
		if(gun=='S') {
			System.out.println("Sali");
		}
		
		if(gun=='C') {
			System.out.println("Carsamba, Cuma, Cumartesi");
		}
		// "P" olmamak VEYA "C" olmamak VEYA "S" olmamak ==> VEYA islemi icin || ==> | -> Pipe denir
		// VEYA isleminden True sonucu alabilmek bir tanesinin True olmasi yeterlidir
		// True||True = True <-> True||False = True <-> False||False = False
		// True=1, False=0 ==> VEYA islemi toplamaya benzer
				
		// "P" olmamak VE "C" olmamak VE "S" olmamak ==> VE islemi icin &&
		// VE isleminden True sonucu alabilmek icin tum condition'lar true olmalidir
		// True && True = True <-> True && False = False <-> False && False = False
		// True=1, False=0 ==> VE islemi carpmaya benzer
		
		if(gun!='P' && gun!='C' && gun!='S') {
			System.out.println("Boyle bir gun yok");
		}
	}
}
