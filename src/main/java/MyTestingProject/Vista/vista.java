package MyTestingProject.Vista;

import java.util.Scanner;
public class vista implements vistaI{
	Scanner leer = new Scanner (System.in);
	@Override
	public int getHorizontal() {
		int horizontal;
		System.out.println("  Ingresa valor tablero horizontal, valor máximo 99, valor mínimo 3");
		horizontal=leer.nextInt();
		return horizontal;
	}

	@Override
	public int getVertical() {
		int vertical;
		System.out.println("  Ingresa valor tablero vertical, valor máximo 99,valor mínimo 3");
		vertical=leer.nextInt();
		return vertical;
	}

	@Override
	public int getPosX() {
		int horizontal;
		System.out.println("Fila: ");
		horizontal=leer.nextInt();
		return horizontal;
	}

	@Override
	public int getPosY() {
		int vertical;
		System.out.println(" Columna:");
		vertical=leer.nextInt();
		return vertical;
	}

	@Override
	public boolean getAleatorio() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getMinas() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public void setPosX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setposY(int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getIntentos() {
		// TODO Auto-generated method stub
		return 40;
	}

	@Override
	public void setIntentos(int intentosx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVertical(int ver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHorizontal(int hor) {
		// TODO Auto-generated method stub
		
	}

	
	
	


}
