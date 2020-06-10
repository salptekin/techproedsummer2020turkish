package day31abstraction;

public abstract class Abstraction01 {

	public static void main(String[] args) {
		// Abstract class'lardan obje uretilemez.
		// Constractor'lari yoktur.
		// Abstract class'lar concrete(body'li) ve abstract(body'siz) methodlar
		// icerebilir.
		// Abstract class'larin hem concrete class hem de abstract class olan
		// child'lari olabilir.
		// ==> Abstract class'in child'i concrete class ise Abstract class'daki
		// abstract method'lari mutlaka override etmeli ve onlara body eklemelidir.
		//     ==> Bunun faydasi sudur; Child class'larda mecburen olmasi gereken 
		//         methodlari bu sekilde belirlemis oluruz.
		// Abstract class'in child'i abstract class ise Abstract class'daki
		// herhangi bir seyi override etmek zorunda degildir.
	}
	
	public void concreteMethod() {
		System.out.println("Ben concrete'im");
	}
	
	public abstract void abstractMethod();

}
