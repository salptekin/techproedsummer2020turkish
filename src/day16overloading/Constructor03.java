package day16overloading;

public class Constructor03 {
	
	String isim = "Ali Can";
	int yas = 33;
	int kilo = 85;
	String meslek = "Automation Tester";
	boolean emekli = false;
	
    Constructor03(){
		
	}
		
	Constructor03(String isim, int yas, boolean emekli){
		this.isim = isim;
		this.yas = yas;
		this.emekli = emekli; 
	}
	
	Constructor03(String isim){
		this.isim = isim;
	}

	public static void main(String[] args) {
		
		Constructor03 insan01 = new Constructor03();
		System.out.println(insan01.isim);
		
		Constructor03 insan02 = new Constructor03("Ayhan Yildiz", 56, true);
		System.out.println(insan02.isim);
		System.out.println(insan02.yas);
		System.out.println(insan02.emekli);
		System.out.println(insan02.meslek);
		System.out.println(insan02.kilo);
		
		Constructor03 insan03 = new Constructor03("Ayse Yildiz");
		System.out.println(insan03.isim);
		System.out.println(insan03.kilo);			
	}
}
