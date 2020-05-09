package day12scopewhileloop;

public class ScopeKurallari {
	
	int num;//Class variable veya Instance variable
	
	public static void main(String[] args) {
		// Scope kapsam demektir. Olusturdugunuz bir variable'i nerelerde kullanabileceginizi
		// gosterir.
	}
	
	public void toplama() {
		int num1=12;
		System.out.println("Toplama");
	}
	
	public void carpma(int num, String str, char ch) {
		int num2;
		num2 =3;
		System.out.println("Carpma");
	}

}

//1. Kural: Class'in icinde, method'larin disinda olan variable'lari butun methodlar 
//istedikleri zaman istedikleri kadar kullanabilirler.
//Bu variable'lara "Class Variable" veya "Instance Variable" denir.
//Class variable'lara deger atamasi yapmazsak Java onlara default(Java kafasina gore deger verir) 
//degerler verir.Java tum sayilar icin default olarak 0 degerini verir 

//2. Kural: Bir method'un body'si icinde olusturulan variable'lar sadece o methodun
//icinde kullanilabilir. O method'un disindaki methodlar o variable'i kullanamazlar.
//Methodun icinde olusturulan bu variable'lara "Local Variable" denir.
//Body icinde olusturulan variable'lara deger atamak ZORUNDAYIZ. Java onlara default value vermez.

//3. Kural: Method'larin parantezleri icinde olusturulan variable'lar local variable'lar 
//gibi sadece o methodlarin body leri icinde kullanilabilir. Bu variable'lara da local variable
//denir.Parantez icinde olusturulan variable'lara ise deger atamasi yapmayiniz.

//4. Kural:Bir variable'i kullanmaya baslamadan once tanimlamaliyiz. 
// Once num = num + 2 sonra int num = 12; diyemeyiz.
// Once int num = 12; sonra num = num + 2 demeliyiz.