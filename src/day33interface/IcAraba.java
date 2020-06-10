package day33interface;

public interface IcAraba {
	
	int price = 2000;
	boolean old = true;
	
	
	public abstract void direksiyon();
	public void koltuk();
	abstract void klima();
	
	//default keyword'unu kullanirsak methoda body eklemek zorundayiz.
	//Aksi takdirde Compile Time Error aliriz.
	public default void doseme() {
		System.out.println("Interface'de default keyword ile doseme yaptim");
	}
	
	//static keyword'unu kullanirsak methoda body eklemek zorundayiz.
	//Aksi takdirde Compile Time Error aliriz.
	public static void isitma() {
		System.out.println("Interface'de static keyword ile isitma yaptim");
	}
	
	
}
