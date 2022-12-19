package java_excepciones_casos;

public class Prueba {
	public static void main(String[] args) {

		String nombre = "Alura";
		System.out.println("ANTES");

		try {
			System.out.println(nombre);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("CATCH");
		}

		System.out.println("DESPUES");
	}

}
