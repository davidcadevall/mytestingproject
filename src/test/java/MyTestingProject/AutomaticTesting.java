package MyTestingProject;

import MyTestingProject.Controlador.Buscaminas;
import MyTestingProject.Modelo.Juego;
import MyTestingProject.Modelo.Tablero;
import MyTestingProject.MockView;
import MyTestingProject.MyRandomMock;

import MyTestingProject.Vista.vista;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class AutomaticTesting {

	public void testGame(String fileName) {
		
		String filePath = "./src/test/java/MyTestingProject/";
		String line = null;
		String[] aux;
		int line_id = 0;
		
		int [] horizontal_values = new int[3], vertical_values = new int[3], posX_values = new int[40], posY_values= new int[40];

		boolean expected_won = false;
		int expected_attempts = 0;
		int expected_mines = 0;
		int maxInputs = 0; //to be able to know how many inputs we enter on this play
		
		try {
			FileReader fileReader = new FileReader(filePath + fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while((line = bufferedReader.readLine()) != null) {
				aux = line.split(";");
				for(int i = 0; i < aux.length; i++) {
					if(line_id == 0)
						horizontal_values[i] = Integer.parseInt(aux[i]);
					if(line_id == 1)
						vertical_values[i] = Integer.parseInt(aux[i]);
					if(line_id == 2) {
						posX_values[i] = Integer.parseInt(aux[i]);
						maxInputs++; //for every coord we read, we know we have to control 1 more input
					}
					if(line_id == 3)
						posY_values[i] = Integer.parseInt(aux[i]);
					if(line_id == 4)
						expected_won = Boolean.parseBoolean(aux[i].toLowerCase());
					if(line_id == 5)
						expected_attempts = Integer.parseInt(aux[i]);
					if(line_id == 6)
						expected_mines = Integer.parseInt(aux[i]);
				}
				line_id++;
			}
			bufferedReader.close();
			fileReader.close();
		}
		catch(IOException ex) {
			System.out.println("Error in file " + fileName);
		}

		MockView mv = new MockView(horizontal_values, vertical_values, posX_values, posY_values);
		MyRandomMock myrMock = new MyRandomMock();
		Tablero t;
		Juego game = new Juego();
		boolean won = false;
		
		int horizontal;
		int vertical;
		
		int createBoardAttempts = 0;
		
		do {
			
			horizontal=mv.getHorizontal();
			vertical=mv.getVertical();
			
			t= new Tablero(horizontal, vertical, myrMock, mv.getMinas());
			
			createBoardAttempts++;
			
		} while(t.getCreated() == false && createBoardAttempts < 3);
		
		if(t.getCreated()) {
		
			System.out.println("\n-x----------------------------------------------------x-");
			System.out.println("  Ingresa las coordenas entre "+horizontal+ " y "+ vertical);
			
			game.setMinas(mv.getMinas());
			game.setIntento(mv.getIntentos());
			int inputs = 0;
			do {
				int x = 0, y = 0;
				
				do{
					System.out.println("\n-x----------------------------------------------------x-");
					System.out.println("\n	Intento :"+game.getIntento()+" , Cual es su coordenada? \n");
					
					x = mv.getPosX();
					
					System.out.println();
					
					y = mv.getPosY();
					
					inputs++;
					
					x = x - 1;
					y = y - 1;
					
					if(x<=0 || y<=0 || x>=horizontal || y>=vertical) {
						game.setIntento(game.getIntento()-1);
						System.out.println("\n	==>Coordenadas incorrectas<== \n");
					}
					else {
						game.jugar(t, x, y,horizontal,vertical);
					}
				} while((x <= 0 || y <= 0 || x > horizontal || y > vertical) && game.getIntento() > 0 && inputs < maxInputs);
				
			} while(game.getIntento() >= mv.getMinas() && game.getIntento() > 0 && game.getMinas() > 0 && inputs < maxInputs);	
   
			if(game.getMinas() == 0) {
				System.out.println("		GANASTE!");
				won = true;
			}
			if(game.getMinas() > game.getIntento()) {
				System.out.println("		PERDISTE!    (Exceso de minas restantes "+game.getMinas()+")\n\n");
				won = false;
			}
			if(game.getIntento() == 0) {
				System.out.println("		PERDISTE!");
				won = false;
			}
		}
		
		// get info of the play result
		assertEquals(expected_won, won);
		assertEquals(expected_attempts, game.getIntento());
		assertEquals(expected_mines, game.getMinas());

		/*
		try {
			File outFile = new File(filePath + fileName + "_OUT.txt");
			if(outFile.createNewFile() == false)
				System.out.println("Output file already exists!");	
		}
		catch(IOException ex) {
			System.out.println("Error creating out file" );
		}
		*/
	}
	
	@Test
	public void test1() {
		String file1 = "automatedGame1.txt";
		testGame(file1);
	}
	
	@Test
	public void test2() {
		String file2 = "automatedGame2.txt";
		testGame(file2);
	}
	
	@Test
	public void test3() {
		String file3 = "automatedGame3.txt";
		testGame(file3);
	}
	
	@Test
	public void test4() {
		String file4 = "automatedGame4.txt";
		testGame(file4);
	}
}
