package MyTestingProject;

import MyTestingProject.Vista.vista;

public class MockView extends vista {

	private int[] horizontal_values; // [ 0, 1, 2, 3, 4 ]
	private int horizontal_cursor;  //       ^

	private int[] vertical_values;
	private int vertical_cursor;

	private int[] posX_values;
	private int posX_cursor;

	private int[] posY_values;
	private int posY_cursor;
	
	public MockView(int[] input_horizontal, int[] input_vertical, int[] input_posX, int[] input_posY) { 
		this.horizontal_values = input_horizontal;
		this.horizontal_cursor = 0;
		
		this.vertical_values = input_vertical;
		this.vertical_cursor = 0;
		
		this.posX_values = input_posX;
		this.posX_cursor = 0;
		
		this.posY_values = input_posY;
		this.posY_cursor = 0;
	}

	@Override
	public int getHorizontal() {
		System.out.println("  Ingresa valor tablero horizontal, valor m�ximo 99, valor m�nimo 3");
		int ret = horizontal_values[horizontal_cursor];
		System.out.println(ret);
		this.horizontal_cursor++;
		return ret;
	}

	@Override
	public int getVertical() {
		System.out.println("  Ingresa valor tablero vertical, valor m�ximo 99,valor m�nimo 3");
		int ret = vertical_values[vertical_cursor];
		System.out.println(ret);
		this.vertical_cursor++;
		return ret;
	}

	@Override
	public int getPosX() {
		int ret = posX_values[posX_cursor];
		System.out.println(ret);
		this.posX_cursor++;
		return ret;
	}

	@Override
	public int getPosY() {
		int ret = posY_values[posY_cursor];
		System.out.println(ret);
		this.posY_cursor++;
		return ret;
	}

	@Override
	public boolean getAleatorio() {
		return false;
	}

	@Override
	public int getMinas() {
		return 10; // ????? it makes no sense to ask to the view how many mines do you have
	}

	@Override
	public void setPosX(int x) {
		
	}

	@Override
	public void setposY(int y) {

	}

	@Override
	public int getIntentos() {
		return 40; // ????? it makes no sense to ask to the view how many attempts do you have
	}

	@Override
	public void setIntentos(int intentosx) {

	}

	@Override
	public void setVertical(int ver) {

	}

	@Override
	public void setHorizontal(int hor) {

	}
}
