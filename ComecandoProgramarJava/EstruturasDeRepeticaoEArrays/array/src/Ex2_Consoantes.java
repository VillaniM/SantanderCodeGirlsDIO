import java.util.Scanner;

public class Ex2_Consoantes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] consoantes = new String[6];
		
		int quantConsoantes = 0;
		
		int cont = 0;
		do {
			System.out.println("Letra: ");
			String letra = scan.next();
			
			if( !(letra.equalsIgnoreCase("a")|
					letra.equalsIgnoreCase("e")|
					letra.equalsIgnoreCase("i")|
					letra.equalsIgnoreCase("o")|
					letra.equalsIgnoreCase("u"))) {
				consoantes[cont] = letra;
				quantConsoantes ++;
			}
			cont ++;
		} while (cont < consoantes.length);
		
		System.out.println("Consoantes");
		for (String consoante : consoantes) {
			if(consoante != null)
				System.out.print(consoante + " ");
		}
		
		System.out.println("Quantidade de consoantes: " + quantConsoantes);

	}

}
