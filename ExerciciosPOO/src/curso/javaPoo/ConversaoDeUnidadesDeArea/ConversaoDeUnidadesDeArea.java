package curso.javaPoo.ConversaoDeUnidadesDeArea;

public class ConversaoDeUnidadesDeArea {

	public static double converterSqmParaSqft(double medida) {
        
		System.out.print(medida + " m² = ");
        return medida * 10.76;

	}

	public static double converterSqftParaSqcm(double medida) {

		System.out.print(medida + " ft² = ");
        return medida * 929;

	}

	public static double converterSqmiParaAcre(double medida) {

		System.out.print(medida + " mi² = ");
        return medida * 640;

	}
	
	public static double converterAcreParaSqft(double medida) {

		System.out.print(medida + " acre = ");
		return medida * 43560;

	}

}
