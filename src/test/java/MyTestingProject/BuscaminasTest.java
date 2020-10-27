package MyTestingProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuscaminasTest {

	@Test
	public void testcoorvalidas() {
		
		
		Buscaminas SC = new Buscaminas();
		//PRUEBA DIAS 
		boolean res1=SC.coorvalidas(3,3,3,3);
		assertEquals(res1,true);
		
	}

}
