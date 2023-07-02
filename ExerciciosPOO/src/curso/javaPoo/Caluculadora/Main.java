package curso.javaPoo.Caluculadora;

import javax.swing.JOptionPane;

/*Escreva uma classe Calculadora que tenha os seguintes
métodos: somar, subtrair, multiplicar, dividir (dois
números), elevar à potência n. Desenvolva um programa
para testar essa classe.*/

public class Main {

	static void imprimirResultado(int num) {
		System.out.println(num);
	}

	static void imprimirResultado(double num) {
		System.out.println(num);
	}

	public static void main(String[] args) {

		String primeiroNumero = JOptionPane.showInputDialog("Digite um número:");
		String segundoNumero = JOptionPane.showInputDialog("Digite outro número:");

		int num1 = Integer.valueOf(primeiroNumero);
		int num2 = Integer.valueOf(segundoNumero);

		imprimirResultado(Calculadora.somar(num1, num2));
		imprimirResultado(Calculadora.subtrair(num1, num2));
		imprimirResultado(Calculadora.dividir(num1, num2));
		imprimirResultado(Calculadora.elevarPotencia(num1, num2));


	}

}
