package MyTestingProject.Controlador;

import java.util.Scanner;

import MyTestingProject.Modelo.Juego;
import MyTestingProject.Modelo.Tablero;
import MyTestingProject.Vista.vistaI;
import MyTestingProject.Vista.vista;

public class Buscaminas{
	public static Tablero tablero;
	public static vistaI vista;
	public Buscaminas(vistaI view) {
		vista=view;
	}
	public Tablero getTablero() {return tablero;}
	
	public static void main(String[] args){
		try (Scanner leer = new Scanner (System.in)) {
			int horizontal;
			int vertical;
			Tablero t= new Tablero();
			if(vista==null) {
				vista=new vista();
			}
			do {
				horizontal=vista.getHorizontal();
				vertical=vista.getVertical();
				t= new Tablero(horizontal,vertical,true);
				
			}while(t.getCreated()==false);
			
		
				System.out.println("\n-x----------------------------------------------------x-");
			   	System.out.println("  Ingresa las coordenas entre "+horizontal+ " y "+ vertical);
			   	Juego juego=new Juego();
			   	do {
			   		int x=0,y=0;
			   	
			   		
			   		do{
			   			 System.out.println("\n-x----------------------------------------------------x-");
			   			 System.out.println("\n	Intento :"+juego.getIntento()+" , Cual es su coordenada? \n");
			   			 System.out.print("		Fila:  ");
			   			 x=leer.nextInt();
			   			 System.out.println();
			   			 System.out.print("		Columna:  ");
			   			 y=leer.nextInt();
			   			 
			   			 if(x==0 || y==0 || x>horizontal || y>vertical)
			   			 	System.out.println("\n	==>Coordenadas incorrectas<== \n");
			   			 else
			   				 juego.jugar(t, x, y,horizontal,vertical);
			   		}while (x==0 || y==0 || x>horizontal || y>vertical);
			   		
			   		x=x-1;
			   		y=y-1;
			   		
			
			  }while (juego.getIntento()>=juego.getMinas() && juego.getIntento()>0 && juego.getMinas()>0);	
			   
			   	if(juego.getMinas()==0)
			   		System.out.println("		GANASTE!");
			   	
			   	if(juego.getMinas()>juego.getIntento())
			   		System.out.println("		PERDISTE!    (Exceso de minas restantes "+juego.getMinas()+")\n\n");
			   	
			   	if(juego.getIntento()==0)
			   		System.out.println("		PERDISTE!");
			}
		
       
		
		
 	   }
	
	
	
	

}