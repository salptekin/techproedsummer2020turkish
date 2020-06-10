package day31abstraction;

public class Abstraction02 extends Abstraction01 {

	public static void main(String[] args) {
	    Abstraction02 obj = new Abstraction02();
	    obj.abstractMethod();
	    obj.concreteMethod();

	}
	@Override
	public void abstractMethod() {
		System.out.println("Abstract methodun override edilmis hali");	
	}
}
