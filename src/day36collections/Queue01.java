package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		// Queue: Queue'ya eklenen elemanlar en sona eklenir, list'lerde oldugu gibi.
		//        Queue'da silinen elemanlar en bastan silinir.
		//        [1, 2, 3] ==> Bu Queue'dan eleman silmeye basladiginizda once 1 silinir.
		//        FIFO ==> First In First Out
		
		//PriorityQueue elemanlari natural order'a gore siralar.
		Queue<String> q = new PriorityQueue<>();
		q.add("B");
		q.add("A");
		q.add("C");
		System.out.println(q);//[A,B,C]
		
		//remove() methodu kullanalim
		System.out.println("Silinen eleman: " + q.remove()); //A 
        //remove() sildigi elemani return eder ve her zaman ilk elemani siler
		System.out.println("Kalan queue: " + q);//[B,C]
		System.out.println(q.remove("C"));//true, cunku biz Java'ya hangi elemani 
		//silmesi gerektigini soyledik, Java true return ederek islem tamam mesaji verir.
		System.out.println(q);//[B]
		System.out.println("Silinen eleman: " + q.remove());//B
		System.out.println(q);//[]
		//System.out.println("Silinen eleman: " + q.remove());
		//remove() methodu bos queue'lar icin Exception verdiginden bu kodu comment yaptik 
		
		//LinkedList elemanlari sizin girdiginiz siraya gore siralar
		Queue<String> qll = new LinkedList<>();
		qll.add("B");
		qll.add("A");
		qll.add("C");
		System.out.println(qll);//[B,A,C]
		System.out.println("Ilk eleman: " + qll.element());//Ilk elemani dondurur
		System.out.println(qll.poll());//B ==> Ilk elemani sildi ve return etti
		System.out.println(qll);//[A,C]
		System.out.println(qll.poll());//A
		System.out.println(qll);//[C]
		System.out.println(qll.poll());//C
		System.out.println(qll);//[]
		System.out.println("Bos Queue icin poll(): " + qll.poll());
		System.out.println(qll);//[]
		
		//Not: remove() methodu bos queue'lar icin kullanilirsa Exception verir.
		//     poll() methodu bos queue'lar icin kullanilirsa null verir.
		//     Ama dolu queue'lar icin ayni isi yaparlar, farklari yoktur
		
	}

}
