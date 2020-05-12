package day17statickeyword;

public class Static05 {

	public static void main(String[] args) {
		
		Static04 obj1 = new Static04();
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);//num2 static oldugundan object kullanarak cagirmami Java istemiyor.
		System.out.println(Static04.num2);//Class ismi ile cagirmami Java guzel karsiladi.
	}
}
