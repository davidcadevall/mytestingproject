package MyTestingProject;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * The Class Buscaminas.
 * 
 * 
 * 
 *         Buscaminas para consola. Está disponible en dos idiomas, inglés y
 *         castellano. Permite introducir valores personalizados o elegir
 *         tablero por defecto. El fichero de records es único para ambos
 *         idiomas, para mantener la consistencia.
 * 
 *         Los records los ordena por tiempo, y almacena el nombre y el número
 *         de movimientos. Se almacenan en un fichero, por lo que son
 *         recuperables en próximas ejecuciones.
 * 
 *         En próximas versiones se implementará un visor de records online y
 *         una gestión de errores más eficiente.
 * 
 */
public class Buscaminas {

    /** The castellano. */
    public static boolean castellano = false;

 

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws Exception
     *             the exception
     */
    public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	boolean corriendo = true;
	boolean corriendo2 = true;
	boolean corriendo3 = true;
	boolean start = true;
	boolean partidaMenu = true;
	int dimensiones = 0;
	int dimensiones2 = 0;
	int numeroMinas = 0;

	// Selector de idioma básico
	while (corriendo3) {
	

	 
	    String nombre;

	    // Solicitud del nombre de usuario para el record
	    System.out.println("Por favor, introduce tu nombre");
	    System.out.println("Please, input your name");
	    nombre = br.readLine();
	    do {
		// Menú castellano
		    castellano = true;
		    while (corriendo) {
			corriendo2 = true;
			System.out.println("Escoge una opción (a, b)");
			System.out.println("a) Empezar partida");
			System.out.println("b) Salir");
	

			String linea = br.readLine();

			do {
			    // Tableros por defecto o personalizado
			    if (linea.equals("a")) {
				System.out
					.println("Introduzca las dimensiones del tablero y la cantidad de minas\na) Principiante: 10 minas y 9x9\nb) Intermedio: 40 minas y 16x16\nc) Avanzado: 99 minas y 16x30\nd) Personalizado: introduce tus propios valores\ne) Volver al menú principal");
				String lineaPartida = br.readLine();
				do {
				    if (lineaPartida.equals("a")) {
					// Dimensiones del tablero por defecto.
					// Se replica en los siguientes
					dimensiones = 9;
					dimensiones2 = 9;
					numeroMinas = 10;
					// Inicio del tiempo de juego para el
					// record
					long inicioJuego = System.nanoTime();
					// Creación del tablero de juego
					TableroJuego juego = new TableroJuego(
						dimensiones, dimensiones2,
						numeroMinas);
					// Fin del tiempo de partida
					long tiempoJuego = System.nanoTime()
						- inicioJuego;
					// Si la partida terminó en victoria, se
					// escribe el record
				
				    }
				    if (lineaPartida.equals("b")) {
					dimensiones = 16;
					dimensiones2 = 16;
					numeroMinas = 40;
					long inicioJuego = System.nanoTime();
					TableroJuego juego = new TableroJuego(
						dimensiones, dimensiones2,
						numeroMinas);
					long tiempoJuego = System.nanoTime()
						- inicioJuego;
				

				    }
				    if (lineaPartida.equals("c")) {
					dimensiones = 16;
					dimensiones2 = 30;
					numeroMinas = 99;
					long inicioJuego = System.nanoTime();
					TableroJuego juego = new TableroJuego(
						dimensiones, dimensiones2,
						numeroMinas);
					long tiempoJuego = System.nanoTime()
						- inicioJuego;
				
				    }
				    if (lineaPartida.equals("d")) {
					// Personalizado, se solicitan los datos
					// al usuario
					System.out
						.println("Introduzca las dimensiones del lado 1 (Hasta 100)");
					dimensiones = (Integer.parseInt(br
						.readLine()));
					if (dimensiones > 100) {
					    System.err
						    .println("Error. Máximo 100, por favor\n");
					    break;
					}
					System.out
						.println("Introduzca las dimensiones del lado 2 (Hasta 100)");
					dimensiones2 = (Integer.parseInt(br
						.readLine()));
					if (dimensiones2 > 100) {
					    System.err
						    .println("Error. Máximo 100, por favor\n");
					    break;
					}
					System.out
						.println("Introduzca el número de minas");
					numeroMinas = (Integer.parseInt(br
						.readLine()));
					if (numeroMinas >= dimensiones
						* dimensiones2) {
					    System.err
						    .println("Error. Todas las casillas serán minas, la victoria es imposible\n");
					    break;
					}
					long inicioJuego = System.nanoTime();
					TableroJuego juego = new TableroJuego(
						dimensiones, dimensiones2,
						numeroMinas);
					long tiempoJuego = System.nanoTime()
						- inicioJuego;
				
				    }
				    if (lineaPartida.equals("e")) {
					// Volver al menú principal
					partidaMenu = false;
					corriendo2 = false;
				    }
				    partidaMenu = false;
				} while (partidaMenu);

			    }
			 
			
			    if (linea.equals("b")) {
				// Salir del programa
				corriendo3 = false;
				start = false;
				corriendo = false;
				corriendo2 = false;
			    }

			    // Error en la selección, pausa y regreso al menú
			    if (!(linea.equals("a") || linea.equals("b")
				   )) {
				System.err
					.println("Error. Por favor, introduce a, b");
				try {
				    Thread.sleep(2000);
				} catch (InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
				corriendo2 = false;
			    }
			} while (corriendo2);

		    }
		
	

	    } while (start == true);
	}
    }
}
