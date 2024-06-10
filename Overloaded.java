

public class Overloaded {
	
	public static void main(String[] args) { 
		
		double x = add(1.42,2.34,3.14);
		int y = add(1,2,3,4);
		
		System.out.println(x);
		System.out.println(y);
		
	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	
	static double add(double a , double b, double c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;
		
	}

}
