
public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		
		int[] vetor = {-5, -6, 15, 50, 8, 4};
		
		System.out.print("Vetor: ");
		int cont = 0;
		while (cont < (vetor.length)) {
		
			System.out.print(vetor[cont] + " ");
			cont ++;
		}
		
		System.out.print("\nVetor Inverso: ");
		for (int i = (vetor.length - 1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
	}

}
