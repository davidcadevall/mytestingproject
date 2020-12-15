package MyTestingProject;

import static org.junit.Assert.*;

import org.junit.Test;

import MyTestingProject.Modelo.Juego;
import MyTestingProject.Modelo.Tablero;
/*
public class JuegoTest {

	@Test
	public void testJugar() {
		Juego j = new Juego();
		Tablero t = new Tablero(6,6,false,10);
		
		System.out.println("---------------------------------");
		System.out.println("INICIO TEST JUGAR");
		System.out.println("NO ALEATORIO");
		//NO ALEATORIO
				System.out.print(" Test tiene que salir mina");
				j.jugar(t, 0, 0, 6, 6);
		
	
				System.out.print(" Test no tiene que salir mina, 3 alrededor");
				j.jugar(t, 2, 2, 6, 6);
				
				System.out.print(" Test no tiene que salir mina, 0 alrededor");
				j.jugar(t, 1, 4, 6, 6);
				System.out.println("ALEATORIO");
				//ALEATORIO 
				Juego j2 = new Juego();
				Tablero t2 = new Tablero(5,5,true,10);
				System.out.println(" CASO x=0 y=2");
				// CASO 0 2
				j2.jugar(t2, 0, 2, 5, 5);
				
				// CAMBIANDO LOS INTENTOS
				j2.setIntento(4);
				System.out.println(" CASO x=0 y=0");
				// CASO 0 0 
				j2.jugar(t2, 0, 0, 5, 5);
				
				System.out.println(" CASO x=3 y=0");
				// CASO  3 0 
				j2.jugar(t2, 3, 0, 5, 5);
				
				System.out.println(" CASO x=3 y=3");
				// CASO  3 3 
				j2.jugar(t2, 3,3, 5, 5);
				
				System.out.println(" CASO x=3 y=4");
				
				j2.jugar(t2, 3, 4, 5, 5);
				
				System.out.println(" Test no hay intento, no printa nada");
				// CASO  3 3 
				j2.jugar(t2, 3,3, 5, 5);
				
				////HASTA AQUI PARA CUBRIR LOS MAX DE INTENTOS
				
				System.out.println("---------------------------------");
				System.out.println("INICIO PATH COVERAGE");
				j2.setIntento(11);
				
				// PATH 1 el jugador acierta todas las minas 
				Tablero tpath = new Tablero(5,5,false,10);
				j2.jugar(tpath, 0, 0, 5, 5);
				j2.jugar(tpath, 0, 1, 5, 5);
				j2.jugar(tpath, 1, 0, 5, 5);
				j2.jugar(tpath, 1, 1, 5, 5);
				j2.jugar(tpath, 2, 0, 5, 5);
				j2.jugar(tpath, 2, 1, 5, 5);
				j2.jugar(tpath, 2, 2, 5, 5);
				j2.jugar(tpath, 3, 0, 5, 5);
				j2.jugar(tpath, 3, 1, 5, 5);
				j2.jugar(tpath, 4, 0, 5, 5);	
				
				System.out.println(" GANA. Tendria que salir que le quedan en total 0 minas por lo tanto ha ganado");
				
				
				// PATH 2   el jugador pierde porque no le quedan intentos 
				tpath = new Tablero(5,5,false,10);
				j2= new Juego();
				j2.setIntento(1);
				j2.jugar(tpath, 0, 0, 5, 5);
				System.out.println(" PIERDE. Tendria que salir que no le quedan intentos por tanto ha perdido");
				
				// PATH 3   el jugador pierde porque tiene mas minas que intentos
				tpath = new Tablero(5,5,false,10);
				j2= new Juego();
				j2.setIntento(6);
				j2.jugar(tpath, 0, 0, 5, 5);
				j2.jugar(tpath, 0, 1, 5, 5);
				j2.jugar(tpath, 1, 0, 5, 5);
				j2.jugar(tpath, 1, 1, 5, 5);
				System.out.println(" PIERDE. Tendria que salir que le quedan 6 minas por encontrar y que tiene 2 intentos");
				
				
	}			

	@Test
	public void testGetIntento() {
		
		System.out.println("---------------------------------");
		System.out.println("INICIO TEST INTENTOS");
		Juego j = new Juego();
		
		//Intentos maximos al iniciar la partida
		
		int intentos=j.getIntento();
		assertEquals(intentos,40);	
		// Intentos entre 40 y 0 
		j.setIntento(20);
		intentos=j.getIntento();
		assertEquals(intentos,20);	
		
		//Intentos 0 
		j.setIntento(0);
	    intentos=j.getIntento();
		assertEquals(intentos,0);	
		
		//Intentos despues de realizar una jugada
		Juego j2 = new Juego();
		Tablero t2 = new Tablero(5,5,false,10);
		j2.setIntento(10);
		j2.jugar(t2, 3, 3, 5, 5);
		
	    intentos=j2.getIntento();
		
		assertEquals(intentos,9);
		
		System.out.println("FIN TEST INTENTOS");
	}


	@Test
	public void testGetMinas() {
		
		System.out.println("---------------------------------");
		System.out.println("INICIO TEST MINAS");
		// Minas maximas al iniciar la partida 
	    Juego j = new Juego();
		int minas=j.getMinas();
		assertEquals(minas,10);
		
		//Minas entre 10 y 0 realizando jugada
		Tablero t2 = new Tablero(5,5,false,10);
		
		j.jugar(t2, 1, 1, 5, 5);
		
		minas=j.getMinas();
		assertEquals(minas,9);
		
		//Minas despues de realizar una jugada 
		j.jugar(t2, 4, 4, 5, 5);
		
		minas=j.getMinas();
		assertEquals(minas,9);
		System.out.println("FIN TEST MINAS");
		
	}
}
*/
