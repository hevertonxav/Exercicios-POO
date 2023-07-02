package curso.javaPoo.SaltoDistancia;

import java.text.DecimalFormat;

public class Atleta {

	private String nome;
	private double[] saltos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getSaltos() {
		return saltos;
	}

	public void setSaltos(double[] saltos) {
		this.saltos = saltos;
	}

	public double procurarMelhorSalto() {

		double maior = Integer.MIN_VALUE;

		for (double salto : saltos) {

			if (salto > maior) {

				maior = salto;
			}
		}

		return maior;
	}

	public double procurarPiorSalto() {

		double menor = Integer.MAX_VALUE;

		for (double salto : saltos) {

			if (salto < menor) {

				menor = salto;
			}
		}

		return menor;
	}

	public double calcularMediaSaltosRestantes() {

		double somaSaltos = 0;

		for (double salto : saltos) {

			somaSaltos += salto;

		}

		double mediaSaltosRestantes = (somaSaltos - (procurarMelhorSalto() + procurarPiorSalto())) / 3;

		return mediaSaltosRestantes;
	}

	@Override
	public String toString() {

		DecimalFormat df = new DecimalFormat("####0.00");

		String infoDois = "Atleta: " + getNome() + "\n";
		infoDois += "Primeiro salto: " + saltos[0] + " m" + "\n";
		infoDois += "Segundo salto: " + saltos[1] + " m" + "\n";
		infoDois += "Terceiro salto: " + saltos[2] + " m" + "\n";
		infoDois += "Quarto salto: " + saltos[3] + " m" + "\n";
		infoDois += "Quinto salto: " + saltos[4] + " m" + "\n";
		infoDois += " " + "\n";
		infoDois += "Melhor salto: " + procurarMelhorSalto() + " m" + "\n";
		infoDois += "Pior salto: " + procurarPiorSalto() + " m" + "\n";
		infoDois += "Média dos demais saltos: " + df.format(calcularMediaSaltosRestantes()) + " m" + "\n";
		infoDois += " " + "\n";
		infoDois += "Resultado final: " + "\n";
		infoDois += getNome() + " : " + df.format(calcularMediaSaltosRestantes()) + " m" + "\n";

		return infoDois;

	}

}
