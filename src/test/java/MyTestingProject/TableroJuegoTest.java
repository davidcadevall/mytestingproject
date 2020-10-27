package MyTestingProject;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TableroJuegoTest {


	@Test
	public void testDentroTablero() throws NumberFormatException, IOException {
		
		TableroJuego tablero = new TableroJuego(3,3,3);
		
		boolean res1=tablero.dentroTablero(3, 3);
		assertEquals(res1,true);
			}




}
