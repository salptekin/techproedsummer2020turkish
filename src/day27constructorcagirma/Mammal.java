package day27constructorcagirma;

public class Mammal extends Animal {

	public boolean dogum = true;
		
	public static void main(String[] args) {
		
		Mammal mammal = new Mammal();
		mammal.feed();

	}
	
	public void feed() {
		System.out.println("Cocuklarini besler");
	}
	
	Mammal(){
		super();//Parent'daki parametresiz constructor'i cagir
		        //super() keyword'unu kullanmasaniz da olur ama bazilari kullanir sasirmayin
		        //super() kullanilacaksa mutlaka ilk satirda olmalidir
		        //super() ve this() ayni constructor'in icinde ayni anda kullanilamaz.
		        //Cunku; ikisinin de ilk satirda olma zorunlulugu var.
		System.out.println("Mammal parametresiz constructor");
		
	}
	
	Mammal(int age){
		super();
		System.out.println("Mammal parametreli constructor");
	}

}
