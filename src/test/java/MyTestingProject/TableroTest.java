package MyTestingProject;

import static org.junit.Assert.*;

import org.junit.Test;

import MyTestingProject.Modelo.Tablero;

public class TableroTest {
	public static final int   MAX_VALUE = 0x7fffffff;

	@Test
	public void testTablero() {
		//Assert de created 
		
		//Probando maximos 
		Tablero t = new Tablero(MAX_VALUE,5);
	    t = new Tablero(5,MAX_VALUE);
	    t= new Tablero(99,99);
	    //Probando minimos 
	    t = new Tablero(0,3);
	    t= new Tablero(-3,-3);
	    t= new Tablero(-3,3);
	    t= new Tablero(3,-3);
	
	    
		
	}


	@Test
	public void testGetHorizontal() {
		
		
		Tablero t = new Tablero(4,5);
		int res_o=t.getHorizontal();
		assertEquals(res_o,4);
	}

	@Test
	public void testGetVertical() {
		Tablero t = new Tablero(3,5);
		int res_o=t.getVertical();
		assertEquals(res_o,5);
	}
	//Se puede unificar con el primer test 
	@Test
	public void testGetCreated() {
		Tablero t = new Tablero(3,5);
		boolean res_o=t.getCreated();
		assertEquals(res_o,true);
        t = new Tablero(0,0);
		res_o=t.getCreated();
		assertEquals(res_o,false);
	}

	
	//Añadir también el test de "getTablero"
	
	//Hasta que el q user no pasa los valores borrar el test vacio 
	
}
