public class Main {

	public static void main(String[] args) {

		//Calculadora
		System.out.println("Exemplo Calculadora");
		Calculadora.soma(5, 1);
		Calculadora.subtracao(5, 1);
		Calculadora.multiplicacao(2, 10);
		Calculadora.divisao(10, 2);
		
		//Mensagem
		System.out.println("Exercício Mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		
		//Empréstimo
		System.out.println("Exercício empréstimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
	}

}
