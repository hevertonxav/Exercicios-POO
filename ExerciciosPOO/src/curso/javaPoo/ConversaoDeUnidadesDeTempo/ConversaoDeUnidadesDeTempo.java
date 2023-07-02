package curso.javaPoo.ConversaoDeUnidadesDeTempo;

public class ConversaoDeUnidadesDeTempo {
	
	public static int converterMinParaSeg(int medida) {

		System.out.print(medida + " min = ");
		return medida * 60;

	}
	
	public static int converterHoraParaMin(int medida) {

		System.out.print(medida + " h = ");
		return medida * 60;

	}
	
	public static int converterDiasParaHoras(int medida) {

		System.out.print(medida + " dia(s) = ");
		return medida * 24;

	}
	
	public static int converterSemanasParaDias(int medida) {

		System.out.print(medida + " semanas = ");
		return medida * 7;

	}
	
	public static int converterMesParaDias(int medida) {

		System.out.print(medida + " meses = ");
		return medida * 30;

	}
	
	public static double converterAnosParaDias(int medida) {

		System.out.print(medida + " anos = ");
		return medida * 365.25;

	}

}
