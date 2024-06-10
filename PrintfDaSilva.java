
public class PrintfDaSilva {
	
	public static void main(String[] args) {
		
		//System.out.printf("This is a a format String %d", 123);
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Vitor";
		int myInt = 50;
		double myDouble = 10.15;
		
		System.out.printf("%10b", myBoolean);
		System.out.println("");
		System.out.printf("%c", myChar);
		System.out.println("");
		System.out.printf("%s", myString);
		System.out.println("");
		System.out.printf("%d", myInt);
		System.out.println("");
		System.out.printf("%020f", myDouble);
		System.out.println("");
		System.out.printf("%,2f", myDouble);
		System.out.println("");
		System.out.printf("%+2f", myDouble);
		System.out.println("");
		System.out.printf("%-2f", myDouble);
	
	
	}

}
