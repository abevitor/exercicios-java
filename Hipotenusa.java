import java.util.Scanner;

public class Hipotenusa {

	public static void main(String[] args) {
		double x,y,z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor de x: ");
		x = scanner.nextDouble();
		System.out.println("Digite o valor de y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("O valor da hipotenusa é de: "+z);
		
		scanner.close();
		
			

}
	}