package day28overriding;

public class Child extends Try { 
    // new m1() method 
    // unique to Child class 
    private void m1(){ 
        System.out.println("From child m1()"); 
    } 
  
    // overriding method 
    // with more accessibility 
    @Override
    public void m2() 
    { 
    	m1();
        System.out.println("From child m2()"); 
    } 
} 
