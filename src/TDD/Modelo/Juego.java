package TDD.Modelo;

import MyTestingProject.Modelo.Tablero;

public class Juego {
	int intento=40;
	int tminas=10;
	public Juego() {}

	public void jugar(Tablero tablero2, int x,int y,int horizontal,int vertical) {
		int nminas=0;
		int tablero[][]=tablero2.getTablero();
		
		if(intento>0) {

	   		if(!hayMina(tablero,x,y)){
	   			System.out.print("\n	Mina no encontrada. ");
	   			nminas=minasAlrededor(tablero,x,y,horizontal,vertical);
	   			   			 
	   			 if(intento>tminas)
	   			 	 System.out.print("	Alrededor hay: "+ nminas);
	   			 System.out.println("\n	Intentos restantes: "+(intento-1));
	   		}
	   		else
	   			{
	   				tminas = tminas-1;
	   				System.out.println("\n	Acertaste!, Mina Eliminada te quedant "+tminas+" minas");
	   				System.out.println("\n	Intentos restantes: "+(intento-1));
	   			}
	   	
	      intento=intento-1;
		
			
		}}
	
	public int getIntento() {
		return intento;
	}
	public int getMinas() {
		return tminas;
	}
	public void setIntento(int intents) {
		intento= intents;
	}
	
	
	public boolean hayMina(int [][]tablero, int x, int y ) {
		
		boolean mina=true;
		if(tablero[x][y]==0){
			mina=false;
		}
		return mina;
	}
	
	public int minasAlrededor(int [][]tablero, int x, int y,int horizontal,int vertical ) {
		
		int nminas=0;
		if (x==0&&y==0){
				if(x+1>=0 && x+1<horizontal && y<vertical)
					nminas=nminas+tablero [x+1][y];
				if(x+1>=0 && x+1<horizontal && y+1<vertical && y+1>=0)
					nminas=nminas+tablero [x+1][y+1];
				if(x>=0 && x<horizontal && y+1<vertical && y+1>= 0)
					nminas=nminas+tablero [x][y+1];
			}
			else {
				if(y==0){
					if(x+1>=0 && x+1<horizontal && y<vertical)
						nminas=nminas+tablero [x+1][y];
					if(x-1>=0 && x-1<horizontal && y<vertical)
						nminas=nminas+tablero [x-1][y];
					if(x-1>=0 && x-1<horizontal && y+1<vertical && y+1>=0)
						nminas=nminas+tablero [x-1][y+1];
					if(x>=0 && x<horizontal && y+1<vertical && y+1>= 0)
						nminas=nminas+tablero [x][y+1];
					if(x+1>=0 && x+1<horizontal && y+1<vertical && y+1>=0)
						nminas=nminas+tablero [x+1][y+1];
					
				}
				
				else{
				
					if(x-1>=0 && x-1<horizontal && y-1<vertical)
						nminas=nminas+tablero [x-1][y-1];
					if(x>=0 && x<horizontal && y-1<vertical)
						nminas=nminas+tablero [x][y-1];
					if(x+1>=0 && x+1<horizontal && y-1<vertical)
						nminas=nminas+tablero [x+1][y-1];
					if(x+1>=0 && x+1<horizontal && y<vertical)
						nminas=nminas+tablero [x+1][y];
					if(x-1>=0 && x-1<horizontal && y<vertical)
						nminas=nminas+tablero [x-1][y];
					if(x-1>=0 && x-1<horizontal && y+1<vertical && y+1>=0)
						nminas=nminas+tablero [x-1][y+1];
					if(x>=0 && x<horizontal && y+1<vertical && y+1>= 0)
						nminas=nminas+tablero [x][y+1];
					if(x+1>=0 && x+1<horizontal && y+1<vertical && y+1>=0)
						nminas=nminas+tablero [x+1][y+1];
					}
			 }
	
		return nminas;
	}
	
	
	
}