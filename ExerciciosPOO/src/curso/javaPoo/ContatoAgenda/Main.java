
/*
 Crie uma classe que represente um contato da agenda
do seu celular.
*/

package curso.javaPoo.ContatoAgenda;

public class Main {

	public static void main(String[] args) {

		ContatoAgenda contato = new ContatoAgenda();

		contato.nome = "Luiz da Silva Gama";
		contato.celular = "(27)99994-5674";
		contato.telefone = "(27)3225-4590";
		contato.email = "gamaluiz@gmail.com";

		System.out.println("Nome: " + contato.nome);
		System.out.println("Celular: " + contato.celular);
		System.out.println("Telefone: " + contato.telefone);
		System.out.println("E-mail: " + contato.email);

	}

}
