/*
package MyTestingProject;


import static org.junit.Assert.*;

import org.junit.Test;

import MyTestingProject.Modelo.Juego;
import MyTestingProject.Modelo.JuegoTDD;
import MyTestingProject.Modelo.Tablero;
import MyTestingProject.Modelo.TableroTDD;

public class JuegoTDDTest {


	@Test
	public void testJugar() {
		
		Juego j = new Juego();
		Tablero t = new Tablero(8,8,false,10);
		
		System.out.println("---------------------------------");
		System.out.println("INICIO TEST JUGAR");
		System.out.println("NO ALEATORIO");
		//NO ALEATORIO
				System.out.print(" Test tiene que salir bomba");
				j.jugar(t, 1, 1, 8, 8);
		
	
				System.out.print(" Test no tiene que salir bomba, 3 alrededor");
				j.jugar(t, 2, 3, 5, 5);
				
				System.out.print(" Test no tiene que salir bomba, 0 alrededor");
				j.jugar(t, 4, 4, 5, 5);
				System.out.println("ALEATORIO");
				//ALEATORIO 
				Juego j2 = new Juego();
				Tablero t2 = new Tablero(5,5,false,10);
				System.out.println(" CASO x=0 y=2");
				// CASO 0 2
				j2.jugar(t2, 0, 2, 5, 5);
				
				// CAMBIANDO LOS INTENTOS
				j2.setIntento(3);
				// CAMBIANDO LAS MINAS
				j2.setMinas(3);
				System.out.println(" CASO x=1 y=1");
				// CASO 0 0 
				j2.jugar(t2, 1, 1, 5, 5);
				System.out.println(" Deberia salir quedan 2 minas");
				
				System.out.println(" CASO x=3 y=0");
				// CASO  3 0 
				j2.jugar(t2, 3, 0, 5, 5);
				
				System.out.println(" CASO x=3 y=3");
				// CASO  3 3 
				j2.jugar(t2, 3,3, 5, 5);
				
				System.out.println(" Test no hay intento, no printa nada");
				
				j2.jugar(t2, 3, 4, 5, 5);
	}

	@Test
	public void testGetIntento() {
		System.out.println("---------------------------------");
		System.out.println("INICIO TEST INTENTOS");
		
		JuegoTDD j = new JuegoTDD();
		int intentos=j.getIntento();
		
		assertEquals(intentos,40);	
		// Intentos entre 40 y 0 
		j.setIntento(30);
		intentos=j.getIntento();
		assertEquals(intentos,30);	
		
		//Intentos 0 
		j.setIntento(0);
	    intentos=j.getIntento();
		assertEquals(intentos,0);	
		//Intentos despues de realizar una jugada
		JuegoTDD j2 = new JuegoTDD();
		TableroTDD t2 = new TableroTDD(5,5,false,10);
		j2.setIntento(11);
		j2.jugar(t2, 3, 4, 5, 5);
		
	    intentos=j2.getIntento();
		
		assertEquals(intentos,10);
		
		System.out.println("FIN TEST INTENTOS");
	}

	@Test
	public void testGetMinas() {
		System.out.println("---------------------------------");
		System.out.println("INICIO TEST GETMINAS");
	   JuegoTDD j = new JuegoTDD();
	//MINAS MAXIMAS AL INICIAR PARTIDA
		int minas=j.getMinas();
		assertEquals(minas,10);
		// MINAS ENTRE 10 y 0
		TableroTDD t2 = new TableroTDD(5,5,false,10);
		
		j.jugar(t2, 1, 1, 5, 5);
		
		minas=j.getMinas();
		assertEquals(minas,10);
		// MINAS DESPU�S DE JUGADA
		
		j.jugar(t2, 4, 4, 5, 5);
		
		minas=j.getMinas();
		assertEquals(minas,9);
		
	
		
		System.out.println("FIN TEST GETMINAS");
	}


	@Test
	public void testHayMina() {
		System.out.println("---------------------------------");
		System.out.println("INICIO TEST HAY MINA");
		boolean haymina=true;
		   // HAY MINA
		JuegoTDD j = new JuegoTDD();
		TableroTDD t2 = new TableroTDD(5,5,false,10);
		haymina=j.hayMina(t2.getTablero(), 0, 0);
		
		assertEquals(haymina,true);
		   // NO HAY MINA
		
		haymina=j.hayMina(t2.getTablero(), 4, 2);
		
		assertEquals(haymina,false);
		System.out.println("FIN TEST HAY MINA");
		
	}

	@Test
	public void testMinasAlrededor() {
		System.out.println("---------------------------------");
		System.out.println("INICIO TEST MINAS ALREDEDOR");
		JuegoTDD j = new JuegoTDD();
		
		
		TableroTDD t2 = new TableroTDD(5,5,false,10);
		// VALOR MINIMO
		// CASO X=0 Y=0 tiene 3 minas alrededor
		j.minasAlrededor(t2.getTablero(),0, 0, 5, 5);
		// CASO X=0 Y=0 tiene 0 minas alrededor
		j.minasAlrededor(t2.getTablero(),0, 4, 5, 5);
		// CASO X=4 Y=2 tiene 0 mina alrededor
		j.minasAlrededor(t2.getTablero(),4, 2, 5, 5);
		 // VALOR INTERMEDIO
		// CASO X=2 Y=0 tiene 2 mina alrededor
		j.minasAlrededor(t2.getTablero(),2, 0, 5, 5);
		// CASO X=1 Y=0 tiene 3 minas alrededor
		j.minasAlrededor(t2.getTablero(),1, 0, 5, 5);
		
		// VALOR MAXIMO 
		j.minasAlrededor(t2.getTablero(),4, 4, 5, 5);
		
		
		System.out.println("FIN TEST MINAS ALREDEDOR");
		
	}

}

*/
