package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
		// Bir tane String variable olusturun ve bir gun ismini kucuk harflerle deger olarak atayin
		// Eger atadiginiz deger hafta ici gunlerinden biri ise
		// ekrana "hafta ici" yazdirin.
		// Eger atadiginiz deger hafta sonu gunlerinden biri ise
		// ekrana "hafta sonu" yazdirin.
		// Hafta Ici:pazartesi, sali, carsamba, persembe, cuma
		// Hafta Sonu: cumartesi, pazar
		
		String day = "sali";
		
		if(day.equals("pazartesi") || day.equals("sali") || day.equals("carsamba") || day.equals("persembe") || day.equals("cuma")) {
			System.out.println("Hafta ici");
		}
		if(day.equals("cumartesi") || day.equals("pazar")) {
			System.out.println("Hafta sonu");
		}
	}
}
