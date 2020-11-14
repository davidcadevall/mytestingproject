package MyTestingProject;

import static org.junit.Assert.*;

import org.junit.Test;

import MyTestingProject.Controlador.Buscaminas;
import MyTestingProject.Modelo.Tablero;

public class BuscaminasTest {

	@SuppressWarnings("static-access")
	@Test
	public void testMain() {
		
		/// TEST GANAR PARTIDA
		MockVista mcv=new MockVista();
		Buscaminas juego=new Buscaminas(mcv);
		String[] argss=null;
		Buscaminas.main(argss);
		Tablero test=juego.getTablero();
		
		assertEquals("Tiene que salir 9",9,test.getHorizontal());
		assertEquals("Tiene que salir 9",9,test.getVertical());
		System.out.println(" FIN TEST GANAR PARTIDA");
		
		
		/// TEST PIERDE PARTIDA
		mcv.setPosX(2);
		mcv.setPosX(2);
		mcv.setIntentos(1);
		juego=new Buscaminas(mcv);
		Buscaminas.main(argss);
		
		System.out.println(" FIN TEST PERDER PARTIDA");
		
		/// TEST Loop simple posicion equivocada entra 1 vez
		mcv.setIntentos(1);
		mcv.setPosX(-3);
		mcv.setposY(-3);
		juego=new Buscaminas(mcv);
		Buscaminas.main(argss);
		System.out.println(" FIN TEST LOOP POSICION EQUIVOCADA 1 VEZ");
		
		/// TEST Loop simple posicion equivocada entra 2 veces condicionado por el número de intentos
		mcv.setIntentos(2);
		mcv.setPosX(20);
		mcv.setposY(20);
		juego=new Buscaminas(mcv);
		Buscaminas.main(argss);
		
		System.out.println(" FIN TEST LOOP POSICION EQUIVOCADA 2 VECES");
		
		/// TEST Loop simple intentos superior a minas 
		mcv.setIntentos(2);
		mcv.setPosX(3);
		mcv.setposY(3);
		juego=new Buscaminas(mcv);
		Buscaminas.main(argss);
		System.out.println(" FIN TEST LOOP INTENTOS SUPERIORES 2 VECES");
		
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
		
		
		// TEST limite frontera movimientos para tablero 5x5 
		// posicion x =5 
		//posicion y=5
		mcv.setHorizontal(5);
		mcv.setVertical(5);
		mcv.setIntentos(1);
		mcv.setPosX(5);
		mcv.setposY(5);
		juego=new Buscaminas(mcv);
		Buscaminas.main(argss);
		
		System.out.println(" FIN TEST LIMITE X=5 Y=5");
		// limite inferior
		// posicion x =4
		//posicion y=4
		mcv.setPosX(4);
		mcv.setposY(4);
		juego=new Buscaminas(mcv);
		Buscaminas.main(argss);
		System.out.println(" FIN TEST LIMITE X=4 Y=4");
		// limite superior
		// posicion x =6
		//posicion y=6
		mcv.setPosX(6);
		mcv.setposY(6);
		juego=new Buscaminas(mcv);
		Buscaminas.main(argss);
				
		System.out.println(" FIN TEST LIMITE X=6 Y=6");
		
	}

}
