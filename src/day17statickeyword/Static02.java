package day17statickeyword;

public class Static02 {

	
	//buyume() methodu bu class'da degil Constructors01 class'inda. 
	//O yuzden Java kullanmama musaade etmiyor.
	//Eger siz baska bir class'daki methodu kullanmak istiyorsaniz o class'dan bir tane object
	//olusturup o object sayesinde istediginiz methodu kullanabilirsiniz.
	
	public static void main(String[] args) {
		
		Static01 obj1 = new Static01();
		
		//buyume() methodu static oldugundan Java object kullanarak buyume() methodunu
		//cagirmamizi istemez ve kodun altini sari renkle cizer.
		obj1.buyume(33);
		Static01.buyume(45);//46
		//isimDegistir() methodu static oldugundan Java object kullanarak isimDegistir() methodunu
		//cagirmamizi istemez ve kodun altini sari renkle cizer.
		obj1.isimDegistir("Kemal Can");
		Static01.isimDegistir("Merhaba Naci");
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
		
		
		//Bir variable veya method static olarak olusturulmussa, o variable veya methods
		//object olusturmadan sadece class ismini kullanarak ulasabilirsiniz.
		System.out.println(Static03.ad);//Ali Can
		System.out.println(Static03.kilo);//33
		//Static03.artirma(45);//46
		Static03.degistirme("Merhaba Naci");//Merhaba Naci
	}

}
