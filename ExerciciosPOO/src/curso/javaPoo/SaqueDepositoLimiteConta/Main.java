package curso.javaPoo.SaqueDepositoLimiteConta;

import javax.swing.JOptionPane;

/*
Cria uma classe para representar uma conta corrente que
possui um número, um saldo, um status que informa se ela é
especial ou não e um limite. Desenvolva métodos para realizar
saque (verificando se o cliente pode realizar saques), depositar
dinheiro, consultar saldo e verificar se o cliente está usando
cheque especial ou não. Desenvolva um programa para testar
essa classe.
*/

public class Main {

	public static void main(String[] args) {

		SaqueDepositoLimiteConta conta = new SaqueDepositoLimiteConta();

		conta.numeroConta = "8888-8";
		conta.saldo = 7500;
		conta.clienteEspecial = true;
		conta.limiteEspecial = 1000;

		String valor;
        int escolha;
        
        
		do {

			String opcao = JOptionPane.showInputDialog("Escolha uma opção: \n 1 - Depósito \n 2 - Saque "
					+ "\n 3 - Consultar saldo \n 4 - Consultar uso do cheque especial ");

			switch (opcao) {

			case "1":

				valor = JOptionPane.showInputDialog("Digite o valor a ser depositado:").replace("," , ".");
				conta.depositar(Double.valueOf(valor));
				break;

			case "2":

				valor = JOptionPane.showInputDialog("Digite o valor a ser sacado:").replace("," , ".");
				conta.sacar(Double.valueOf(valor));
				break;

			case "3":
                
				conta.consultarSaldo();
				break;
			
			case "4":

				System.out.println(conta.consultarUsoDoEspecial() ? "Está usando o cheque especial"
						: "Não está usando o cheque especial");
				break;

			default:
				
				System.out.println("Opção inválida.");

			}
			
			System.out.println("-----------------------------------------------------------");


			escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

		} while (escolha == 0);
		
		
		System.out.println("Operação finalizada,obrigado por utilizar o nosso sistema. ");

	}

}
