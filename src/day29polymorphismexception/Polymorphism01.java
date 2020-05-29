package day29polymorphismexception;

public class Polymorphism01 {

	public static void main(String[] args) {
		// Polymorphism => Coklu yapi 
		// Overloading ve Overriding ile bir method polymorphism haline getirilir.
		// Polymorphism'i Overloading ile yaparsaniz "Compile Time Polymorphism" denir.
		//                Diger adi static polymorphim'dir.
		// Polymorphism'i Overriding ile yaparsaniz "Run Time Polymorphism" denir.
		//                Diger adi dinamic polymorphism'dir.

	}
	
	public void eat() {
		System.out.println("Ye!");
	}
	//Overloading ile polymorphism
	public void eat(String name) {
		System.out.println(name + "Ye!");
	}
}	

class Yeni extends Polymorphism01{
	
	//Overriding ile polymorphism
	public void eat() {
		System.out.println("Lutfen Ye!");
	}
	
}
