package day17statickeyword;

public class Static01 {
	
	String isim = "Ali Can";
	int yas = 33;
    //Method ile main method ayni class'da ise methodu sadece ismini yazarak kullanabilirsiniz.
	public static void main(String[] args) {
//         buyume(33);
//         isimDegistir("Ayse Han");
         Static01 obj1 = new Static01();
         System.out.println(obj1.isim);
         System.out.println(obj1.yas);
	}
	
	public static void buyume(int yas) {
		yas++;
		System.out.println(yas);
	}
	
	public static void isimDegistir(String isim) {
		System.out.println(isim);
	}

}
