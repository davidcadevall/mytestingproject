package MyTestingProject.Controlador;

import java.util.Scanner;

import MyTestingProject.Modelo.Juego;
import MyTestingProject.Modelo.Tablero;
import MyTestingProject.Vista.vistaI;
import MyTestingProject.Vista.vista;
import MyTestingProject.Modelo.MyRandom;

public class Buscaminas{
	public static Tablero t;
	public static vistaI vista;
	public static Juego juego;
	private static MyRandom _myr;

	public Buscaminas(vistaI view) {
		vista=view;
	}
	
	public Buscaminas(vistaI view, MyRandom myr) {
		vista=view;
		_myr = myr;
	}
	
	public Tablero getTablero() {return t;}
	
	public static void main(String[] args){
		try (Scanner leer = new Scanner (System.in)) {
			int horizontal;
			int vertical;
			int veces=0;
			if(vista==null)
				vista=new vista();
			
			if(_myr == null) {
				_myr = new MyRandom();
			}
			
			do {
				horizontal=vista.getHorizontal();
				vertical=vista.getVertical();
				t= new Tablero(horizontal, vertical, _myr, vista.getMinas());
				veces++;
			}while(t.getCreated()==false && veces <3);
			
			if(t.getCreated()) {
				

				System.out.println("\n-x----------------------------------------------------x-");
			   	System.out.println("  Ingresa las coordenas entre "+horizontal+ " y "+ vertical);
			   	juego=new Juego();
			  
			   	juego.setMinas(vista.getMinas());
			   	juego.setIntento(vista.getIntentos());
			   	do {
			   		int x=0,y=0;
			   	
			   		
			   		do{
			   			 System.out.println("\n-x----------------------------------------------------x-");
			   			 System.out.println("\n	Intento :"+juego.getIntento()+" , Cual es su coordenada? \n");
			   			 x=vista.getPosX();
			   			 System.out.println();
			   			 y=vista.getPosY();
			   			x=x-1;
				   		y=y-1;
			   			 
			   			 if(x<=0 || y<=0 || x>=horizontal || y>=vertical) {
			   				juego.setIntento(juego.getIntento()-1);
			   			 	System.out.println("\n	==>Coordenadas incorrectas<== \n");
			   			 }else {
			   				 juego.jugar(t, x, y,horizontal,vertical);}
			   		}while ((x<=0 || y<=0 || x>horizontal || y>vertical)&&juego.getIntento()>0);
			   		
			   		
			   			
			   		
			
			  }while (juego.getIntento()>=vista.getMinas() && juego.getIntento()>0 && juego.getMinas()>0);	
			   
			   	if(juego.getMinas()==0)
			   		System.out.println("		GANASTE!");
			   	
			   	if(juego.getMinas()>juego.getIntento())
			   		System.out.println("		PERDISTE!    (Exceso de minas restantes "+juego.getMinas()+")\n\n");
			   	
			   	if(juego.getIntento()==0)
			   		System.out.println("		PERDISTE!");
			   	
			}
		
			}
		
       
		
		
 	   }
	
	
	

}