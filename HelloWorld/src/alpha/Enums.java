package alpha;

public enum Enums {
	
	FIRST{

		int p = 10;
		@Override
		void display() {
			System.out.println("I am in First: " + p);
			
		}
		
	},
	SECOND{
		int q = 20;

		@Override
		void display() {
			// TODO Auto-generated method stub
			System.out.println("I am in SECOND: " + q);
		}
		
	},
	THIRD{
		int r = 30;
		@Override
		void display() {
			// TODO Auto-generated method stub
			System.out.println("I am in THIRD: " + r);
		}
		
	};
	
	private Enums(){
		System.out.println("Hello I am an Enum Constructor");
	}
	
	
	int i=100;
	
   abstract void display();

}
