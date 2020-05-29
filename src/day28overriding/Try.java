package day28overriding;

public class Try { 
    // private methods are not overridden 
    private void m1(){ 
        System.out.println("From parent m1()"); 
    } 
  
    protected void m2(){ 
    	m1();
        System.out.println("From parent m2()"); 
    } 
} 
  
  

