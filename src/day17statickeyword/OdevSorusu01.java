package day17statickeyword;

public class OdevSorusu01 {

	int x=1;
	static int y;
	
	OdevSorusu01(int i){
		x+=i;
		y+=i;
	}
	public static void main(String[] args) {
		
		OdevSorusu01 mc1 = new OdevSorusu01(5);
		System.out.println(mc1.x + ", " + mc1.y);
		OdevSorusu01 mc = new OdevSorusu01(7);
		System.out.println(mc.x + ", " + mc.y);
	}

}
