package MyTestingProject;

import static org.junit.Assert.*;

import org.junit.Test;

import MyTestingProject.Modelo.Juego;
import MyTestingProject.Modelo.Tablero;

public class JuegoTest {

	@Test
	public void testJuego() {
		Juego j = new Juego();
	}

	@Test
	public void testJugar() {
		Juego j = new Juego();
		Tablero t = new Tablero(5,5,false);
		
		j.jugar(t, 0, 3, 5, 5);
		
		//ALEATORIO 
		Juego j2 = new Juego();
		Tablero t2 = new Tablero(5,5,true);
		
		// CASO 0 2
		j2.jugar(t2, 0, 2, 5, 5);
		
		// CAMBIANDO LOS INTENTOS
		j2.setIntento(4);
	
		// CASO 0 0 
		j2.jugar(t2, 0, 0, 5, 5);
		// CASO  3 0 
		j2.jugar(t2, 3, 0, 5, 5);
		
		// CASO  3 3 
		j2.jugar(t2, 3,3, 5, 5);
		
		// CASO  3 3 
		j2.jugar(t2, 3,3, 5, 5);
		
		// CASO  3 3 
		j2.jugar(t2, 3,3, 5, 5);
		
		////HASTA AQUI PARA CUBRIR LOS MAX DE INTENTOS
		
		
		// CAMBIANDO LOS INTENTOS
		j2.setIntento(20);
		
		
		
		
		
	}

	@Test
	public void testGetIntento() {
		Juego j = new Juego();
		int intentos=j.getIntento();
		assertEquals(intentos,40);
	}

	@Test
	public void testGetMinas() {
		Juego j = new Juego();
		int minas=j.getMinas();
		assertEquals(minas,10);
	}

}
