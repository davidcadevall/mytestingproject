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
