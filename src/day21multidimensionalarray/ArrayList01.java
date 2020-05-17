package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		//Array'lerde length sabittir, degistirilemez.
		//ArrayList'lerde (List) length esnektir. Siz eleman ekledikce List length'ini
		//artirir, siz eleman sildikce List length'ini azaltir.
	
		//List<String> list01 = new List<>(); ==> olmaz
		//ArrayList<String> list01 = new List<>(); ==> olmaz
		//ArrayList<String> list01 = new ArrayList<>(); ==> Bu olabilir ama
		//asagidaki daha cok kullanilir.
		//List<String> list01 = new ArrayList<String>();==> bu da olur ama 
		//asagidaki daha cok kullanilir.
		
		List<String> list01 = new ArrayList<>();
		System.out.println(list01);//[]
		
		//List'e eleman eklemek icin add() methodu kullanilir.
		list01.add("Ali");
		System.out.println(list01);//[Ali]
		
		list01.add("Can");
		System.out.println(list01);//[Ali, Can] once ekleneni one koyar
		
		//Veli'yi Ali ile Can'in arasina ekleyelim
		list01.add(1, "Veli");
		System.out.println(list01);//[Ali, Veli, Can]
		
		//list01'i [Han, Ali, Kemal, Veli, Can, Ayse] sekline getirin
			list01.add(0, "Han");
			System.out.println(list01);//[Han, Ali, Veli, Can]
			
			list01.add(2, "Kemal");
			System.out.println(list01);//[Han, Ali, Kemal, Veli, Can]
			
			list01.add("Ayse");
			System.out.println(list01);//[Han, Ali, Kemal, Veli, Can, Ayse]
			
	   //list01'in eleman sayisini ekrana yazdiriniz. size() method kullanilir.
			System.out.println("Eleman sayisi: " + list01.size());//6
	}
}
