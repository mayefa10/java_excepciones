

package java_excepciones_casos;



public class Conexion implements AutoCloseable{

    public Conexion() {
        System.out.println("Abriendo Conexion");
    }

    public void leerDatos() {
        System.out.println("Recibiendo datos");
            throw new IllegalStateException();
    }

    @Override
    public void close() {
        System.out.println("Cerrando Conexion");
    }
}