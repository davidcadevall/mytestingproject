package MyTestingProject;

import MyTestingProject.Vista.vistaI;

public class MockVista implements vistaI{
	int posx=3;
	int posy=3;
	int intentos=3;
	int horizontal=9;
	int vertical=9;

	@Override
	public int getHorizontal() {
		// TODO Auto-generated method stub
		return horizontal;
	}

	@Override
	public int getVertical() {
		// TODO Auto-generated method stub
		return vertical;
	}

	@Override
	public int getPosX() {
		// TODO Auto-generated method stub
		return posx;
	}

	@Override
	public int getPosY() {
		// TODO Auto-generated method stub
		return posy;
	}

	@Override
	public boolean getAleatorio() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getMinas() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void setPosX(int x) {
		
		posx=x;
		
	}

	@Override
	public void setposY(int y) {
		posy=y;
		
	}

	@Override
	public int getIntentos() {
		// TODO Auto-generated method stub
		
		return intentos;
	}

	@Override
	public void setIntentos(int intentosx) {
		// TODO Auto-generated method stub
		intentos=intentosx;
		
	}

	@Override
	public void setVertical(int ver) {
		vertical=ver;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHorizontal(int hor) {
		// TODO Auto-generated method stub
		horizontal=hor;
		
	}


	
}
