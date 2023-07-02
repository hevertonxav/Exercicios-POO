package curso.javaPoo.LigaDesligaLampada;

/*
 Escreva uma classe para representar uma lâmpada. Desenvolva
métodos para ligar e desligar a lampada.
*/

public class Main {

	public static void main(String[] args) {

		LigaDesligaLampada lampada = new LigaDesligaLampada();

		lampada.ligarLampada();

		System.out.println("Lâmpada está " + (lampada.lampadaLigada ? "ligada" : "desligada"));

		lampada.desligarLampada();

		System.out.println("Lâmpada está " + (lampada.lampadaLigada ? "ligada" : "desligada"));

	}

}
