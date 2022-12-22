package java_excepciones_casos;

public class Flujo {

	public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fin de main");
    }

    private static void metodo1() {
        System.out.println("Inicio de metodo1");
        try {
            metodo2();
        } catch(MeException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fin de metodo1");
    }

    private static void metodo2() throws MeException {
        System.out.println("Inicio de metodo2");
        throw new ArithmeticException("dio error");
        // System.out.println("Fin de metodo2");
    }

	
}
