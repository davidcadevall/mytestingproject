package MyTestingProject;

import static org.junit.Assert.*;

import org.junit.Test;

import MyTestingProject.Modelo.TableroTDD;

public class TableroTDDTest {

	@Test
	public void testTableroTDD() {
		System.out.println(" ---------------------------------------- ");
		System.out.println(" INICIO TEST TABLERO TDD");
	
	
		
		//Probando maximos 
		TableroTDD t = new TableroTDD(99,5,true,1);
	    t = new TableroTDD(5,99,true,1);
	    t= new TableroTDD(99,99,true,10);
	    
	    //Probando minimos 
	    t = new TableroTDD(3,3,true,10);
	    
	    // Valores erroneos 
	    t = new TableroTDD(-1,3,true,10);
	    
	    t= new TableroTDD(-5,-5,true,10);
	    
	    t= new TableroTDD(2,-3,true,10);
	    
	    t= new TableroTDD(-3,3,true,10);    
	    
	  //Probando correctos 
	    t= new TableroTDD(6,6,true,10);  
	}

	@Test
	public void testGetTablero() {
		System.out.println(" ---------------------------------------- ");
		System.out.println(" INICIO TEST GET HORIZONTAL TDD");
		TableroTDD t = new TableroTDD(9,6,true,10);
		t.getTablero();
		TableroTDD t2= new TableroTDD(2,2,true,10);
		t.getTablero();
		
	}

	@Test
	public void testGetHorizontal() {
		System.out.println(" ---------------------------------------- ");
		System.out.println(" INICIO TEST GET HORIZONTAL TDD");
		TableroTDD t = new TableroTDD(9,6,true,10);
		int res_o=t.getHorizontal();
		assertEquals(res_o,9);
	}

	@Test
	public void testGetVertical() {
		System.out.println(" ---------------------------------------- ");
		System.out.println(" INICIO TEST GET VERTICAL TDD");
		TableroTDD t = new TableroTDD(8,7,true,10);
		int res_o=t.getVertical();
		assertEquals(res_o,7);
	}

	@Test
	public void testGetCreated() {
		System.out.println(" ---------------------------------------- ");
		System.out.println(" INICIO TEST GETCREATED TDD");
		// CREA TABLERO
		TableroTDD t = new TableroTDD(7,7,true,10);
		boolean res_o=t.getCreated();
		assertEquals(res_o,true);
		// NO CREA TABLERO 
        t = new TableroTDD(-1,-1,true,10);
		res_o=t.getCreated();
		assertEquals(res_o,false);
	}

	@Test
	public void testLlenarTablero() {
		System.out.println(" ---------------------------------------- ");
		System.out.println(" INICIO TEST LLENAR TABLERO TDD");
		// CREA TABLERO FIJO 
		TableroTDD t = new TableroTDD(7,7,false,10);
		
		// CREA TABLERO ALEATORIO 
		TableroTDD t2 = new TableroTDD(7,7,true,10);
		
	}

}
