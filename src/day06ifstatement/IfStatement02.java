package day06ifstatement;

public class IfStatement02 {

	public static void main(String[] args) {
		// Bir integer variable olusturun deger atayin
		// Deger cift sayi ise ekrana "cift" yazdirin 
		// Deger tek sayi ise ekrana "tek" yazdirin
		
		int num = 7898756; 
		
		if(num%2==0) {
			System.out.println("Cift");
		}
		
		if(num%2!=0) {
			System.out.println("Tek");
		}
		
	}

}
