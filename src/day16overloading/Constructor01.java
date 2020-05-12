package day16overloading;

public class Constructor01 {

	int price = 20000;
	int year = 2020;
	String make = "Honda";
	String type = "Civic";

	public static void main(String[] args) {
		//Class olusturdugumuzda Java classla beraber bir constructor olusturur, biz onu 
		//herhangi bir kod yazmadan direkt kullanabiliriz. Bu constructor'a "default constructor" denir.
		//Default constructor'larda parametre olmaz.
		//Default constructor class olusturuldugu anda Java tarafindan olusturulur.
		//Biz kendimiz bir constructor olusturdugumuzda Java default constructor'i imha eder.
		
	   Constructor01 hondaAraba = new Constructor01(); //Bir tane object uretildi
 	
	   System.out.println("Price: " + hondaAraba.price); //20000
	   System.out.println("Year: " + hondaAraba.year);//2020
	   System.out.println("Make: " + hondaAraba.make);//Honda
	   System.out.println("Type: " + hondaAraba.type);//Civic
	
	}
}
