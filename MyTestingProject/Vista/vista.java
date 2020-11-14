package MyTestingProject.Vista;

import java.util.Scanner;
public class vista implements vistaI{
	Scanner leer = new Scanner (System.in);
	@Override
	public int getHorizontal() {
		int horizontal;
		System.out.println("  Ingresa tamaño tablero horizontal, valor máximo 999, valor mínimo 3");
		horizontal=leer.nextInt();
		return horizontal;
	}

	@Override
	public int getVertical() {
		int vertical;
		System.out.println("  Ingresa tamaño tablero vertical, valor máximo 999,valor mínimo 3");
		vertical=leer.nextInt();
		return vertical;
	}
	

}
