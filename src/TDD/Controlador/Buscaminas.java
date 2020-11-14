package MyTestingProject.Controlador;

import java.util.Scanner;

import MyTestingProject.Modelo.Juego;
import MyTestingProject.Modelo.Tablero;
import MyTestingProject.Vista.vistaI;
import MyTestingProject.Vista.vista;

public class Buscaminas{
	public static Tablero t;
	public static vistaI vista;
	public Buscaminas(vistaI view) {
		vista=view;
	}
	public Tablero getTablero() {return t;}
	
	public static void main(String[] args){
		try (Scanner leer = new Scanner (System.in)) {
			int horizontal;
			int vertical;
		
			if(vista==null)
				vista=new vista();
			
			do {
				horizontal=vista.getHorizontal();
				vertical=vista.getVertical();
				t= new Tablero(horizontal,vertical,vista.getAleatorio());
				
			}while(t.getCreated()==false);
			
		
				System.out.println("\n-x----------------------------------------------------x-");
			   	System.out.println("  Ingresa las coordenas entre "+horizontal+ " y "+ vertical);
			   	Juego juego=new Juego();
			   	do {
			   		
			   		empezarJuego(horizontal,vertical,juego);
			   	
			   		
			
			  }while (juego.getIntento()>=juego.getMinas() && juego.getIntento()>0 && juego.getMinas()>0);	
			   compruebaGanador(juego);
			 
			}
		
       
		
		
 	   }
	
	public static void compruebaGanador(Juego juego) {
	  	if(juego.getMinas()==0)
	   		System.out.println("		GANASTE!");
	   	
	   	if(juego.getMinas()>juego.getIntento())
	   		System.out.println("		PERDISTE!    (Exceso de minas restantes "+juego.getMinas()+")\n\n");
	   	
	   	if(juego.getIntento()==0)
	   		System.out.println("		PERDISTE!");
		
	}
	
	
	public static void empezarJuego(int horizontal,int vertical,Juego juego) {
		
		int x=0,y=0;
		
   		do{
   			 System.out.println("\n-x----------------------------------------------------x-");
   			 System.out.println("\n	Intento :"+juego.getIntento()+" , Cual es su coordenada? \n");
   			 x=vista.getPosX();
   			 System.out.println();
   			 y=vista.getPosY();
   			x=x-1;
   	   		y=y-1;
   			 
   			 if(x<=0 || y<=0 || x>horizontal || y>vertical)
   			 	System.out.println("\n	==>Coordenadas incorrectas<== \n");
   			 else
   				 juego.jugar(t, x, y,horizontal,vertical);
   		}while (x<=0 || y<=0 || x>horizontal || y>vertical);
   		
   	
   		
   		
	}
	
	
	

}