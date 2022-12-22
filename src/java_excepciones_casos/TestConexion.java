package java_excepciones_casos;

public class TestConexion {

	public static void main(String[] args) {
		try (Conexion conexion = new Conexion()) {
			conexion.leerDatos();
		} catch (IllegalStateException ex) {
			System.out.println("Surgió un error en la conexión ");
		}
	}
}
/*
 * try{ Conexion con = new Conexion(); con.leerDatos(); con.cerrar(); }
 * catch(IllegalStateException ex){
 * System.out.println("Surgio un error en la conexión"); }
 * 
 * 
 * Conexion con = null; try{ con = new Conexion(); con.leerDatos();
 * con.cerrar(); } catch(IllegalStateException ex){
 * System.out.println("Surgio un error en la conexión "); } finally {
 * con.cerrar(); } }}
 */
