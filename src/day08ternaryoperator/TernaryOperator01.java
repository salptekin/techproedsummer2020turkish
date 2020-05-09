package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi aliniz
		// Sayi pozitif veya 0 ise ekrana "Pozitif veya 0" yaziniz.
		// Sayi negatif ise ekrana "Negatif" yaziniz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz");
		double num = scan.nextDouble();
		
		if(num>=0) {
			System.out.println("Pozitif veya 0");
		}else{
			System.out.println("Negatif");
		}
		
		                                         //Ternary Operator (if Else)
		
		//               Condition Soru Isareti  Condition Dogru Ise    Iki nokta ust uste    Condition Yanlis ise
		String sonuc =    num>=0       ?         "Pozitif veya 0"             :                    "Negatif";
		System.out.println(sonuc);
		
		scan.close();
	}
}
