import java.util.Random;

public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numAleatorios = new int[20];
		
		System.out.print("Números aleatórios: ");
		for (int i = 0; i < numAleatorios.length; i++) {
			int numero = random.nextInt(100);
			System.out.print(numero + " ");
		
			numAleatorios[i] = numero;
		}
		System.out.print("\nSucessores dos Números Aleatórios: ");
		for (int i : numAleatorios) {
			System.out.print((i + 1) + " ");
		}

	}

}
