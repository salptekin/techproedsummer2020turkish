package day05operators;

public class Increment02 {

	public static void main(String[] args) {
		// int data type'inda iki tane variable olusturun.
		// Birinicyi 3, ikinciyi 7 artirin.
		// Kisa yol kullanin.
		
		int sayi1 = 12;		
		sayi1+=3; // increment ==> II> Yol kisa yol 
		          // + ile = arasina bosluk birakmayin
		System.out.println(sayi1);//15
		
		int sayi2 = 20;
		sayi2 = sayi2 + 7;//20+7=27
		sayi2+=7;//27+7=34
		System.out.println(sayi2);//34

	}

}
