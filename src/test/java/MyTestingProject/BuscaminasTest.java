package MyTestingProject;

import static org.junit.Assert.*;

import org.junit.Test;

import MyTestingProject.Controlador.Buscaminas;
import MyTestingProject.Modelo.Tablero;

public class BuscaminasTest {

	
	@SuppressWarnings("static-access")
	@Test
	public void testMain() {
		System.out.println(" ---------------------------------------- ");
		System.out.println(" INICIO TEST MAIN BUSCAMINASTEST");
		
		/// TEST GANAR PARTIDA
		MockVista mcv=new MockVista();
		Buscaminas juego=new Buscaminas(mcv);
		String[] argss=null;
		Buscaminas.main(argss);
		
		
		
		
		/// TEST PIERDE PARTIDA
		mcv.setPosX(2);
		mcv.setPosX(2);
		mcv.setIntentos(1);
		juego=new Buscaminas(mcv);
		Buscaminas.main(argss);
		
		System.out.println(" FIN TEST PERDER PARTIDA");
		
		// TEST Loop simple posicion equivocada al estar condicionado por el numero de intentos 
		//podemos forzar que sea 0, 1, n veces 
		
		
		/// TEST Loop simple posicion equivocada entra 0 veces
				mcv.setIntentos(0);
				mcv.setPosX(-3);
				mcv.setposY(-3);
				juego=new Buscaminas(mcv);
				Buscaminas.main(argss);
				System.out.println(" FIN TEST LOOP POSICION EQUIVOCADA 0 VECES");
		
		/// TEST Loop simple posicion equivocada entra 1 vez
		mcv.setIntentos(1);
		mcv.setPosX(-3);
		mcv.setposY(-3);
		juego=new Buscaminas(mcv);
		Buscaminas.main(argss);
		System.out.println(" FIN TEST LOOP POSICION EQUIVOCADA 1 VEZ");
		
		/// TEST Loop simple posicion equivocada entra 2 veces condicionado por el numero de intentos
		mcv.setIntentos(2);
		mcv.setPosX(20);
		mcv.setposY(20);
		juego=new Buscaminas(mcv);
		Buscaminas.main(argss);
		
		System.out.println(" FIN TEST LOOP POSICION EQUIVOCADA 2 VECES");
		
		/// TEST Loop simple intentos superior a minas 
		mcv.setIntentos(3);
		mcv.setPosX(4);
		mcv.setposY(4);
		juego=new Buscaminas(mcv);
		Buscaminas.main(argss);
		System.out.println(" FIN TEST LOOP INTENTOS SUPERIORES 3 VECES");
		
		
		// TEST Loop simple creacion tablero crea el tablero 1 vez o n veces 
		
		// TEST Loop simple creacion tablero 1 vez
		mcv.setHorizontal(5);
		mcv.setVertical(5);
		mcv.setIntentos(1);
		mcv.setPosX(2);
		mcv.setPosX(2);
		juego=new Buscaminas(mcv);
		Buscaminas.main(argss);
		System.out.println(" FIN TEST CREACION TABLERO 1 VEZ");
		
		
		// TEST Loop simple creacion tablero 3 veces
		
		
		mcv.setHorizontal(2);
		mcv.setVertical(2);
		juego=new Buscaminas(mcv);
		Buscaminas.main(argss);
		System.out.println(" FIN TEST CREACION TABLERO 3 VECES");
		
		
		System.out.println(" ---------------------------------------- ");
		System.out.println(" FIN TEST MAIN BUSCAMINASTEST");
		
	}

}
