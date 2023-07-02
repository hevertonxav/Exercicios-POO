
package curso.javaPoo.ContaCorrente;
/*
Cria uma classe para representar uma conta corrente
que possui um número, um saldo, um status que informa
se ela é especial ou não, um limite.
*/

public class Main {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();

		conta.numeroConta = "11340-8";
		conta.saldo = 7590.68;
		conta.contaEspecial = true;
		conta.limite = 9000;

		System.out.println("Número da conta: " + conta.numeroConta);
		System.out.printf("Saldo: R$ %.2f \n", conta.saldo);
		System.out.println("Conta Especial: " + (conta.contaEspecial ? "sim" : "não"));
		System.out.printf("Limite: R$ %.2f", conta.limite);

	}

}
