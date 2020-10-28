package MyTestingProject;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

public class Buscaminas{
	
	public static void main(String[] args){
		Scanner leer = new Scanner (System.in);
		Tablero t= new Tablero();
     
       	System.out.println("\n-x----------------------------------------------------x-");
       	System.out.println("  Ingresa las coordenas entre "+8+ " y "+ 8);
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
       			 
       			 if(x==0 || y==0 || x>8 || y>8)
       			 	System.out.println("\n	==>Coordenadas incorrectas<== \n");
       			 else
       				 juego.jugar(t, x, y);
       		}while (x==0 || y==0 || x>8 || y>8);
       		
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