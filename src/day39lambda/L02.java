package day39lambda;

import java.util.ArrayList;
import java.util.List;

public class L02 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		//Tum cift sayi olan elemanlarin kuplerini ekrana yazdiriniz 
		list.
		  stream().
		  filter(t->t%2==0).
		  map(t->t*t*t).
		  forEach(t->System.out.print(t + " "));
		
		System.out.println();
		
		//list'deki tum elemanlarin toplamini ekrana yazdiriniz
		int sum = list.
		            stream().
		           reduce(0,(t,u)->t+u);
		
		System.out.println(sum);
		
		//list'deki tum tek sayi olan elemanlarin carpimini ekrana yazdiriniz
		int product = list.
						stream().
						filter(t->t%2!=0).
						reduce(1,(t,u)->t*u);
		
		System.out.println(product);
		
		
		
		//list'deki 3 ile bolunebilen elemanlarin 2 fazlalarinin toplamini ekrana yazdiriniz
		System.out.println(list.
	               			stream().
	               			filter(L02::isDivisibleByThree).
	               			map(t->t+2).
	               			reduce(0,(t,u)->t+u));
		
		//list'deki elemanlari ekrana yazdiriniz ama tekrarli olanlari 1 kere yazdiriniz
		list.
		   stream().
		   distinct().
		   forEach(System.out::print);//t->System.out.print(t + " ") ==> Lambda Expression
		                              //Lambda Expression kullanabilirsiniz ama daha guzeli mumkunse "Method Reference" kullanin
		                              //Method Reference ==> Class Ismi :: Method Ismi

	}
	
	private static boolean isDivisibleByThree(int t) {
		return t%3==0;
	}

}
