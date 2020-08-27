package day39lambda;

import java.util.ArrayList;
import java.util.List;

public class L01 {
	
	/*
	 Lambda = Functional Programming
	 Normal Java = Structured Programming
	 */

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		list.add("Kemal");
		list.add("Mucella");
		list.add("Ayse");
		list.add("Emine");
		System.out.println(list);
		
		//list'in tum elemanlarini ekrana yazdiriniz
		
			//1. Yol: Structured Programming
			for(String w : list) {
				System.out.print(w + " ");
			}			
			System.out.println();			
			//2. Yol: Functional Programming
			list.
			   stream().
			   forEach(t->System.out.print(t + " "));//t->System.out.print(t + " ") ==> Lambda Expression 
		
	   //list'in icindeki harf sayisi 5'den az olanlarini yazdiriniz	
			System.out.println();
			
			//1. Yol: Structured Programming
			for(String w : list) {
				if(w.length()<5) {
					System.out.print(w + " ");
				}
			}
			
			System.out.println();
			
			//2. Yol: Functional Programming
		    list.
		       stream().
		       filter(t->t.length()<5).
		       forEach(t->System.out.print(t + " "));
		    
		    System.out.println();
		    
		//list'in icindeki son harfi 'e' olanlari ekrana yazdiriniz	    
		    list.
		       stream().
		       filter(t->t.endsWith("e")).
		       forEach(t->System.out.print(t + " "));
		    
		    System.out.println();
		    
		//list'in icindeki elemanlardan 'a' harfi icerenleri ekrana yazdiriniz    
		    list.
				stream().
				filter(t-> t.contains("a")).
				forEach(t->System.out.print(t + " "));   
		    
		    System.out.println();
		    
	   //list'in icindeki elemanlardan character sayisi 4'den fazla olanlari uppercase yaparak ekrana yazdiriniz
		    list.
		       stream().//Elemanlari yukaridan asagiya dizer
		       filter(t->t.length()>4).//Belli sartlara gore eleman secmemize yarar
		       map(t->t.toUpperCase()).//Elemanlari update etmek icin kullanilir
		       forEach(t->System.out.print(t + " "));//Loop'lar gibi her elemani birer birer alarak islem yapar
	
		    System.out.println();
		    
	   //list'in icindeki elemanlarin eleman sayilarini ekrana yazdiriniz    
		    list.
		        stream().
				map(t->t.length()).
			    forEach(t->System.out.print(t + " "));   
		    
		    System.out.println();
		    
		//list'in icindeki elemanlardan icinde 'e' olanlarin eleman sayilarinin karesini ekrana yazdiriniz     
		    list.
			  stream().
			  filter(t->t.contains("e")).
			  map(t->t.length()*t.length()).
			  forEach(t->System.out.print(t + " ")); 
		   
	}

}
