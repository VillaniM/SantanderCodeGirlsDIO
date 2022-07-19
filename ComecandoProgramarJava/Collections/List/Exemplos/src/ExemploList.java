import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

	//Dada uma lista com 7 notas de um aluno [7,8.5,9.3,5,7,0,3.6], faça:
	public static void main(String[] args) {
	
		//List notas = new ArrayList(); //Declaração usada antes do java 5
		//List<Double> notas = new ArrayList<>(); //Generics(jdk5) - Diamont Operator(jdk7)
		//ArrayList<Double> notas = new ArrayList<>(); //método não recomendado pois, o ideal é implementar a inteface
		//List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5, 9.3, 5d, 7d, 0d, 3.6));
		/*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //essa forma é limitada, não permite adicionar e remover itens
		notas.add(10d);
		System.out.println(notas);
		*/
		
		//Essa forma torna a lista imutável
		/*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
		notas.add(1d);
		notas.remove(5d);
		System.out.println(notas);
		*/

		System.out.println("Crie uma lista e adicione as sete notas: ");
		
		List<Double> notas = new ArrayList<>();
		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5d);
		notas.add(7d);
		notas.add(0d);
		notas.add(3.6);
		
		/*
		 * //System.out.println(notas); System.out.println(notas.toString()); //é
		 * possível exibir dos dois jeitos
		 * 
		 * System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));//o
		 * indexOf retorna o indíce de posição do objeto
		 * 
		 * System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
		 * notas.add(4, 8d); System.out.println(notas);
		 * 
		 * System.out.println("Substitua a nota 5.0 pela nota 6.0: "); //a função set
		 * substitui o elemento notas.set((notas.indexOf(5d)), 6.0);
		 * System.out.println(notas);
		 * 
		 * //a função contains retorna um boolean
		 * System.out.println("Confira se a nota 5.0 está na lista: " +
		 * notas.contains(5.0) );
		 * 
		 * System.out.println("Exiba todas as notas na ordem em que foram informados: "
		 * );
		 * 
		 * //o list já organiza o índice de posições pela ordem de inserção
		 * System.out.println(notas);
		 */
		
		//método get recebe a posição e retorna o elemento
		//não se esqueça que o índice começa com zero
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		System.out.println(notas.toString());
		
		//o list não tem métodos nativo que compare os valores, mas o Collections tem
		//isso é possível porque a classe Double implementa a classe Comparable, que faz as comparações
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("Exiba a maio nota: " + Collections.max(notas));
		
		System.out.println("Exiba a soma dos valores: ");
		//o métodos iterator faz a iteração entre os elementos
		
		Iterator<Double> iterator = notas.iterator();
		
		Double soma = 0d;
		while (iterator.hasNext()) {
			Double next = (Double) iterator.next();
			soma += next;
		}
		System.out.println(soma);
		
		System.out.println("Exiba a média das notas: " + (soma/notas.size()));
		
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas);
		
		System.out.println("Remova a nota na posição 0: ");
		notas.remove(0);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		
		while (iterator1.hasNext()) {
			Double next = (Double) iterator1.next();
			if(next < 7) iterator1.remove();
		}
		System.out.println(notas);
		
		System.out.println("Apague toda a lista: ");
		notas.clear();
		
		//isEmpty retorna true se estiver vazia e false se não estiver
		System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
	}

}
