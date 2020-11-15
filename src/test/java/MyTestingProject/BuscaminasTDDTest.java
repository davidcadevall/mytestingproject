package MyTestingProject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MyTestingProject.Controlador.Buscaminas;
import MyTestingProject.Controlador.BuscaminasTDD;
import MyTestingProject.Modelo.Tablero;
import MyTestingProject.Modelo.TableroTDD;

class BuscaminasTDDTest {


	@Test
	void testGetTablero() {
		fail("Not yet implemented");
	}

	@Test
	void testMain() {
		/// TEST GANAR PARTIDA
				MockVistaTDD mcv=new MockVistaTDD();
				BuscaminasTDD juego=new BuscaminasTDD(mcv);
				String[] argss=null;
				BuscaminasTDD.main(argss);
				TableroTDD test=juego.getTablero();
				assertEquals("Tiene que salir 20",20,test.getHorizontal());
				assertEquals("Tiene que salir 20",20,test.getVertical());
				System.out.println(" FIN TEST GANAR PARTIDA");
				
				/// TEST PIERDE PARTIDA
				mcv.setPosX(25);
				mcv.setPosX(25);
				mcv.setIntentos(1);
				juego=new BuscaminasTDD(mcv);
				BuscaminasTDD.main(argss);
				
				System.out.println(" FIN TEST PERDER PARTIDA");
				
				/// TEST Loop simple posicion equivocada entra 1 vez
				mcv.setIntentos(1);
				mcv.setPosX(30);
				mcv.setposY(30);
				juego=new BuscaminasTDD(mcv);
				BuscaminasTDD.main(argss);
				System.out.println(" FIN TEST LOOP POSICION EQUIVOCADA 1 VEZ");
				
				/// TEST Loop simple posicion equivocada entra 2 veces condicionado por el número de intentos
				mcv.setIntentos(2);
				mcv.setPosX(-20);
				mcv.setposY(-20);
				juego=new BuscaminasTDD(mcv);
				BuscaminasTDD.main(argss);
				System.out.println(" FIN TEST LOOP POSICION EQUIVOCADA 2 VECES");
				
				/// TEST Loop simple intentos superior a minas 
				
				
				mcv.setIntentos(5);
				mcv.setPosX(5);
				mcv.setposY(5);
				juego=new BuscaminasTDD(mcv);
				BuscaminasTDD.main(argss);
				System.out.println(" FIN TEST LOOP INTENTOS SUPERIORES 2 VECES");
	
				
				// TEST Loop simple creacion tablero 1 vez
				mcv.setHorizontal(45);
				mcv.setVertical(45);
				mcv.setIntentos(1);
				mcv.setPosX(40);
				mcv.setPosX(40);
				juego=new BuscaminasTDD(mcv);
				BuscaminasTDD.main(argss);
				System.out.println(" FIN TEST CREACION TABLERO 1 VEZ");
				
	
				// TEST Loop simple creacion tablero 3 veces
				
				
				mcv.setHorizontal(0);
				mcv.setVertical(0);
				juego=new BuscaminasTDD(mcv);
				BuscaminasTDD.main(argss);
				System.out.println(" FIN TEST CREACION TABLERO 3 VECES");

				
				// TEST limite frontera movimientos para tablero 40x40 
				// posicion x =40
				//posicion y=40
				mcv.setHorizontal(40);
				mcv.setVertical(40);
				mcv.setIntentos(1);
				mcv.setPosX(40);
				mcv.setposY(40);
				juego=new BuscaminasTDD(mcv);
				BuscaminasTDD.main(argss);
				
				System.out.println(" FIN TEST LIMITE X=40 Y=40");
				// limite inferior
				// posicion x =39
				//posicion y=39
				mcv.setPosX(39);
				mcv.setposY(39);
				juego=new BuscaminasTDD(mcv);
				BuscaminasTDD.main(argss);
				System.out.println(" FIN TEST LIMITE X=39 Y=39");
				// limite superior
				// posicion x =41
				//posicion y=41
				mcv.setPosX(41);
				mcv.setposY(41);
				juego=new BuscaminasTDD(mcv);
				BuscaminasTDD.main(argss);
						
				System.out.println(" FIN TEST LIMITE X=41 Y=41");
				
	}

	@Test
	void testCompruebaGanador() {
		fail("Not yet implemented");
	}

	@Test
	void testEmpezarJuego() {
		fail("Not yet implemented");
	}

}
