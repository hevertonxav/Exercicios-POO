package curso.javaPoo.SaqueDepositoLimiteConta;

public class SaqueDepositoLimiteConta {

	String numeroConta;
	double saldo;
	boolean clienteEspecial;
	double limiteEspecial;

	void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito realizado com sucesso.");
	}

	void sacar(double valor) {

		if (valor <= saldo) {

			saldo -= valor;

			System.out.println("Saque realizado com sucesso.");
			
		} else {

			if (clienteEspecial) {

				double limite = limiteEspecial + saldo;

				if (limite >= valor) {

					saldo -= valor;
					System.out.println("Saque realizado com sucesso.");

				} else {

					System.out.println("Saque excedeu o limite do saldo.");
	
				}

			} else {

				System.out.println("Saque excedeu o limite do saldo.");

			}

		}

	}

	void consultarSaldo() {

		System.out.printf("Saldo: R$ %.2f %n", (saldo > 0) ? saldo : 0);
		System.out.printf("Limite cheque especial disponível: R$ %.2f %n",
				(saldo < 0) ? (limiteEspecial + saldo) : limiteEspecial);

	}

	boolean consultarUsoDoEspecial() {

		return saldo < 0;

	}

}
