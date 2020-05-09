package day01variables;

public class Variable01 {

	public static void main(String[] args) {
		
		int maas = 3000;		
		char harf = 'S'; //char'lara deger atamasi yaparken mutlaka tek tirnak kullan
		
		System.out.println(maas);// 3000
		System.out.println(harf); // S
		
		int sayi = 123;
		System.out.println(sayi);//123
		
		boolean isOld = true; //boolean'lar icin sadece true veya false degerlerini kullanabilirsiniz
		System.out.println(isOld);//true
		
		boolean isNew = false;
		System.out.println(isNew);//false
		
		byte derinlik = -123; //-128 den 127 e kadar => 8 bit
		System.out.println(derinlik);//-123
		
		short sirnakNufus = 28000;
		System.out.println(sirnakNufus);//28000
		
		long hucreSayisi = 1234567891122344489L;//Integer sinirini asan long variable'larda 
		                                        //en sona "l" veya "L" koymaliyiz.
		System.out.println(hucreSayisi);//1234567
		
		double pi = 3.1456820488484982;//Java butun ondalik kesirleri otomatik olarak 
		                               // double kabul eder.
		                               // Default value = 0.0
		System.out.println(pi);
		
		float para = 5.25f;//Eger bir ondalik kesri float yapmak isterseniz sonuna 
		                   // "f" veya "F" koyunuz.
		                   // Default value = 0.0f
		System.out.println(para);
		
		String ogrenciIsmi = "Ali Can";
		System.out.println(ogrenciIsmi);// Ali Can
	
	}
}
