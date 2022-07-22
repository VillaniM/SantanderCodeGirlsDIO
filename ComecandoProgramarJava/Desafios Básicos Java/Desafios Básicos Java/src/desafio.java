import java.io.IOException;
import java.util.Scanner;

public class desafio {
	
	/*//Intervalo
	public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double valor = leitor.nextDouble();
        if (valor >= 0d && valor <= 25d) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25d && valor <= 50d) {
            System.out.println("Intervalo (25,50]");
        } else if (valor > 50d && valor <= 75d) {
            System.out.println("Intervalo (50,75]");  
        } else if (valor > 75d && valor <= 100d) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }*/
	
	/*//Dominó
	public static void main(String[] args) {
	  Scanner leitor = new Scanner(System.in);
	  int n = leitor.nextInt();
	  System.out.println((n+1)*(n+2)/2);
    	
	}*/
	
	//Vetor de nomes
	public static void main(String[] args) throws IOException {
		 
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++)
        {
            nomes[i] = input.nextLine();
        }

        int pos = input.nextInt();
        System.out.println(nomes[pos]);
       
	}
}