package MyTestingProject;

import MyTestingProject.Controlador.Buscaminas;
import MyTestingProject.MockView;
import MyTestingProject.MyRandomMock;

import MyTestingProject.Vista.vista;

import org.junit.Test;

public class AutomaticTesting {
	
	@Test
	public void mainTest() {
									//       h              v              x              y
		MockView mv = new MockView(new int[] {8}, new int[]{8}, new int[]{4}, new int[]{4});
		MyRandomMock myrMock = new MyRandomMock();
		Buscaminas game = new Buscaminas(mv, myrMock);
		game.main(null);
		System.out.println("FIN TEST");
	}
}
