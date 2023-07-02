package curso.javaPoo.Contador;

public class Contador {

	
		private static int i;

		

		public static void incrementar() {
			i++;
		}

		public static void zerar() {
			i = 0;
		}

		public static int obterValor() {
			return i;
		}
}