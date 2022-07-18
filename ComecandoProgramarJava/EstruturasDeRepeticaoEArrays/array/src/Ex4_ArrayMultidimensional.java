import java.util.Random;

public class Ex4_ArrayMultidimensional {

	public static void main(String[] args) {
		Random random = new Random();
		
		//primeiras chaves é para linha, a segunda é para coluna
		int[][] m = new int[4][4];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = random.nextInt(9);
			}
		}
		
		System.out.println("Matriz: ");
		//esse for abaixo é um exemplo de for each
		for (int[] linha : m) {
			for (int numero : linha) {
				System.out.print(numero + " ");
			}
			System.out.println();
		}
		
	}

}
