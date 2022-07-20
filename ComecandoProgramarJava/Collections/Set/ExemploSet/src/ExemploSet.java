import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	//Dada uma lista com 7 notas de um aluno [7,8.5,9.3,5,7,0,3.6], faça:
	public static void main(String[] args) {
		
	 // Set notas = new HashSet(); //antes do java 5 
	 // Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7) 
	 // HashSet<Double> notas new HashSet<>(); 
	 // Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6)); 
	 // Set<Double> notas = Set.of(7d,8.5,9.3,5d,7d,0d,3.6); 
	 // notas.add(1d); 
	 // notas.remove(5d);
	 // System.out.println(notas);
		 
		
		System.out.println("Crie um conjunto e adicione as notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6)); 
		
		System.out.println(notas);
		
		//System.out.println("Exiba a posição da nota 5.0: "); //não tem como fazer isso no SET
		//System.out.println("Adicione na lista a nota 8.0 na posição 4: "); //não tem como fazer isso no SET
		//System.out.println("Substitua a nota 5.0 pela nota 6.0: "); //não tem como fazer isso no SET
		
		System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
		
		//System.out.println("Exiba a terceira nota adicionada: "); //não tem como fazer isso no SET

		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		System.out.println("Exiba a soma dos valores: ");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println(soma);
		
		System.out.println("Exiba a média das notas: " + (soma/notas.size()));
		
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas);
		
		//System.out.println("Remova a nota na posição 0: "); //não tem como fazer isso no SET

		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()) {
			Double numero = iterator1.next();
			if(numero < 7) iterator1.remove();
		}
		System.out.println(notas);
		
		System.out.println("Exiba todas as notas na ordem em que foram informados: ");
		//não é possível fazer essa ordenação com HashSet então vamos utilizar o LinkedHashSet
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		
		System.out.println(notas2);
		
		System.out.println("Exiba todas as notas em ordem crescente: ");
		//para ordenar Set é necessário utilizar TreeSet
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		
		System.out.println("Apague todo o conjunto: ");
		notas.clear();
		
		System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
		
	}

}
