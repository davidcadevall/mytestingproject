package MyTestingProject;

import static org.junit.Assert.*;

import org.junit.Test;

import MyTestingProject.Controlador.Buscaminas;
import MyTestingProject.Modelo.Tablero;

public class BuscaminasTest {

	@Test
	public void testMain() {
		
		/// TEST PIERDE 
		MockVista prueba=new MockVista();
		Buscaminas juego=new Buscaminas(prueba);
		String[] argss=null;
		Buscaminas.main(argss);
		Tablero test=juego.getTablero();
		
		assertEquals("Tiene que salir 9",9,test.getHorizontal());
		assertEquals("Tiene que salir 9",9,test.getVertical());
		
		
		
	}

}
