package curso.javaPoo.ConversaoDeUnidadesDeVolume;

public class ConversaoDeUnidadesDeVolume {

	public static double converterLitroParaCm3(double medida) {

		System.out.print(medida + " L = ");
		return medida * 1000;

	}
	
	public static double converterM3ParaLitros(double medida) {

		System.out.print(medida + " m³ = ");
		return medida * 1000;

	}
	
	public static double converterM3ParaFt3(double medida) {

		System.out.print(medida + " m³ = ");
		return medida * 35.32;

	}
	
	public static double converterGalParaPlg3(double medida) {

		System.out.print(medida + " gal = ");
		return medida * 231;

	}
	
	public static double converterGalParaLitros(double medida) {

		System.out.print(medida + " gal = ");
		return medida * 3.785;

	}

}
