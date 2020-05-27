package day27constructorcagirma;

public class Animal {

	public int age;
	protected String name;
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.eat();

	}
	
	public void move() {
		System.out.println("Hareket edebilir");
	}
	
	public void eat() {
		System.out.println("Yemek yer");
	}
	
	Animal(){
		System.out.println("Animal parametresiz constructor");
	}

}
