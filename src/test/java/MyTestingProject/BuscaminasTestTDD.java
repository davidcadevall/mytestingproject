package MyTestingProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.Test;

import MyTestingProject.Controlador.Buscaminas;
import MyTestingProject.Controlador.BuscaminasTDD;
import MyTestingProject.Modelo.Juego;
import MyTestingProject.Modelo.JuegoTDD;
import MyTestingProject.Modelo.Tablero;
import MyTestingProject.Modelo.TableroTDD;

class BuscaminasTDDTest {


	@Test
	void testGetTablero() {
		System.out.println(" ---------------------------------------- ");
		System.out.println(" INICIO TEST GET TABLERO TDD");
		MockVistaTDD mcv=new MockVistaTDD();
		BuscaminasTDD juego=new BuscaminasTDD(mcv);
		String[] argss=null;
		BuscaminasTDD.main(argss);
		TableroTDD test=juego.getTablero();
		assertEquals("Tiene que salir 20",20,test.getHorizontal());
		assertEquals("Tiene que salir 20",20,test.getVertical());
	}

	@Test
	void testMain() {
		System.out.println(" ---------------------------------------- ");
		System.out.println(" INICIO TEST MAIN TDD");
		/// TEST GANAR PARTIDA
				MockVistaTDD mcv=new MockVistaTDD();
				BuscaminasTDD juego=new BuscaminasTDD(mcv);
				String[] argss=null;
				BuscaminasTDD.main(argss);
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
				
				/// TEST Loop simple posicion equivocada entra 2 veces condicionado por el numero de intentos
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
		System.out.println(" ---------------------------------------- ");
		System.out.println(" INICIO TEST COMPRUEBA GANADOR TDD");
	
		JuegoTDD j=new JuegoTDD();
		
		j.setMinas(0);
		// TEST SIN JUEGO DEBERIA SER GANADOR PORQUE NO HAY MINAS
		

		BuscaminasTDD.compruebaGanador(j);
		System.out.println(" DEBERIA SALIR GANASTE");
		System.out.println(" ---------------------------------------- ");
	
		// TEST SIN JUEGO DEBERIA SER PERDISTE PORQUE NO HAY MINAS
		j.setMinas(4);
		j.setIntento(0);
		BuscaminasTDD.compruebaGanador(j);
		System.out.println(" DEBERIA SALIR PERDISTE PORQUE NO HAY INTENTOS ");
		
		
		System.out.println(" ---------------------------------------- ");
		
		// TEST SIN JUEGO DEBERIA SER PERDISTE PORQUE NO HAY MINAS
		j.setMinas(5);
		j.setIntento(4);
		BuscaminasTDD.compruebaGanador(j);
		System.out.println(" DEBERIA SALIR PERDISTE PORQUE NO HAY INTENTOS PERO TE QUEDARON MINAS");
		
		

		// TEST SIN JUEGO NO DEBERIA SALIR NADA
		j.setMinas(5);
		j.setIntento(7);
		BuscaminasTDD.compruebaGanador(j);
		System.out.println(" NO DEBERIA SALIR NADA ");
		
		
		
		
		
	}

	@Test
	void testEmpezarJuego() {
		
		System.out.println(" ---------------------------------------- ");
		System.out.println(" INICIO TEST EMPEZAR JUEGO TDD");
		
		JuegoTDD j=new JuegoTDD();
		
		MockVistaTDD mcv=new MockVistaTDD();
		BuscaminasTDD juego=new BuscaminasTDD(mcv);
		mcv.setHorizontal(5);
		mcv.setVertical(5);
		mcv.setPosX(1);
		mcv.setposY(2);
		j.setIntento(1);

		// TEST VALOR LIMIT FRONTERA POS X
		BuscaminasTDD.empezarJuego(5, 5,j);
		
		System.out.println(" VALOR LIMIT POS X DEBERIA SALIR ERROR ");
		// TEST VALOR LIMIT FRONTERA POS Y
		j.setIntento(1);
		mcv.setPosX(5);
		mcv.setposY(1);
		BuscaminasTDD.empezarJuego(5, 5,j);
		System.out.println(" VALOR LIMIT POS Y DEBERIA SALIR ERROR ");

		
		// TEST VALOR LIMIT FRONTERA POS X SUPERIOR
		j.setIntento(1);
		mcv.setPosX(2);
		mcv.setposY(2);
		BuscaminasTDD.empezarJuego(5, 5,j);
		
		System.out.println(" VALOR LIMIT POS X DEBERIA SALIR OK ");
		// TEST VALOR LIMIT FRONTERA POS Y SUPERIOR
		j.setIntento(1);
		mcv.setPosX(5);
		mcv.setposY(2);
		BuscaminasTDD.empezarJuego(5, 5,j);
		System.out.println(" VALOR LIMIT POS Y DEBERIA SALIR OK ");

		
		// TEST VALOR LIMIT FRONTERA POS X INFERIOR
		j.setIntento(1);
		mcv.setPosX(0);
		mcv.setposY(2);
		BuscaminasTDD.empezarJuego(5, 5,j);
		
		System.out.println(" VALOR LIMIT POS X DEBERIA SALIR ERROR ");
		// TEST VALOR LIMIT FRONTERA POS Y INFERIOR
		j.setIntento(1);
		mcv.setPosX(4);
		mcv.setposY(0);
		BuscaminasTDD.empezarJuego(5, 5,j);
		System.out.println(" VALOR LIMIT POS Y DEBERIA SALIR ERROR ");

		
		
		
		// TEST VALOR LIMIT HORIZONTAL
		j.setIntento(1);
		mcv.setPosX(6);
		mcv.setposY(1);
		
		BuscaminasTDD.empezarJuego(5, 5,j);
		System.out.println(" VALOR LIMIT HORIZONTAL DEBERIA SALIR ERROR ");

		// TEST VALOR LIMIT VERTICAL
				j.setIntento(1);
				mcv.setPosX(3);
				mcv.setposY(6);
				
				BuscaminasTDD.empezarJuego(5, 5,j);
				System.out.println(" VALOR LIMIT VERTICAL DEBERIA SALIR ERROR ");

		// TEST NORMAL intentos maximos
				j.setIntento(0);
				mcv.setPosX(3);
				mcv.setposY(3);
				
				BuscaminasTDD.empezarJuego(5, 5,j);
				BuscaminasTDD.empezarJuego(5, 5,j);
				System.out.println(" MAXIM INTENTS ");
	
				
				
	}

}

