package day02wrapperclasses;

public class Wrapper01 {

	public static void main(String[] args) {
		
		//int data tipinin maximum ve minimum degerlerini bulup ekrana yazdiriniz
		// int in wrapper class'i Integer
		System.out.println(Integer.MAX_VALUE);//Bir class'in icindeki metodlara ulasmak icin
		                                      // class isminden sonra nokta koy, listeden secim yap
		System.out.println(Integer.MIN_VALUE);
		
		//long data tipinin maximum ve minimum degerlerini bulup ekrana yazdiriniz
		//Wrapper ==> Cevreleyen, kusatan. Bayram sekerinin kagidi gibi
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		//Odev: Tum primitivelerin max ve min degerlerini Wrapper Classlarini kullanarak ekrana yazdiriniz
	}
}
