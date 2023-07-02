package curso.javaPoo.ConversaoDeUnidadesDeArea;

/*
Escreva a classe ConversaoDeUnidadesDeArea com
métodos estáticos para conversão das unidades de
área segundo a lista abaixo:

• 1 metro quadrado = 10.76 pés quadrados
• 1 pé quadrado = 929 centímetros quadrados
• 1 milha quadrada = 640 acres
• 1 acre = 43.560 pés quadrados
*/

import javax.swing.JOptionPane;

public class Main {
	
	static void imprimirTelaSqft(double num) {
		System.out.println(num + " ft² ");
	}
	
	static void imprimirTelaSqcm(double num) {
		System.out.println(num + " cm² ");
	}
	
	static void imprimirTelaAcre(double num) {
		System.out.println(num + " acre ");
	}
	
	

	public static void main(String[] args) {
	      
		String valor = JOptionPane.showInputDialog("Digite a medida:");
		
		double medida = Double.valueOf(valor);
		
		imprimirTelaSqft(ConversaoDeUnidadesDeArea.converterSqmParaSqft(medida));
		imprimirTelaSqft(ConversaoDeUnidadesDeArea.converterSqftParaSqcm(medida));
		imprimirTelaSqft(ConversaoDeUnidadesDeArea.converterSqmiParaAcre(medida));
		imprimirTelaSqft(ConversaoDeUnidadesDeArea.converterAcreParaSqft(medida));
		
	}

}
