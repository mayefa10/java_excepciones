package java_excepciones_casos;

public class TestCuentaExceptionCheck{

		public static void main(String[] args) {
			Cuenta cuenta = new Cuenta();
			try {
				cuenta.deposita();
			} catch (MeException e) {
				
				e.printStackTrace();
			}
		}
}
