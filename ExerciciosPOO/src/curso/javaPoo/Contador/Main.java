package curso.javaPoo.Contador;

/*
Escreva uma classe chamada Contador,
que tem um atributo estático que é
incrementado sempre que a classe for
instanciada.Crie métodos para zerar,
incrementar e retornar o valor do
contador. Desenvolva um programa para
testar essa classe.
*/

public class Main {
	
	static void imprimirValor(){
		System.out.println(Contador.obterValor());
	}

	public static void main(String[] args) {
	

		imprimirValor();
		Contador.incrementar();
		imprimirValor();
		Contador.zerar();
		imprimirValor();
		
		System.out.println(Contador.obterValor());
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		imprimirValor();

	}

}
