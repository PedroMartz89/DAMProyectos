import ejJDBCdao.Jdbc;

/**
 * Clase principal que contiene el método main para ejecutar la aplicación.
 */
public class Main {

	/**
	 * Método principal que inicia la ejecución de la aplicación.
	 * @param args Argumentos de la línea de comandos.
	 */
	public static void main(String[] args) {
		//Para probar JDBC
		Jdbc jdbc = new Jdbc();
		//jdbc.listarDatosTodasTablas();
//		jdbc.darLibroDeAlta();
//		jdbc.eliminarEscritor();
		jdbc.mostrarLibrosEscritor();
		
		//Para probar Ficheros
//		String rutaFicheroTxt = "src/fichero.txt"; //poner ruta fichero txt
//		String rutaFicheroBinario = "src/registros.dat"; // poner ruta fichero binario
//		int identificadorRegistro = 2; //id del registro
//
//		Ficheros ficheros = new Ficheros();
//		ficheros.copiarFicheroTxt2Raf(rutaFicheroTxt, rutaFicheroBinario);
//		ficheros.listarRegistros(rutaFicheroBinario);
//		Registro r = ficheros.buscarRegistroPorCodigo(rutaFicheroBinario, identificadorRegistro);
//        System.out.println(r);
	}

}
