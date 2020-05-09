package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		byte by1 = 101;
		int sayi1 = by1;//Kucuk data tipini buyuk data tipini cevirmek icin extra bir kod yazmaya 
		              //gerek yok Java bunu otomatik olarak yapar. (Auto Widening)
		
		System.out.println(sayi1);//101
		
		int sayi2 = 53;
		byte by2 = (byte)sayi2;//Buyuk data tipini kucuk data tipine cevirmek Java tarafindan yapilmaz.
		                       //Ornekteki gibi sag tarafa donusturmek istedigimiz data tipini 
		                       //parantez icinde yazmaliyiz.
		System.out.println(by2);//53
		
		double sayi3 = 23.9;
		int by3 = (int)sayi3;
		System.out.println(by3);//23
		
		float sayi4 = -23.9f;
		short by4 = (short)sayi4;
		System.out.println(by4);//-23 
		
		double sayi5 = 4.8;
		double sayi6 = 1.4;
		
		double sonuc1 = sayi5 / sayi6;
		System.out.println(sonuc1); // 3.428571428571429
		
		int sonuc2 = (int)(sayi5 / sayi6);
		System.out.println(sonuc2); //3
		
		int sayi7 = 5;
		int sayi8 = 2;
		
		int sonuc3 = sayi7 / sayi8;
		System.out.println(sonuc3);//Normalde 5/3=1.6666666... ama data type'i int yaparsaniz
		                                    // sadece tam kismi gorursunuz ==> 1
		
		int sayi9 = 255;
		byte by5 = (byte)sayi9;
		System.out.println(by5);//Normalde byte'ta (-128 ...-1, 0, 1 ...127) 256 sayi var, 255 bir tane eksik
		                        //bu yuzden -1 ekrana yazilir
		                        //255 i 256 ya boler kalani yazar
	}
}
