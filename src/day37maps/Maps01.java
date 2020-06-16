package day37maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		
		// Map bir interface'dir. Map interface'inin 3 tane child class'i vardir
		/* 1) HashMap: HasMap key-value yapisini kullanir. Key ve value 
		 *             programci tarafindan yazilir.
		 *             Key ve value'da null degeri kullanilabilir. Key'de
		 *             1'den fazla null degeri kullanilirsa Java son kullanilan
		 *             null'i kabul eder. Value'da 1'den fazla null degeri
		 *             kullanilabilir.
		 *             HashMap console'a yazdirildiginda hem key degerleri hem de
		 *             value degerleri aralarina = sembolu konularak yazdirilir
		 *             HashMap'ler ekrana yazdirirken rastgele siralama yapar
		 *             HasMap map'ler arasinda en hizlisidir.
		 *             HashMap'ler "thread safe" degildir.
		 */
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(33333, "Ali");
		hashMap.put(111, "Veli");
		hashMap.put(2222, "Mine");
		hashMap.put(4, "Kemal");
		System.out.println(hashMap);//{4=Kemal, 33333=Ali, 2222=Mine, 111=Veli}
		
		System.out.println(hashMap.remove(4));//Kemal
		System.out.println(hashMap);// {33333=Ali, 2222=Mine, 111=Veli}
		
		System.out.println(hashMap.remove(111, "Veli"));//true
		System.out.println(hashMap.remove(2222, "Ayse"));//false
		System.out.println(hashMap);//{33333=Ali, 2222=Mine}
		
		System.out.println(hashMap.get(2222));//Mine
		System.out.println(hashMap.get(100));//null
		
		System.out.println(hashMap.keySet());// [33333, 2222]
		System.out.println(hashMap.values());//[Ali, Mine]
		
		System.out.println(hashMap.size());//2
		
		System.out.println(hashMap.containsKey(33333));//true
		System.out.println(hashMap.containsKey(4));//false
		
		System.out.println(hashMap.containsValue("Mine"));//true
		System.out.println(hashMap.containsValue("Emin"));//false
		
		hashMap.replace(2222, "Emin");//Mine'yi Emin yapti
		System.out.println(hashMap);
		
		hashMap.clear();//Tum elemanlari siler
		System.out.println(hashMap);//{}	
	}
}
