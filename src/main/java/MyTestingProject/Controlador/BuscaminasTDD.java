package MyTestingProject.Controlador;

import java.util.Scanner;

import MyTestingProject.Modelo.JuegoTDD;

import MyTestingProject.Modelo.TableroTDD;
import MyTestingProject.Vista.vistaI;
import MyTestingProject.Vista.vistaITDD;
import MyTestingProject.Vista.vistaTDD;
import MyTestingProject.Vista.vista;

public class BuscaminasTDD{
	public static TableroTDD t;
	public static vistaITDD vista;
	public static JuegoTDD juego;
	public BuscaminasTDD(vistaITDD view) {
		vista=view;
	}
	public TableroTDD getTablero() {return t;}
	
	public static void main(String[] args){
		try (Scanner leer = new Scanner (System.in)) {
			int horizontal;
			int vertical;
			int veces=0;
		
			if(vista==null)
				vista=new vistaTDD();
			
			do {
				horizontal=vista.getHorizontal();
				vertical=vista.getVertical();
				t= new TableroTDD(horizontal,vertical,vista.getAleatorio(),vista.getMinas());
				veces++;
			}while(t.getCreated()==false&& veces <3);
			
		
				System.out.println("\n-x----------------------------------------------------x-");
			   	System.out.println("  Ingresa las coordenas entre "+horizontal+ " y "+ vertical);
			   	juego=new JuegoTDD();
			   	juego.setMinas(vista.getMinas());
			   	juego.setIntento(vista.getIntentos());
			   	
			   	do {
			   		
			   		empezarJuego(horizontal,vertical,juego);
			   	
			   		
			
			  }while (juego.getIntento()>=juego.getMinas() && juego.getIntento()>0 && juego.getMinas()>0);	
			   compruebaGanador(juego);
			 
			}
		
       
		
		
 	   }
	
	public static void compruebaGanador(JuegoTDD juego) {
	  	if(juego.getMinas()==0)
	   		System.out.println("		GANASTE!");
	  	else
	  		if(juego.getIntento()==0)
  				System.out.println("		PERDISTE!");
	  			else
	  				if(juego.getMinas()>juego.getIntento())
	  		  			System.out.println("		PERDISTE!    (Exceso de minas restantes "+juego.getMinas()+")\n\n");
	  		  	
	  		
	}
	
	
	public static void empezarJuego(int horizontal,int vertical,JuegoTDD juego) {
		
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
   		
   	
   		
   		
	}
	
	
	

}