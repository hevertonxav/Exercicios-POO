package curso.javaPoo.Lampada;

/*
Escreva	uma classe para	representar	uma	lâmpada	que	está	à	venda	em	
um	supermercado.
*/



public class Main {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();

		lampada.tipos = new String[3];
		lampada.tipos[0] = "LED";
		lampada.tipos[1] = "fluorescente";
		lampada.tipos[2] = "incandescente";

		lampada.modelo = "A60";
		lampada.base = "E27";
		lampada.potencia = 9;
		lampada.equivalencia.incandescente = 60;
		lampada.equivalencia.cfl = 16;
		lampada.temperaturaCor = 6500;
		lampada.fluxoLuminoso = 810;
		lampada.vidaUtilHoras = 25000;

		System.out.println("Tipo de lâmpada: " + lampada.tipos[0]);
		System.out.println("Modelo: " + lampada.modelo);
		System.out.println("Base: " + lampada.base);
		System.out.println("Potência: " + lampada.potencia + "W");
		System.out.println("Equivalencia:  incandescente - " + lampada.equivalencia.incandescente + "W  CFL - "
				+ lampada.equivalencia.cfl + "W");
		System.out.println("Temperatura de cor: " + lampada.temperaturaCor + "K");
		System.out.println("Fluxo luminoso: " + lampada.fluxoLuminoso + "lm");
		System.out.println("Vida útil: " + lampada.vidaUtilHoras + "h");

	}

}
