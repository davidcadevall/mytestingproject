/*package MyTestingProject;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MyTestingProject.Modelo.Tablero;

public class TableroTest {
	

	@Test
	public void testTablero() {
		//Assert de created 
		System.out.println(" ---------------------------------------- ");
		System.out.println(" INICIO TEST TABLERO ");
		
		//Probando maximos 
		Tablero t = new Tablero(99,5,true,1);
	    t = new Tablero(5,99,true,1);
	    t= new Tablero(99,99,true,10);
	    
	    //Probando minimos 
	    t = new Tablero(3,3,true,10);
	    
	    // Valores erroneos 
	    t = new Tablero(0,3,true,10);
	    
	    t= new Tablero(-3,-3,true,10);
	    
	    t= new Tablero(-3,3,true,10);
	    
	    t= new Tablero(3,-3,true,10);    
	    
	  //Probando correctos 
	    t= new Tablero(5,5,true,10);   
	}


	@Test
	public void testGetHorizontal() {
		
		System.out.println(" ---------------------------------------- ");
		System.out.println(" INICIO TEST GET HORIZONTAL ");
		Tablero t = new Tablero(7,6,true,10);
		int res_o=t.getHorizontal();
		assertEquals(res_o,7);
	}

	@Test
	public void testGetVertical() {
		System.out.println(" ---------------------------------------- ");
		System.out.println(" INICIO TEST GET VERTICAL ");
		Tablero t = new Tablero(8,6,true,10);
		int res_o=t.getVertical();
		assertEquals(res_o,6);
	}
	@Test
	public void testGetCreated() {
		System.out.println(" ---------------------------------------- ");
		System.out.println(" INICIO TEST GETCREATED ");
		// CREA TABLERO
		Tablero t = new Tablero(6,6,true,10);
		boolean res_o=t.getCreated();
		assertEquals(res_o,true);
		// NO CREA TABLERO
        t = new Tablero(0,0,true,10);
		res_o=t.getCreated();
		assertEquals(res_o,false);
	}

	

	
}
*/