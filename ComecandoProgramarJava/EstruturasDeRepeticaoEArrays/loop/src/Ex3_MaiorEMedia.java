import java.util.Scanner;

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		int maior = 0;
		int cont = 0;

		do {
			
			System.out.println("Número: ");
			numero = scan.nextInt();
			soma += numero;
			if (numero > maior)
				maior = numero;
			cont ++ ;
			
		} while (cont < 5);
		
		System.out.println("Maior: " + maior);
		System.out.println("Média: " + (soma/5));
	}

}
