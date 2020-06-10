package day32abstractioninterface;

public class KralDairesi extends Otel {

	public static void main(String[] args) {
		KralDairesi musteri3 = new KralDairesi();
		musteri3.kahvalti();
		System.out.println("International TV: " + musteri3.tv("international", 12));
		System.out.println("Wifi: " + musteri3.wifi(11));
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz teras kat Kral Restaurant'dadir");
	}
	
	public int tv(String international, int saat) {
		if(international.equals("international")) {
			return saat*5;
		}else {
			return 0;
		}
	}

}
