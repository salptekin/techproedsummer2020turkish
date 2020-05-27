package day26encapsulation;

public class Cat extends Mammal {

	public boolean clean = true;
	
	public static void main(String[] args) {
		//Grand parenttaki, parent'taki ve class'in kendisindeki butun
		//variable ve methodlari kullanin. 
		Cat cat = new Cat();
		System.out.println("Animal Class'dan geldi: " + cat.age);//0
		System.out.println("Animal Class'dan geldi: " + cat.name);//null
		cat.eat();
		cat.move();
		
		System.out.println(cat.dogum);//true
		cat.feed();//Cocuklarini besler
		
		System.out.println(cat.clean);//true
		cat.meow();//Kediler miyavlar

	}
	
	public void meow() {
		System.out.println("Kediler miyavlar");
	}
}
