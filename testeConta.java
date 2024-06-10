import java.util.Scanner;

public class testeConta {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual seu nome ? :");
		String name = scanner.nextLine();
		
		System.out.println("Qual sua idade ? :");
		int idade = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Qual sua comida favorita? :");
		String comida = scanner.nextLine();
		
		System.out.println("Seu nome é: "+name);
		System.out.println("Sua idade é: "+idade);
		System.out.println("Sua comida favorita é: "+comida);
	}

}

