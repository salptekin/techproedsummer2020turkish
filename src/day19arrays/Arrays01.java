package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// Integer Array olusturalim
		int arr1[] = new int[5];
		
		//System.out.println(arr1);==> Array'in reference'ini ekrana yazdirir
		//System.out.println(arr1[2]);==> Array'in index'i 2 olan elemanini ekrana yazdirir	
		System.out.println(arr1[0]);
		System.out.println(arr1[3]);
		
		arr1[0] = 12;
		System.out.println(arr1[0]);
		
		arr1[1] = 13;
		System.out.println(arr1[1]);
		
		arr1[2] = 14;
		System.out.println(arr1[2]);
		
		arr1[3] = 15;
		System.out.println(arr1[3]);
		
		arr1[4] = 22;
		System.out.println(arr1[4]);
		
		//Array'deki elemanlari ekrana yazdirmak icin for dongusu kullaniniz
		for(int i=0; i<5; i++) {
			System.out.println(arr1[i]);
		}
		
		//Array'de olmayan index'e deger atamasi yapilirsa Run Time Error alinir.
		//Array'de olmayan indexi kullanmaya calisirsak "ArrayIndexOutOfBoundsException" aliriz.
		arr1[5]=23;
		System.out.println(arr1[5]);

	}

}
