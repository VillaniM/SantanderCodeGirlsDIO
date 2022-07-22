import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

	/*
	 * Dadas as seguintes informações sobre minhas séries favoritas, 
	 * crie um conjunto e ordene esse conjunto exibindo: nome - genero - tempo de episodio
	 * 
	 * Serie 1 = nome: got, genero: fantasia, : 60 
	 * Serie 2 = nome: dark, genero: drama, : 60 
	 * Serie 3 = nome: that '70s show, genero: comedia, : 25
	 */
	
	public static void main(String[] args) {
		
		System.out.println("--\tOrdem aleatória\t--");
		Set<Serie> minhasSeries = new HashSet<>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comédia", 25));
		}};
		
		for (Serie serie : minhasSeries) {
			System.out.println(serie.getNome() + " - "
					+ serie.getGenero() + " - "
					+ serie.getTempoEpisodio());
		}
		
		System.out.println("--\tOrdem de Inserção\t--");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comédia", 25));
		}};
		for (Serie serie : minhasSeries1) {
			System.out.println(serie.getNome() + " - "
					+ serie.getGenero() + " - "
					+ serie.getTempoEpisodio());
		}
		
		System.out.println("--\tOrdem Natural (TempoEpisodio)\t--"); //para isso precisa implementar o comparable na classe Serie
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
		for (Serie serie : minhasSeries2) {
			System.out.println(serie.getNome() + " - "
					+ serie.getGenero() + " - "
					+ serie.getTempoEpisodio());
		}
		
		//**NOTA IMPORTANTE - só posso utilizar o comparable para UM atribito
		//para comparar mais atributos da classe utilizo o COMPARATOR - crie o class Comparator
		
		
		System.out.println("--\tOrdem Nome/genero/tempoEpisodio\t--");
		Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		//não basta criar o treeset e implementar o comparator, é preciso adicionar os elementos
		minhasSeries3.addAll(minhasSeries);
		for (Serie serie : minhasSeries3) {
			System.out.println(serie.getNome() + " - "
					+ serie.getGenero() + " - "
					+ serie.getTempoEpisodio());
		}
	}

}

class Serie implements Comparable<Serie> {
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}

	@Override
	public int compareTo(Serie series) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), series.getTempoEpisodio());
		if (tempoEpisodio != 0) return tempoEpisodio;
		
		return this.getGenero().compareTo(series.getGenero());
	}
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if (nome != 0) return nome;
		
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if (genero != 0) return genero;
		
		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
		
		
		
	}

	
}

