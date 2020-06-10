package day35collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		
		//Linked list'de head haric her eleman icin bir data bir de pointer var.
		//head'de sadece pointer var.
		//Her elemanin pointer'i bir sonraki elemani gosterir, son eleman'in(tail)
		//pointer'i Null gosterir.
		//Data ve pointer iceren her elemanin diger adi "Node" dur.
		//Linked list eleman ekleme ve cikarma durumlarinda basarilidir.
		
		
		// Linked list objesi olusturunuz
		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("Mark");
		linkList.add("Amanda");
		linkList.add("John");
		linkList.add("Ann");
		linkList.add("Pamela");
		System.out.println(linkList);// [Mark, Amanda, John, Ann, Pamela] 
		
		linkList.remove(2);//remove() methodu index'e gore eleman siler
		System.out.println(linkList);// [Mark, Amanda, Ann, Pamela]
		
		linkList.removeFirst();
		System.out.println(linkList);// [Amanda, Ann, Pamela]
		
		linkList.removeLast();
		System.out.println(linkList);// [Amanda, Ann]
		
		linkList.add(1, "Ali");
		System.out.println(linkList);// [Amanda, Ali, Ann]
		
		linkList.addFirst("Kemal");
		System.out.println(linkList);// [Kemal, Amanda, Ali, Ann]
		
		linkList.addLast("Zeynep");
		System.out.println(linkList);// [Kemal, Amanda, Ali, Ann, Zeynep]
		
		linkList.set(1, "Ajanda");
		System.out.println(linkList);// [Kemal, Ajanda, Ali, Ann, Zeynep]
		
		LinkedList<String> linkList2 = new LinkedList<>();
		linkList2.add("X");
		linkList2.add("Y");
		
		linkList2.addAll(linkList);
		System.out.println(linkList2);// [X, Y, Kemal, Ajanda, Ali, Ann, Zeynep]
		
		linkList.addAll(3, linkList2);
		System.out.println(linkList);
		// [Kemal, Ajanda, Ali, X, Y, Kemal, Ajanda, Ali, Ann, Zeynep, Ann, Zeynep]
		
		System.out.println(linkList2.contains("Can"));//false
		System.out.println(linkList2.contains("Ali"));//true
		
		linkList2.clear();//clear() methodu list'in elemanlarini siler, sizde bos bir list kalir
		System.out.println(linkList2);//[]

	}

}
