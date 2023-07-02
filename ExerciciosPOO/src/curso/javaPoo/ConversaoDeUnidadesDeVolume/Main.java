package curso.javaPoo.ConversaoDeUnidadesDeVolume;

/*
Escreva a classe ConversaoDeUnidadesDeVolume com
métodos estáticos para conversão das unidades de
volume segundo a lista abaixo:

• 1 litro = 1000 centímetros cúbicos
• 1 metro cúbico = 1000 litros
• 1 metro cúbico = 35.32 pés cúbicos
• 1 galão americano = 231 polegadas cúbicas
• 1 galão americano = 3.785 litros
*/

import javax.swing.JOptionPane;

public class Main {

	static void imprimirTelaCm3(double num) {
		System.out.println(num + " cm³");
	}

	static void imprimirTelaLitros(double num) {
		System.out.println(num + " L");
	}

	static void imprimirTelaFt3(double num) {
		System.out.println(num + " ft³");
	}

	static void imprimirTelaPlg3(double num) {
		System.out.println(num + " plg³");
	}

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Digite a medida:");
        double medida = Double.valueOf(valor);
        
        imprimirTelaCm3(ConversaoDeUnidadesDeVolume.converterLitroParaCm3(medida));
        imprimirTelaLitros(ConversaoDeUnidadesDeVolume.converterM3ParaLitros(medida));
        imprimirTelaFt3(ConversaoDeUnidadesDeVolume.converterM3ParaFt3(medida));
        imprimirTelaPlg3(ConversaoDeUnidadesDeVolume.converterGalParaPlg3(medida));
        imprimirTelaLitros(ConversaoDeUnidadesDeVolume.converterGalParaLitros(medida));

	}

}
