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
		Tablero t = new Tablero(6,6,false,10);
		
		//NO ALEATORIO
				System.out.print(" Test tiene que salir bomba");
				j.jugar(t, 1, 1, 5, 5);
		
	
				System.out.print(" Test no tiene que salir bomba, 5 alrededor");
				j.jugar(t, 3, 2, 5, 5);
				
				System.out.print(" Test no tiene que salir bomba, 0 alrededor");
				j.jugar(t, 1, 5, 5, 5);

				//ALEATORIO 
				Juego j2 = new Juego();
				Tablero t2 = new Tablero(5,5,true,10);
				
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
				
				j2.jugar(t2, 3, 4, 5, 5);
				
				System.out.print(" Test no hay intento, no printa nada");
				// CASO  3 3 
				j2.jugar(t2, 3,3, 5, 5);
				
				////HASTA AQUI PARA CUBRIR LOS MAX DE INTENTOS
				
				
		
		
		
	}

	@Test
	public void testGetIntento() {
		Juego j = new Juego();
		int intentos=j.getIntento();
		assertEquals(intentos,40);	
		
		j.setIntento(20);
		intentos=j.getIntento();
		assertEquals(intentos,20);	
		
		j.setIntento(0);
	    intentos=j.getIntento();
		assertEquals(intentos,0);	
		
		Juego j2 = new Juego();
		Tablero t2 = new Tablero(5,5,false,10);
		j2.setIntento(10);
		j2.jugar(t2, 3, 3, 5, 5);
		
	    intentos=j2.getIntento();
		
		assertEquals(intentos,9);
	}


	@Test
	public void testGetMinas() {
	   Juego j = new Juego();
		int minas=j.getMinas();
		assertEquals(minas,10);
		
		Tablero t2 = new Tablero(5,5,false,10);
		
		j.jugar(t2, 1, 1, 5, 5);
		
		minas=j.getMinas();
		assertEquals(minas,9);
		
		
		j.jugar(t2, 4, 4, 5, 5);
		
		minas=j.getMinas();
		assertEquals(minas,9);
		
	}
}
