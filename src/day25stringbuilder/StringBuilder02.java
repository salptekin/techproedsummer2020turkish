package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		// substring() methodu atama yapmadan String'i degistirmez
		StringBuilder str1 = new StringBuilder("animals");
		
		//str1 = str1.substring(3); hata verir. 
		//Cunku substring() methodu String Class'indan 
		//gelir ve bir String return eder.Halbuki str1 String degil StringBuilder dir.
		//Java data tipleri uyusmadigindan dolayi atamayi kabul etmez.
		//Bu hatadan kurtulmak icin iki yol var
		// 1. Yol: String class'indan yeni bir String uretip atama yapiniz
		String str2 = str1.substring(3);
		System.out.println(str2);
		//2. Yol: str1.substring(3) ifadesini direkt System.out.println() icine yazin
		System.out.println(str1.substring(3));
		
		System.out.println(str1.substring(1, 4));//nim
		
		
		//indexOf() methodu belli bir character'in index'ini return eder.
		System.out.println(str1.indexOf("m"));//3
		
		//length() methodu String Class'indan gelir ve String'in uzunlugunu return eder.
		System.out.println(str1.length());//7
		
		//charAt() methodu belli bir index'teki character'i return eder
		System.out.println(str1.charAt(5));// animals da index i 5 olan l harfidir. l return eder.
		
		//insert() methodu istenen index'e istenen characteri eklemeye yarar.
		//insert() methodu append() gibi StringBuilder'i direkt degistirir
		str1.insert(0, "X");
		System.out.println(str1);//Xanimals
		
		//delete() istenen index araligindaki characterleri siler
		str1.delete(0, 1);
		System.out.println(str1);//animals
		
		//deleteCharAt(); istenen indexteki characteri siler
		str1.deleteCharAt(6);//s harfini silmeli
		System.out.println(str1);//animal
		
		//reverse() methodu String'i tersten yazdirir
		str1.reverse();
		System.out.println(str1);//lamina
		
		//toString() methodu StringBuilder'i String'e cevirmek icin kullanilir
		str1.toString();
		System.out.println(str1);//str1 artik StringBuilder degil String'dir
		
		//StringBuilder Java'nin 5. versiyonunda olusturuldu. StringBuffer'lar 
		//StringBuilder'larin eski versiyonudur.Stringbuilder'lar daha hizli calisir.
		//Bu yuzden StringBuilder kullanmayi tercih edin.
	}
}
