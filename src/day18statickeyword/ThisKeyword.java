package day18statickeyword;

public class ThisKeyword {
	
	int x = 12;
	static int y = 13;
	
	ThisKeyword(int x){
		//this kullandigim zaman icinde bulundugum class'daki 
		//instance veya static variable'lara ulasmak istiyorum demektir.
		
		//this() icinde bulundugunuz class'daki parametresiz constructori
		//cagirmak icin kullanilir.
		//this("Ali")icinde bulundugunuz class'daki String parametreli constructori
		//cagirmak icin kullanilir
		
		//this() kullanilacaksa mutlaka ilk satira yazilmalidir. Aksi takdirde
		//Compile Time Error verir.
		this("Ali");
		this.x = x;		
		System.out.println("Parametreli constructor");
	}
	
	ThisKeyword(){
		System.out.println("Parametresiz constructor");
	}
	
	ThisKeyword(String str){
		System.out.println("String parametreli constructor");
	}

	public static void main(String[] args) {
		ThisKeyword obj1 = new ThisKeyword(15);
		System.out.println(obj1.x);//15
	}
}
