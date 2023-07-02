package curso.javaPoo.Agenda;

/*
Escreva uma classe Agenda que contém vários contatos
do tipo Contato. Cada contato possui nome, telefone
e email. A Agenda também possui um nome. Crie
um programa teste que peça para o usuário entrar com
o nome da Agenda e em seguida 3 contatos. Crie métodos
que retornem uma String com a informação de cada contato
e também de todos os contatos da agenda.
*/

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Agenda agenda = new Agenda();

		String nome = JOptionPane.showInputDialog("Digite o nome da agenda:");
		agenda.setNomeAgenda(nome);

		for (int i = 0; i <= 2; i++) {

			String nomePessoa = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º contato: ");
			String emailContato = JOptionPane.showInputDialog("Digite o e-mail do " + (i + 1) + "º contato: ");
			String telefoneContato = JOptionPane.showInputDialog("Digite o telefone do " + (i + 1) + "º contato: ");

			Contato contato = new Contato();

			contato.setNomeContato(nomePessoa);
			contato.setEmail(emailContato);
			contato.setTelefone(telefoneContato);

			agenda.getContatos().add(contato);

		}

		if (agenda != null) {
			System.out.println(agenda.obterInfo());
		}

	}

}
