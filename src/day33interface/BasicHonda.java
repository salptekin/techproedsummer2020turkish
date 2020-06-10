package day33interface;

public class BasicHonda extends Araba implements IcAraba, DisAraba {
 
	//Class ==> Interface : implements
	//Class ==> Class : extends
	//Interface ==> Interface : extends
	
	public static void main(String[] args) {
		BasicHonda basicHonda = new BasicHonda();
		basicHonda.diesel();
		basicHonda.direksiyon();
		basicHonda.kapi();
		basicHonda.klima();
		basicHonda.koltuk();
		basicHonda.move();
	}
	@Override
	public void kapi() {
		System.out.println("Manuel Kapi");	
	}
	@Override
	public void direksiyon() {
		System.out.println("Suni deri direksiyon");	
	}
	@Override
	public void koltuk() {
		System.out.println("Deri koltuk");	
	}
	@Override
	public void klima() {
		System.out.println("Manuel klima");	
	}
	@Override
	public void move() {
		System.out.println("10 saniyede 100 km'lik hiza ulasir");	
	}
}
