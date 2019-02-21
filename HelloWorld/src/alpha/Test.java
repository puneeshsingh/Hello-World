package alpha;

public class Test implements iTest{

	public static void main(String[] args) {
		
		int en1 = Enums.FIRST.i;
		System.out.println("en1 = " + en1);
		Enums.FIRST.display();
		
		int en2 = Enums.SECOND.i;
		System.out.println("en1 = " + en2);
		Enums.SECOND.display();
		
		
		int en3 = Enums.THIRD.i;
		System.out.println("en1 = " + en3);
		Enums.THIRD.display();
	
		
		Enums[] en4 = Enums.values();
		
		for(int i=0;i<en4.length;i++) {
			System.out.println(en4[i]);
		}
		
		
	}

	public void beep() {
		
		System.out.println("double beep");
	}
	
	
	public void siplay() {
		System.out.println("I am in display");
	}

}
