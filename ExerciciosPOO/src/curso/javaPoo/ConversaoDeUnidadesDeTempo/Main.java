package curso.javaPoo.ConversaoDeUnidadesDeTempo;

/*
Escreva a classe ConversaoDeUnidadesDeTempo com
métodos estáticos para conversão aproximada das
unidades de velocidade segundo a lista abaixo:

• 1 minuto = 60 segundos
• 1 hora = 60 minutos
• 1 dia = 24 horas
• 1 semana = 7 dias
• 1 mês = 30 dias
• 1 ano = 365.25 dias
*/

import javax.swing.JOptionPane;

public class Main {
	
	static void imprimirTelaSeg(double num) {
		System.out.println(num + " s");
	}
	
	static void imprimirTelaMin(double num) {
		System.out.println(num + " min");
	}
	
	static void imprimirTelaHoras(double num) {
		System.out.println(num + " h");
	}
	
	static void imprimirTelaDias(double num) {
		System.out.println(num + " dias");
	}
	

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Digite a medida:");
        int medida = Integer.valueOf(valor);
        
        imprimirTelaSeg(ConversaoDeUnidadesDeTempo.converterMinParaSeg(medida));
        imprimirTelaMin(ConversaoDeUnidadesDeTempo.converterHoraParaMin(medida));
        imprimirTelaHoras(ConversaoDeUnidadesDeTempo.converterDiasParaHoras(medida));
        imprimirTelaDias(ConversaoDeUnidadesDeTempo.converterSemanasParaDias(medida));
        imprimirTelaDias(ConversaoDeUnidadesDeTempo.converterMesParaDias(medida));
        imprimirTelaDias(ConversaoDeUnidadesDeTempo.converterAnosParaDias(medida));

	}

}
